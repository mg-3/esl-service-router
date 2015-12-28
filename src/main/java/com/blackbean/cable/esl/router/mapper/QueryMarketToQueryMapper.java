package com.blackbean.cable.esl.router.mapper;

import com.blackbean.cable.esl.router.model.jaxb14_08.*;
import com.blackbean.cable.esl.router.model.rest.markets.query.*;
import com.google.common.collect.Lists;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.stereotype.Component;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Function;

/**
 * @author Mike Garcia
 *         Date: 12/3/2015
 *         esl-service-router
 */
@Component
public class QueryMarketToQueryMapper<
        A extends QueryMarketResponseType,
        B extends MarketsQueryRespose>
        extends CustomMapper<A, B> {

    @Override
    public void mapAtoB(A src, B dest, MappingContext ctx) {
        super.mapAtoB(src, dest, ctx);
        List<MarketReferenceType> marketRefs = src.getMarketReference().getValue().getMarketReferenceType();
        List<Market> markets = Lists.newArrayListWithCapacity(marketRefs.size());

        marketRefs.forEach(marketRef -> {
                    String glCode = marketRef.getGlCode();
                    long marketId = marketRef.getMarketID();
                    String marketName = marketRef.getMarketName();
                    String legacyMarketType = marketRef.getLegacyMarketType();
                    long parentMarketId = marketRef.getParentMarketID();
                    MarketCapabilitiesType capabilities = marketRef.getMarketCapabilities();
                    List<String> capabilityNames = capabilities.getCapabilityName().getString();
                    Capabilities capabs = null;
                    try {
                        capabs = matchNameToCapability(capabilityNames);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    LegacyMarketIDType legacyMarketId = marketRef.getLegacyMarketID().getValue();
                    String company = legacyMarketId.getLegacyMarketIDSource().value();
                    CSGLegacyMarketType csgMarketId = legacyMarketId.getCSGMarketID().getValue();
                    String csgAgent = csgMarketId.getAgent();
                    String csgSystem = csgMarketId.getCSGSystem();
                    String csgPrinciple = csgMarketId.getPrinciple();

                    Market market = new Market();
                    market.setGlcode(glCode);
                    market.setId(marketId);
                    market.setName(marketName);
                    market.setConsumerName(marketName);
                    market.setParent(parentMarketId);
                    market.setCompany(company);
                    market.setLegacyMarketType(legacyMarketType);

                    LegacyMarketId legacyMarket = new LegacyMarketId();
                    CsgMarket csgMarket = new CsgMarket();
                    csgMarket.withAgent(csgAgent)
                            .withPrinciple(csgPrinciple)
                            .withSystem(csgSystem);
                    legacyMarket.withSource(legacyMarketType)
                            .withCsgMarket(csgMarket);
                    market.setLegacyMarketId(legacyMarket);
                    market.setCapabilities(capabs);
                    markets.add(market);
                }
        );

        dest.setMarkets(markets);
    }

    private Capabilities matchNameToCapability(List<String> marketNames) throws IntrospectionException, InvocationTargetException, IllegalAccessException {

        Capabilities capabilities = new Capabilities();
        BeanInfo beanInfo = Introspector.getBeanInfo(Capabilities.class, Object.class);
        PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();

        Function<String, Method> setters = name -> {
            for (PropertyDescriptor pd : pds) {
                Method setter = pd.getWriteMethod();
                if (setter == null) {
                    continue;
                }
                String methodName = setter.getName();
                if (methodName.matches("(?i).*?" + name + ".*")) {
                    return setter;
                } else {
                    continue;
                }
            }
            return null;
        };

        Function<Capabilities, String> unsetFields = c -> {
            for (PropertyDescriptor pd : pds) {
                Method getter = pd.getReadMethod();
                Method setter = pd.getWriteMethod();
                if (getter != null && setter != null) {
                    try {
                        Object value = getter.invoke(c, new Object[]{});
                        if (value == null) {
                            setter.invoke(c, new Object[]{"N"});
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            return null;
        };

        for (String name : marketNames) {
            Method methodObj = setters.apply(name);
            methodObj.invoke(capabilities, new Object[]{"Y"});
        }
        unsetFields.apply(capabilities);
        return capabilities;
    }
}
