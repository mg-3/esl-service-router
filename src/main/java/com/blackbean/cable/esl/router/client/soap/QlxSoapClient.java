package com.blackbean.cable.esl.router.client.soap;

import com.blackbean.cable.esl.router.model.jaxb14_08.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * @author Mike Garcia
 *         Date: 11/18/2015
 *         esl-service-router
 */
@Service
public class QlxSoapClient<R extends QueryLocationXfinityResponseType>
        extends SoapClient<R> {

    private final static Logger log = LoggerFactory.getLogger(QlxSoapClient.class);

    @Autowired
    private ObjectFactory locationSerObjectFactory;

    @Autowired
    public QlxSoapClient(LocationServicePort locationServicePort) {
        super(locationServicePort);
    }

    @Async
    public Future<R> performOperation(Map<String, String> params, final String u, final String p) throws Exception {
        setHeaders(u, p);
        AddressXfinityCriteriaType addressXfinityCriteriaType = locationSerObjectFactory.createAddressXfinityCriteriaType();
        QueryLocationXfinityRequestType qlxRequestType = locationSerObjectFactory.createQueryLocationXfinityRequestType();
        qlxRequestType.setAddressSearch(locationSerObjectFactory.createQueryLocationXfinityRequestTypeAddressSearch(addressXfinityCriteriaType));
        AddressXfinityCriteriaType addressCriteria = qlxRequestType.getAddressSearch().getValue();
        QueryLocationXfinityAddressType addressType = QueryLocationXfinityAddressType.SERVICE_ADDRESS;
        addressCriteria.setAddressType(addressType);
        addressCriteria.setStreetAddress(params.get("addressLine1"));
        addressCriteria.setZip(params.get("zip"));
        addressCriteria.setCity(params.get("city"));
        String state = params.getOrDefault("state", "");
        addressCriteria.setState(state.length() < 2 ? null : state);

        //TODO - unit value not suppored; need more info
        ArrayOfUnitTypesType arrayOfunitTypesType = locationSerObjectFactory.createArrayOfUnitTypesType();
        addressCriteria.setUnitTypes(arrayOfunitTypesType);
        List<UnitTypesType> unitTypes = arrayOfunitTypesType.getUnitTypesType();
        UnitTypesType ut = locationSerObjectFactory.createUnitTypesType();
        unitTypes.add(ut);
        ut.setUnitSequence(1);
        ut.setUnitType(locationSerObjectFactory.createUnitTypesTypeUnitValue(null));
        ut.setUnitValue(locationSerObjectFactory.createUnitTypesTypeUnitValue(null));
//        ut.getUnitValue().setValue(addrLineInput.getUNIT_NUMBER().isEmpty() ? null : addrLineInput.getUNIT_NUMBER());
        addressCriteria.setUnitTypes(arrayOfunitTypesType);


        QueryLocationXfinityResponseType qlxResponse;
        try {
            qlxResponse = port.queryLocationXfinity(qlxRequestType);
            return new AsyncResult(qlxResponse);
        } catch (LocationServiceFault fault) {
            List<MessageType> errors = fault.getFaultInfo().getMessages().getMessage();
            errors.forEach(mt -> log.error("Location service error: {}, {}", mt.getCode(), mt.getText()));
            throw fault;
        }
    }
}
