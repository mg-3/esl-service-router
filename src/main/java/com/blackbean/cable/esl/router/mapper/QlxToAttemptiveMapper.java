package com.blackbean.cable.esl.router.mapper;

import com.blackbean.cable.esl.router.model.jaxb14_08.QueryAddressResponseType;
import com.blackbean.cable.esl.router.model.jaxb14_08.QueryLocationXfinityResponseType;
import com.blackbean.cable.esl.router.model.rest.cc.CSGLegacyMarketType;
import com.blackbean.cable.esl.router.model.rest.location.query.*;
import com.google.common.collect.Lists;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mike Garcia
 *         Date: 10/8/2015
 *         geocoder-service
 */
@Component
public class QlxToAttemptiveMapper<
        A extends QueryLocationXfinityResponseType,
        B extends QueryAttemptiveResponse>
        extends CustomMapper<A, B> {

    @Override
    public void mapAtoB(A src, B dest, MappingContext ctx) {
        super.mapAtoB(src, dest, ctx);
        List<QueryAddressResponseType> addressResponses = src.getLocationSummary().getQueryAddressResponseType();

        List<Address> addresses = Lists.newArrayList();
        for (QueryAddressResponseType qart : addressResponses) {
            dest.setAddresses(addresses);
            Address address = new Address();
            address.setAddress(qart.getLocationReference().getStreetAddress1());
            address.setAddressID((int) qart.getLocationReference().getLocationID());
            address.setFraudIndicator(qart.getLocationReference().getFraudIndicator());
            address.setLat(qart.getLocationReference().getLatitude().doubleValue());
            address.setLon(qart.getLocationReference().getLongitude().doubleValue());
            com.blackbean.cable.esl.router.model.rest.location.query.Component component = new com.blackbean.cable.esl.router.model.rest.location.query.Component();
            component.setAddressLine1(qart.getLocationReference().getStreetAddress1());
            component.setAddressLine2(qart.getLocationReference().getStreetAddress2());
            component.setCity(qart.getLocationReference().getCity());
            component.setState(qart.getLocationReference().getState().getValue());
            component.setZip4(qart.getLocationReference().getZipCode().getZip4().getValue());
            component.setZip5(qart.getLocationReference().getZipCode().getZip5());
            address.setComponent(component);
            MarketInfo marketInfo = new MarketInfo();
            marketInfo.setMarketId(qart.getLocationReference().getMarketID().intValue());
            marketInfo.setMarketName(qart.getLocationReference().getMarketName());
            marketInfo.setParetMktId(-1);
            marketInfo.setLegacyMarketType(qart.getLocationReference().getLegacyMarketId().getLegacyMarketIDSource().value());
            LegacyMarketId legacyMarketId = new LegacyMarketId();
            legacyMarketId.setSource(qart.getLocationReference().getLegacyMarketId().getLegacyMarketIDSource().name());
            CSGLegacyMarketType csgMarket = new CSGLegacyMarketType();
            csgMarket.setAgent(qart.getLocationReference().getLegacyMarketId().getCSGMarketID().getValue().getAgent());
            csgMarket.setSystem(qart.getLocationReference().getLegacyMarketId().getCSGMarketID().getValue().getCSGSystem());
            csgMarket.setPrinciple(qart.getLocationReference().getLegacyMarketId().getCSGMarketID().getValue().getPrinciple());
            legacyMarketId.setCsgMarket(csgMarket);

            /* todo - are these required mappings? */

//            DdpMarket ddpMarket = new DdpMarket();
//            ddpMarket.setAccountCorp(qart.getLocationReference().getLegacyMarketId().getDSTMarketID().getValue().getAccountCorp());
//            ddpMarket.setFranchiseTaxArea(qart.getLocationReference().getLegacyMarketId().getDSTMarketID().getValue().getFranchiseTaxArea().getValue());
//            ddpMarket.setManagementArea(qart.getLocationReference().getLegacyMarketId().getDSTMarketID().getValue().getManagementArea().getValue());
//            legacyMarketId.setDdpMarket(ddpMarket);
            marketInfo.setLegacyMarketId(legacyMarketId);
            address.setMarketInfo(marketInfo);
            List<LegacyLocationId> legacyLocationIds = qart.getLocationReference().getLegacyLocationIDs().getLegacyLocationIDType()
                    .stream()
                    .map(legacyLocationIDType -> {
                        LegacyLocationId legacyLocationId = new LegacyLocationId();
                        legacyLocationId.setId(legacyLocationIDType.getLegacyLocationID());
                        legacyLocationId.setSource(legacyLocationIDType.getLegacyLocationIDSource().value());
                        return legacyLocationId;
                    }).collect(Collectors.toList());
            address.setLegacyLocationIds(legacyLocationIds);
            addresses.add(address);
        }
    }
}
