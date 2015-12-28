package com.blackbean.cable.esl.router.mapper;

import com.blackbean.cable.esl.router.model.jaxb14_08.GetMarketResponseType;
import com.blackbean.cable.esl.router.model.jaxb14_08.MarketType;
import com.blackbean.cable.esl.router.model.rest.markets.detail.Capabilities;
import com.blackbean.cable.esl.router.model.rest.markets.detail.Market;
import com.blackbean.cable.esl.router.model.rest.markets.detail.MarketsDetailResult;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.stereotype.Component;

/**
 * @author Mike Garcia
 *         Date: 12/3/2015
 *         esl-service-router
 */
@Component
public class GetMarketToDetailMapper<
        A extends GetMarketResponseType,
        B extends MarketsDetailResult>
        extends CustomMapper<A, B> {

    @Override
    public void mapAtoB(A src, B dest, MappingContext ctx) {
        super.mapAtoB(src, dest, ctx);
        MarketType marketType = src.getMarket();
        String marketName = marketType.getMarketName();
        long marketId = marketType.getMarketID();
        String glCode = marketType.getGlCode();


        Capabilities capabilities = new Capabilities();
        Market market = new Market();
        market.setId(marketId);
        market.setName(marketName);
        market.setCapabilities(capabilities);
        market.setGlcode(glCode);
        dest.setMarket(market);
    }

}
