
package com.blackbean.cable.esl.router.model.jaxb14_08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.blackbean.cable.esl.router.model.jaxb14_08 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestHeader_QNAME = new QName("http://xml.blackbean.com/types", "requestHeader");
    private final static QName _ResponseHeader_QNAME = new QName("http://xml.blackbean.com/types", "responseHeader");
    private final static QName _ServiceFault_QNAME = new QName("http://xml.blackbean.com/types", "serviceFault");
    private final static QName _UpdateMsagPriorityResponseUpdateMsagPriorityReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "updateMsagPriorityReturn");
    private final static QName _UpdateLocationFromBillingResponseUpdateLocationFromBillingReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "updateLocationFromBillingReturn");
    private final static QName _CopyLocationToBillingResponseCopyLocationToBillingReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "copyLocationToBillingReturn");
    private final static QName _VerifyLocationVerifyLocation_QNAME = new QName("http://xml.blackbean.com/location/services", "VerifyLocation");
    private final static QName _LocationQueueAddressTypeUnitTypes_QNAME = new QName("http://xml.blackbean.com/location/types", "unitTypes");
    private final static QName _LocationQueueAddressTypeCountry_QNAME = new QName("http://xml.blackbean.com/location/types", "country");
    private final static QName _CopyDuplicateHouseToBillingRequestItemTypeTemplateHouseNumber_QNAME = new QName("http://xml.blackbean.com/location/types", "TemplateHouseNumber");
    private final static QName _GetLocationGetLocation_QNAME = new QName("http://xml.blackbean.com/location/services", "GetLocation");
    private final static QName _PostalAddressTypeDwellingCode_QNAME = new QName("http://xml.blackbean.com/location/types", "dwellingCode");
    private final static QName _PostalAddressTypeStreetPreDirection_QNAME = new QName("http://xml.blackbean.com/location/types", "streetPreDirection");
    private final static QName _PostalAddressTypeHouseNumberSuffix_QNAME = new QName("http://xml.blackbean.com/location/types", "houseNumberSuffix");
    private final static QName _PostalAddressTypeHouseNumber_QNAME = new QName("http://xml.blackbean.com/location/types", "houseNumber");
    private final static QName _PostalAddressTypeStreetPostDirection_QNAME = new QName("http://xml.blackbean.com/location/types", "streetPostDirection");
    private final static QName _PostalAddressTypeStreetSuffix_QNAME = new QName("http://xml.blackbean.com/location/types", "streetSuffix");
    private final static QName _PostalAddressTypeHouseNumberPrefix_QNAME = new QName("http://xml.blackbean.com/location/types", "houseNumberPrefix");
    private final static QName _StandardizedAddressXfinityTypeGeocodedAddress_QNAME = new QName("http://xml.blackbean.com/location/types", "geocodedAddress");
    private final static QName _StandardizedAddressXfinityTypeGeography_QNAME = new QName("http://xml.blackbean.com/location/types", "geography");
    private final static QName _StandardizedAddressXfinityTypeTelephony_QNAME = new QName("http://xml.blackbean.com/location/types", "telephony");
    private final static QName _StandardizedAddressXfinityTypeMsag_QNAME = new QName("http://xml.blackbean.com/location/types", "msag");
    private final static QName _QueryLocationXfinityQueryLocationXfinity_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryLocationXfinity");
    private final static QName _GetGeoTagGetGeoTag_QNAME = new QName("http://xml.blackbean.com/location/services", "GetGeoTag");
    private final static QName _DeleteSingleViewAddressAssociationTypeSingleViewID_QNAME = new QName("http://xml.blackbean.com/location/types", "singleViewID");
    private final static QName _DeleteSingleViewAddressAssociationTypeAddressID_QNAME = new QName("http://xml.blackbean.com/location/types", "addressID");
    private final static QName _GetBillingSystemFormattedAddressGetBillingSystemFormattedAddress_QNAME = new QName("http://xml.blackbean.com/location/services", "GetBillingSystemFormattedAddress");
    private final static QName _TelephonyTypeRateCenterName_QNAME = new QName("http://xml.blackbean.com/location/types", "rateCenterName");
    private final static QName _TelephonyTypeTNOrderPool_QNAME = new QName("http://xml.blackbean.com/location/types", "TNOrderPool");
    private final static QName _TelephonyTypeLATA_QNAME = new QName("http://xml.blackbean.com/location/types", "LATA");
    private final static QName _TelephonyTypeWireCenter_QNAME = new QName("http://xml.blackbean.com/location/types", "wireCenter");
    private final static QName _TelephonyTypeLATAName_QNAME = new QName("http://xml.blackbean.com/location/types", "LATAName");
    private final static QName _TelephonyTypeRateCenterServiceable_QNAME = new QName("http://xml.blackbean.com/location/types", "rateCenterServiceable");
    private final static QName _TelephonyTypeILECName_QNAME = new QName("http://xml.blackbean.com/location/types", "ILECName");
    private final static QName _TelephonyTypePSAPAgency_QNAME = new QName("http://xml.blackbean.com/location/types", "PSAPAgency");
    private final static QName _TelephonyTypePSAPId_QNAME = new QName("http://xml.blackbean.com/location/types", "PSAPId");
    private final static QName _TelephonyTypeRateCenterCertification_QNAME = new QName("http://xml.blackbean.com/location/types", "rateCenterCertification");
    private final static QName _GetMsagDataGetMsagData_QNAME = new QName("http://xml.blackbean.com/location/services", "GetMsagData");
    private final static QName _GetBusinessServiceabilityResponseTypeBusinessServiceabilityResponses_QNAME = new QName("http://xml.blackbean.com/location/types", "BusinessServiceabilityResponses");
    private final static QName _QueryLocationXfinityResponseQueryLocationXfinityReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryLocationXfinityReturn");
    private final static QName _BusinessServiceabilityTypeTransport_QNAME = new QName("http://xml.blackbean.com/location/types", "Transport");
    private final static QName _BusinessServiceabilityTypeAttributes_QNAME = new QName("http://xml.blackbean.com/location/types", "Attributes");
    private final static QName _BusinessServiceabilityTypeSupportedProducts_QNAME = new QName("http://xml.blackbean.com/location/types", "SupportedProducts");
    private final static QName _QueryLocationResponseQueryLocationReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryLocationReturn");
    private final static QName _ModifySingleViewAddressAssociationResponseModifySingleViewAddressAssociationReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "modifySingleViewAddressAssociationReturn");
    private final static QName _GeocodingResultsTypeLatitude_QNAME = new QName("http://xml.blackbean.com/location/types", "latitude");
    private final static QName _GeocodingResultsTypeGeocodingPrecision_QNAME = new QName("http://xml.blackbean.com/location/types", "geocodingPrecision");
    private final static QName _GeocodingResultsTypeCensusBlock_QNAME = new QName("http://xml.blackbean.com/location/types", "censusBlock");
    private final static QName _GeocodingResultsTypeUrbanization_QNAME = new QName("http://xml.blackbean.com/location/types", "urbanization");
    private final static QName _GeocodingResultsTypeLongitude_QNAME = new QName("http://xml.blackbean.com/location/types", "longitude");
    private final static QName _AddE911AddressResponseAddE911AddressReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "addE911AddressReturn");
    private final static QName _AddE911AddressAddE911Address_QNAME = new QName("http://xml.blackbean.com/location/services", "AddE911Address");
    private final static QName _BusinessServiceabilityResponseItemTypeStandardizeAddress_QNAME = new QName("http://xml.blackbean.com/location/types", "StandardizeAddress");
    private final static QName _PostalAddressUpdateTypeCity_QNAME = new QName("http://xml.blackbean.com/location/types", "city");
    private final static QName _PostalAddressUpdateTypeStreetName_QNAME = new QName("http://xml.blackbean.com/location/types", "streetName");
    private final static QName _PostalAddressUpdateTypeState_QNAME = new QName("http://xml.blackbean.com/location/types", "state");
    private final static QName _LegacyMarketIDTypeCSGMarketID_QNAME = new QName("http://xml.blackbean.com/location/types", "CSGMarketID");
    private final static QName _LegacyMarketIDTypeDSTMarketID_QNAME = new QName("http://xml.blackbean.com/location/types", "DSTMarketID");
    private final static QName _NodeTypeElocNodeID_QNAME = new QName("http://xml.blackbean.com/location/types", "elocNodeID");
    private final static QName _NodeTypeNodeCapabilities_QNAME = new QName("http://xml.blackbean.com/location/types", "nodeCapabilities");
    private final static QName _NodeTypeAlternateNodeNames_QNAME = new QName("http://xml.blackbean.com/location/types", "alternateNodeNames");
    private final static QName _NodeTypeNodeHubLocation_QNAME = new QName("http://xml.blackbean.com/location/types", "nodeHubLocation");
    private final static QName _NodeTypeNodeBoundary_QNAME = new QName("http://xml.blackbean.com/location/types", "nodeBoundary");
    private final static QName _NodeTypeNodeBoundaryType_QNAME = new QName("http://xml.blackbean.com/location/types", "nodeBoundaryType");
    private final static QName _NodeTypeNodeName_QNAME = new QName("http://xml.blackbean.com/location/types", "nodeName");
    private final static QName _NodeTypeHubID_QNAME = new QName("http://xml.blackbean.com/location/types", "hubID");
    private final static QName _NodeTypeElocMarketID_QNAME = new QName("http://xml.blackbean.com/location/types", "elocMarketID");
    private final static QName _NodeTypeNodeStatus_QNAME = new QName("http://xml.blackbean.com/location/types", "nodeStatus");
    private final static QName _NodeTypeNodeDescription_QNAME = new QName("http://xml.blackbean.com/location/types", "nodeDescription");
    private final static QName _NodeTypePlannedAvailabilityDate_QNAME = new QName("http://xml.blackbean.com/location/types", "plannedAvailabilityDate");
    private final static QName _NodeTypeNodePaths_QNAME = new QName("http://xml.blackbean.com/location/types", "nodePaths");
    private final static QName _GetBillingSystemFormattedAddressResponseGetBillingSystemFormattedAddressReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "getBillingSystemFormattedAddressReturn");
    private final static QName _GetBusinessServiceabilityGetBusinessServiceabilityRequest_QNAME = new QName("http://xml.blackbean.com/location/services", "GetBusinessServiceabilityRequest");
    private final static QName _DeleteLocationFromBillingResponseDeleteLocationFromBillingReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "deleteLocationFromBillingReturn");
    private final static QName _MarketHierarchyResponseTypeHierarchyID_QNAME = new QName("http://xml.blackbean.com/location/types", "hierarchyID");
    private final static QName _ModifyLocationQueueAddressTypeStreetAddress_QNAME = new QName("http://xml.blackbean.com/location/types", "streetAddress");
    private final static QName _MarketReferenceTypeLegacyMarketID_QNAME = new QName("http://xml.blackbean.com/location/types", "legacyMarketID");
    private final static QName _QueryLocationByRuleResponseQueryLocationByRuleReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryLocationByRuleReturn");
    private final static QName _DeleteNodeResponseDeleteNodeReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "deleteNodeReturn");
    private final static QName _GeospatialSearchCriteriaTypeNearestNeighborCriteria_QNAME = new QName("http://xml.blackbean.com/location/types", "NearestNeighborCriteria");
    private final static QName _GeospatialSearchCriteriaTypeBoundaryCriteria_QNAME = new QName("http://xml.blackbean.com/location/types", "BoundaryCriteria");
    private final static QName _GetLocationResponseGetLocationReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "getLocationReturn");
    private final static QName _QueryMarketByBoundaryRequestTypeStateCode_QNAME = new QName("http://xml.blackbean.com/location/types", "stateCode");
    private final static QName _AddLocationResponseAddLocationReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "addLocationReturn");
    private final static QName _QueryMarketByBoundaryResponseQueryMarketByBoundaryReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryMarketByBoundaryReturn");
    private final static QName _RefreshCacheRefreshCache_QNAME = new QName("http://xml.blackbean.com/location/services", "RefreshCache");
    private final static QName _QueryLocationDetailsResponseQueryLocationDetailsReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryLocationDetailsReturn");
    private final static QName _GetGeoTagResponseGetGeoTagReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "getGeoTagReturn");
    private final static QName _LocationDetailsUpdateTypeLocationComments_QNAME = new QName("http://xml.blackbean.com/location/types", "LocationComments");
    private final static QName _LocationDetailsUpdateTypeAddressGroupID_QNAME = new QName("http://xml.blackbean.com/location/types", "AddressGroupID");
    private final static QName _QueryLocationResponseTypeMarketReference_QNAME = new QName("http://xml.blackbean.com/location/types", "marketReference");
    private final static QName _QueryLocationResponseTypeLocation_QNAME = new QName("http://xml.blackbean.com/location/types", "location");
    private final static QName _QueryLocationResponseTypeLocationReference_QNAME = new QName("http://xml.blackbean.com/location/types", "locationReference");
    private final static QName _AddNodeAddNode_QNAME = new QName("http://xml.blackbean.com/location/services", "AddNode");
    private final static QName _GetNodeResponseGetNodeReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "getNodeReturn");
    private final static QName _ModifyMarketResponseModifyMarketReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "modifyMarketReturn");
    private final static QName _GeocodedAddressTypeCloseMatch_QNAME = new QName("http://xml.blackbean.com/location/types", "closeMatch");
    private final static QName _GeocodedAddressTypeStreetSide_QNAME = new QName("http://xml.blackbean.com/location/types", "streetSide");
    private final static QName _GeocodedAddressTypeCensusBlock_QNAME = new QName("http://xml.blackbean.com/location/types", "CensusBlock");
    private final static QName _GeocodedAddressTypeZipCode_QNAME = new QName("http://xml.blackbean.com/location/types", "zipCode");
    private final static QName _GeocodedAddressTypeCensusTract_QNAME = new QName("http://xml.blackbean.com/location/types", "CensusTract");
    private final static QName _AssociateSingleViewAddressAssociateSingleViewAddress_QNAME = new QName("http://xml.blackbean.com/location/services", "AssociateSingleViewAddress");
    private final static QName _CopyDuplicateHouseToBillingCopyDuplicateHouseToBilling_QNAME = new QName("http://xml.blackbean.com/location/services", "CopyDuplicateHouseToBilling");
    private final static QName _QueryMsagDataResponseQueryMsagDataReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryMsagDataReturn");
    private final static QName _GetNodeGetNode_QNAME = new QName("http://xml.blackbean.com/location/services", "GetNode");
    private final static QName _NodeReferenceTypeMarketID_QNAME = new QName("http://xml.blackbean.com/location/types", "marketID");
    private final static QName _QueryLocationGeospatialQueryLocationGeospatial_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryLocationGeospatial");
    private final static QName _GetLocationInformationResponseTypeFiberNodeName_QNAME = new QName("http://xml.blackbean.com/location/types", "fiberNodeName");
    private final static QName _AddLocationQueueAddLocationQueue_QNAME = new QName("http://xml.blackbean.com/location/services", "AddLocationQueue");
    private final static QName _ModifyHomeSecurityResponseModifyHomeSecurityReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "modifyHomeSecurityReturn");
    private final static QName _QueryLocationQueryLocation_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryLocation");
    private final static QName _LocationLegacyDetailsTypeDSTLegacyDetails_QNAME = new QName("http://xml.blackbean.com/location/types", "DSTLegacyDetails");
    private final static QName _LocationLegacyDetailsTypeCSGLegacyDetails_QNAME = new QName("http://xml.blackbean.com/location/types", "CSGLegacyDetails");
    private final static QName _StandardizeAddressByRuleStandardizeAddressByRule_QNAME = new QName("http://xml.blackbean.com/location/services", "StandardizeAddressByRule");
    private final static QName _QueryMarketQueryMarket_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryMarket");
    private final static QName _GetLocationXfinityRequestedResultsTypeMarketHierarchyInfo_QNAME = new QName("http://xml.blackbean.com/location/types", "marketHierarchyInfo");
    private final static QName _QueryLocationByRuleRequestTypeAddressSearch_QNAME = new QName("http://xml.blackbean.com/location/types", "addressSearch");
    private final static QName _GetMarketResponseGetMarketReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "getMarketReturn");
    private final static QName _ModifyMarketModifyMarket_QNAME = new QName("http://xml.blackbean.com/location/services", "ModifyMarket");
    private final static QName _StandardizeAddressByRuleRequestTypeApplyConsumerRule_QNAME = new QName("http://xml.blackbean.com/location/types", "applyConsumerRule");
    private final static QName _ModifyHomeSecurityModifyHomeSecurity_QNAME = new QName("http://xml.blackbean.com/location/services", "ModifyHomeSecurity");
    private final static QName _BuildingAttributesTypeBuildingCategory_QNAME = new QName("http://xml.blackbean.com/location/types", "BuildingCategory");
    private final static QName _GetLocationXfinityResponseGetLocationXfinityReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "getLocationXfinityReturn");
    private final static QName _GetMarketGetMarket_QNAME = new QName("http://xml.blackbean.com/location/services", "GetMarket");
    private final static QName _QueryNodeResponseQueryNodeReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryNodeReturn");
    private final static QName _DeleteLocationDeleteLocation_QNAME = new QName("http://xml.blackbean.com/location/services", "DeleteLocation");
    private final static QName _ModifyLocationQueueResponseModifyLocationQueueReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "modifyLocationQueueReturn");
    private final static QName _QueryLocationReferenceDataResponseQueryLocationReferenceDataReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryLocationReferenceDataReturn");
    private final static QName _StandardizeAddressStandardizeAddress_QNAME = new QName("http://xml.blackbean.com/location/services", "StandardizeAddress");
    private final static QName _LocationDetailsTypeStructureType_QNAME = new QName("http://xml.blackbean.com/location/types", "StructureType");
    private final static QName _LocationDetailsTypeStructureUse_QNAME = new QName("http://xml.blackbean.com/location/types", "StructureUse");
    private final static QName _AddLocationAddLocation_QNAME = new QName("http://xml.blackbean.com/location/services", "AddLocation");
    private final static QName _GetLocationFromBillerResponseGetLocationFromBillerReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "getLocationFromBillerReturn");
    private final static QName _UpdateLocationInBillingResponseUpdateLocationInBillingReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "updateLocationInBillingReturn");
    private final static QName _GetLocationFromBillerGetLocationFromBiller_QNAME = new QName("http://xml.blackbean.com/location/services", "GetLocationFromBiller");
    private final static QName _QueryLocationByRuleQueryLocationByRule_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryLocationByRule");
    private final static QName _LocationServiceabilityUpdateTypeUpdateAction_QNAME = new QName("http://xml.blackbean.com/location/types", "updateAction");
    private final static QName _LocationServiceabilityUpdateTypeServiceableFlag_QNAME = new QName("http://xml.blackbean.com/location/types", "serviceableFlag");
    private final static QName _VerifyLocationResponseVerifyLocationReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "verifyLocationReturn");
    private final static QName _GetLocationQueueResponseGetLocationQueueReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "getLocationQueueReturn");
    private final static QName _DeleteMarketResponseDeleteMarketReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "deleteMarketReturn");
    private final static QName _GeographicCoordinateMeasurementTypeElevation_QNAME = new QName("http://xml.blackbean.com/location/types", "Elevation");
    private final static QName _StandardizeAddressXfinityResponseTypeAddresses_QNAME = new QName("http://xml.blackbean.com/location/types", "addresses");
    private final static QName _ModifyLocationRequestDetailsTypeMarketID_QNAME = new QName("http://xml.blackbean.com/location/types", "MarketID");
    private final static QName _ModifyLocationRequestDetailsTypeLocationPostalAddress_QNAME = new QName("http://xml.blackbean.com/location/types", "LocationPostalAddress");
    private final static QName _QueryMsagDataQueryMsagData_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryMsagData");
    private final static QName _ModifyLocationModifyLocation_QNAME = new QName("http://xml.blackbean.com/location/services", "ModifyLocation");
    private final static QName _LocationTelephonyTypeRateCenterName_QNAME = new QName("http://xml.blackbean.com/location/types", "RateCenterName");
    private final static QName _LocationLegacyDetailsCSGTypeLocationStatus_QNAME = new QName("http://xml.blackbean.com/location/types", "locationStatus");
    private final static QName _LocationLegacyDetailsCSGTypeCustomerType_QNAME = new QName("http://xml.blackbean.com/location/types", "customerType");
    private final static QName _LocationLegacyDetailsCSGTypeUnincorporatedFlag_QNAME = new QName("http://xml.blackbean.com/location/types", "unincorporatedFlag");
    private final static QName _LocationLegacyDetailsCSGTypeDwellingCodeDescr_QNAME = new QName("http://xml.blackbean.com/location/types", "dwellingCodeDescr");
    private final static QName _LocationLegacyDetailsCSGTypePoleOwner_QNAME = new QName("http://xml.blackbean.com/location/types", "poleOwner");
    private final static QName _LocationLegacyDetailsCSGTypeAddressLine2Override_QNAME = new QName("http://xml.blackbean.com/location/types", "addressLine2Override");
    private final static QName _LocationLegacyDetailsCSGTypeSalesArea_QNAME = new QName("http://xml.blackbean.com/location/types", "salesArea");
    private final static QName _LocationLegacyDetailsCSGTypeHookupType_QNAME = new QName("http://xml.blackbean.com/location/types", "hookupType");
    private final static QName _LocationLegacyDetailsCSGTypePedestal_QNAME = new QName("http://xml.blackbean.com/location/types", "pedestal");
    private final static QName _LocationLegacyDetailsCSGTypeLastCallDate_QNAME = new QName("http://xml.blackbean.com/location/types", "lastCallDate");
    private final static QName _LocationLegacyDetailsCSGTypeHouseComments_QNAME = new QName("http://xml.blackbean.com/location/types", "houseComments");
    private final static QName _LocationLegacyDetailsCSGTypeCell_QNAME = new QName("http://xml.blackbean.com/location/types", "cell");
    private final static QName _LocationLegacyDetailsCSGTypeDropLength_QNAME = new QName("http://xml.blackbean.com/location/types", "dropLength");
    private final static QName _LocationLegacyDetailsCSGTypeLineTag_QNAME = new QName("http://xml.blackbean.com/location/types", "lineTag");
    private final static QName _LocationLegacyDetailsCSGTypePowerSupply_QNAME = new QName("http://xml.blackbean.com/location/types", "powerSupply");
    private final static QName _LocationLegacyDetailsCSGTypeLocationType_QNAME = new QName("http://xml.blackbean.com/location/types", "locationType");
    private final static QName _LocationLegacyDetailsCSGTypeDemographicCode_QNAME = new QName("http://xml.blackbean.com/location/types", "demographicCode");
    private final static QName _LocationLegacyDetailsCSGTypeHub_QNAME = new QName("http://xml.blackbean.com/location/types", "hub");
    private final static QName _LocationLegacyDetailsCSGTypeHouseMisc_QNAME = new QName("http://xml.blackbean.com/location/types", "houseMisc");
    private final static QName _LocationLegacyDetailsCSGTypeRightOfEntryPermission_QNAME = new QName("http://xml.blackbean.com/location/types", "rightOfEntryPermission");
    private final static QName _LocationLegacyDetailsCSGTypeDropType_QNAME = new QName("http://xml.blackbean.com/location/types", "dropType");
    private final static QName _LocationLegacyDetailsCSGTypeHouseUsageCode_QNAME = new QName("http://xml.blackbean.com/location/types", "houseUsageCode");
    private final static QName _LocationLegacyDetailsCSGTypeTechnicianArea_QNAME = new QName("http://xml.blackbean.com/location/types", "technicianArea");
    private final static QName _LocationLegacyDetailsCSGTypeMapCode_QNAME = new QName("http://xml.blackbean.com/location/types", "mapCode");
    private final static QName _LocationLegacyDetailsCSGTypePoleNumber_QNAME = new QName("http://xml.blackbean.com/location/types", "poleNumber");
    private final static QName _LocationLegacyDetailsCSGTypeBridgerAddress_QNAME = new QName("http://xml.blackbean.com/location/types", "bridgerAddress");
    private final static QName _LocationLegacyDetailsCSGTypeLastCallStatus_QNAME = new QName("http://xml.blackbean.com/location/types", "lastCallStatus");
    private final static QName _LocationLegacyDetailsCSGTypeAmplifier_QNAME = new QName("http://xml.blackbean.com/location/types", "amplifier");
    private final static QName _LocationLegacyDetailsCSGTypeGround_QNAME = new QName("http://xml.blackbean.com/location/types", "ground");
    private final static QName _LocationLegacyDetailsCSGTypeServiceArea_QNAME = new QName("http://xml.blackbean.com/location/types", "serviceArea");
    private final static QName _LocationLegacyDetailsCSGTypeDropSite_QNAME = new QName("http://xml.blackbean.com/location/types", "dropSite");
    private final static QName _LocationLegacyDetailsCSGTypeTimeZone_QNAME = new QName("http://xml.blackbean.com/location/types", "timeZone");
    private final static QName _LocationLegacyDetailsCSGTypeLocationCountyID_QNAME = new QName("http://xml.blackbean.com/location/types", "locationCountyID");
    private final static QName _QueryLocationReferenceDataQueryLocationReferenceData_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryLocationReferenceData");
    private final static QName _DeleteNodeDeleteNode_QNAME = new QName("http://xml.blackbean.com/location/services", "DeleteNode");
    private final static QName _HomeSecurityContactNumbersTypeMedicalNumber_QNAME = new QName("http://xml.blackbean.com/location/types", "medicalNumber");
    private final static QName _HomeSecurityContactNumbersTypePoliceNumber_QNAME = new QName("http://xml.blackbean.com/location/types", "policeNumber");
    private final static QName _HomeSecurityContactNumbersTypeFireNumber_QNAME = new QName("http://xml.blackbean.com/location/types", "fireNumber");
    private final static QName _QueryMarketResponseTypeVendorMarketReference_QNAME = new QName("http://xml.blackbean.com/location/types", "vendorMarketReference");
    private final static QName _GetLocationXfinityGetLocationXfinity_QNAME = new QName("http://xml.blackbean.com/location/services", "GetLocationXfinity");
    private final static QName _RefreshCacheResponseRefreshCacheReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "refreshCacheReturn");
    private final static QName _GetLocationInformationGetLocationInformation_QNAME = new QName("http://xml.blackbean.com/location/services", "GetLocationInformation");
    private final static QName _AddMarketAddMarket_QNAME = new QName("http://xml.blackbean.com/location/services", "AddMarket");
    private final static QName _LocationGeographyTypePlaceName_QNAME = new QName("http://xml.blackbean.com/location/types", "PlaceName");
    private final static QName _LocationGeographyTypeMinorCivilDivision_QNAME = new QName("http://xml.blackbean.com/location/types", "MinorCivilDivision");
    private final static QName _LocationGeographyTypeFIPSCode_QNAME = new QName("http://xml.blackbean.com/location/types", "FIPSCode");
    private final static QName _LocationGeographyTypeCountyName_QNAME = new QName("http://xml.blackbean.com/location/types", "CountyName");
    private final static QName _LocationGeographyTypeVertexCode_QNAME = new QName("http://xml.blackbean.com/location/types", "VertexCode");
    private final static QName _ModifyNodeResponseModifyNodeReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "modifyNodeReturn");
    private final static QName _UpdateLocationFromBillingUpdateLocationFromBilling_QNAME = new QName("http://xml.blackbean.com/location/services", "UpdateLocationFromBilling");
    private final static QName _StandardizeAddressXfinityResponseItemTypeStandardizedAddresses_QNAME = new QName("http://xml.blackbean.com/location/types", "standardizedAddresses");
    private final static QName _ModifyLocationQueueRequestTypeModifyLocationQueueRequests_QNAME = new QName("http://xml.blackbean.com/location/types", "ModifyLocationQueueRequests");
    private final static QName _BusinessServiceabilityAttributesTypeBuildingAttribute_QNAME = new QName("http://xml.blackbean.com/location/types", "BuildingAttribute");
    private final static QName _QueryLocationQueueQueryLocationQueue_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryLocationQueue");
    private final static QName _CopyDuplicateHouseToBillingResponseCopyDuplicateHouseToBillingReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "copyDuplicateHouseToBillingReturn");
    private final static QName _LocationLegacyDetailsDSTTypeComplex_QNAME = new QName("http://xml.blackbean.com/location/types", "complex");
    private final static QName _LocationLegacyDetailsDSTTypeMkt_QNAME = new QName("http://xml.blackbean.com/location/types", "mkt");
    private final static QName _LocationLegacyDetailsDSTTypeAuxX1_QNAME = new QName("http://xml.blackbean.com/location/types", "auxX1");
    private final static QName _LocationLegacyDetailsDSTTypeAuxX3_QNAME = new QName("http://xml.blackbean.com/location/types", "auxX3");
    private final static QName _LocationLegacyDetailsDSTTypeDual_QNAME = new QName("http://xml.blackbean.com/location/types", "dual");
    private final static QName _LocationLegacyDetailsDSTTypeDualHouse_QNAME = new QName("http://xml.blackbean.com/location/types", "dualHouse");
    private final static QName _LocationLegacyDetailsDSTTypeAuxX2_QNAME = new QName("http://xml.blackbean.com/location/types", "auxX2");
    private final static QName _LocationLegacyDetailsDSTTypeMap_QNAME = new QName("http://xml.blackbean.com/location/types", "map");
    private final static QName _LocationLegacyDetailsDSTTypeConstructionArea_QNAME = new QName("http://xml.blackbean.com/location/types", "constructionArea");
    private final static QName _LocationLegacyDetailsDSTTypeInfo_QNAME = new QName("http://xml.blackbean.com/location/types", "info");
    private final static QName _LocationLegacyDetailsDSTTypeDupHouse_QNAME = new QName("http://xml.blackbean.com/location/types", "dupHouse");
    private final static QName _LocationLegacyDetailsDSTTypeHouseComment_QNAME = new QName("http://xml.blackbean.com/location/types", "houseComment");
    private final static QName _LocationLegacyDetailsDSTTypeDrop_QNAME = new QName("http://xml.blackbean.com/location/types", "drop");
    private final static QName _LocationLegacyDetailsDSTTypeAuxY6_QNAME = new QName("http://xml.blackbean.com/location/types", "auxY6");
    private final static QName _LocationLegacyDetailsDSTTypeDwellingTypeCode_QNAME = new QName("http://xml.blackbean.com/location/types", "dwellingTypeCode");
    private final static QName _LocationLegacyDetailsDSTTypeAuxY7_QNAME = new QName("http://xml.blackbean.com/location/types", "auxY7");
    private final static QName _LocationLegacyDetailsDSTTypeControlArea_QNAME = new QName("http://xml.blackbean.com/location/types", "controlArea");
    private final static QName _LocationLegacyDetailsDSTTypeAuxY2_QNAME = new QName("http://xml.blackbean.com/location/types", "auxY2");
    private final static QName _LocationLegacyDetailsDSTTypeAuxY1_QNAME = new QName("http://xml.blackbean.com/location/types", "auxY1");
    private final static QName _LocationLegacyDetailsDSTTypeNetworkInfo_QNAME = new QName("http://xml.blackbean.com/location/types", "networkInfo");
    private final static QName _LocationLegacyDetailsDSTTypeAuxY3_QNAME = new QName("http://xml.blackbean.com/location/types", "auxY3");
    private final static QName _LocationLegacyDetailsDSTTypeNetworkID_QNAME = new QName("http://xml.blackbean.com/location/types", "networkID");
    private final static QName _LocationLegacyDetailsDSTTypeCustomerNumber_QNAME = new QName("http://xml.blackbean.com/location/types", "customerNumber");
    private final static QName _LocationLegacyDetailsDSTTypeSalesRoute_QNAME = new QName("http://xml.blackbean.com/location/types", "salesRoute");
    private final static QName _AddMsagDataResponseAddMsagDataReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "addMsagDataReturn");
    private final static QName _GeocodingConstraintsTypeCustomMatchModeSettings_QNAME = new QName("http://xml.blackbean.com/location/types", "customMatchModeSettings");
    private final static QName _ModifyLocationQueueModifyLocationQueue_QNAME = new QName("http://xml.blackbean.com/location/services", "ModifyLocationQueue");
    private final static QName _ModifyLocationResponseModifyLocationReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "modifyLocationReturn");
    private final static QName _DeleteSingleViewAddressAssociationResponseDeleteSingleViewAddressAssociationReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "deleteSingleViewAddressAssociationReturn");
    private final static QName _GetLocationQueueGetLocationQueue_QNAME = new QName("http://xml.blackbean.com/location/services", "GetLocationQueue");
    private final static QName _DeleteLocationResponseDeleteLocationReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "deleteLocationReturn");
    private final static QName _AssociateSingleViewAddressResponseAssociateSingleViewAddressReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "associateSingleViewAddressReturn");
    private final static QName _LocationQueueModifyContactInfoTypeNTID_QNAME = new QName("http://xml.blackbean.com/location/types", "NTID");
    private final static QName _LocationQueueModifyContactInfoTypePhone_QNAME = new QName("http://xml.blackbean.com/location/types", "phone");
    private final static QName _LocationQueueModifyContactInfoTypeOrganization_QNAME = new QName("http://xml.blackbean.com/location/types", "organization");
    private final static QName _LocationQueueModifyContactInfoTypeEmail_QNAME = new QName("http://xml.blackbean.com/location/types", "email");
    private final static QName _LocationQueueModifyContactInfoTypeName_QNAME = new QName("http://xml.blackbean.com/location/types", "name");
    private final static QName _QueryLocationDetailsQueryLocationDetails_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryLocationDetails");
    private final static QName _QueryLocationQueueResponseQueryLocationQueueReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryLocationQueueReturn");
    private final static QName _MarketHierarchyLevelInfoMarketHierarchy_QNAME = new QName("http://xml.blackbean.com/location/types", "marketHierarchy");
    private final static QName _BillingSystemFormattedAddressesTypeDdpFormattedAddress_QNAME = new QName("http://xml.blackbean.com/location/types", "ddpFormattedAddress");
    private final static QName _BillingSystemFormattedAddressesTypeCsgFormattedAddress_QNAME = new QName("http://xml.blackbean.com/location/types", "csgFormattedAddress");
    private final static QName _LocationLegacyDetailsCSGBridgerTypeBridgerPrivate_QNAME = new QName("http://xml.blackbean.com/location/types", "bridgerPrivate");
    private final static QName _LocationLegacyDetailsCSGBridgerTypeBridgerBidirectional_QNAME = new QName("http://xml.blackbean.com/location/types", "bridgerBidirectional");
    private final static QName _LocationLegacyDetailsCSGBridgerTypeBridgerGateControl_QNAME = new QName("http://xml.blackbean.com/location/types", "bridgerGateControl");
    private final static QName _AddMarketResponseAddMarketReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "addMarketReturn");
    private final static QName _QueryMarketByBoundaryQueryMarketByBoundary_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryMarketByBoundary");
    private final static QName _LocationQueueReferenceTypeRequestedPriority_QNAME = new QName("http://xml.blackbean.com/location/types", "RequestedPriority");
    private final static QName _DSTLegacyMarketTypeManagementArea_QNAME = new QName("http://xml.blackbean.com/location/types", "ManagementArea");
    private final static QName _DSTLegacyMarketTypeFranchiseTaxArea_QNAME = new QName("http://xml.blackbean.com/location/types", "FranchiseTaxArea");
    private final static QName _CopyLocationToBillingCopyLocationToBilling_QNAME = new QName("http://xml.blackbean.com/location/services", "CopyLocationToBilling");
    private final static QName _StandardizeAddressXfinityStandardizeAddressXfinity_QNAME = new QName("http://xml.blackbean.com/location/services", "StandardizeAddressXfinity");
    private final static QName _StandardizeAddressXfinityResponseStandardizeAddressXfinityReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "standardizeAddressXfinityReturn");
    private final static QName _SeasonalSuspendTypeEnabled_QNAME = new QName("http://xml.blackbean.com/location/types", "enabled");
    private final static QName _SeasonalSuspendTypePreDateTotalDaysAllowed_QNAME = new QName("http://xml.blackbean.com/location/types", "preDateTotalDaysAllowed");
    private final static QName _DeleteMsagAddressAssociationDeleteMsagAddressAssociation_QNAME = new QName("http://xml.blackbean.com/location/services", "DeleteMsagAddressAssociation");
    private final static QName _QueryLocationGeospatialResponseQueryLocationGeospatialReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryLocationGeospatialReturn");
    private final static QName _GetMsagDataResponseGetMsagDataReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "getMsagDataReturn");
    private final static QName _DeleteE911AddressResponseDeleteE911AddressReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "deleteE911AddressReturn");
    private final static QName _UpdateLocationInBillingUpdateLocationInBilling_QNAME = new QName("http://xml.blackbean.com/location/services", "UpdateLocationInBilling");
    private final static QName _QueryMarketResponseQueryMarketReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryMarketReturn");
    private final static QName _DeleteMarketDeleteMarket_QNAME = new QName("http://xml.blackbean.com/location/services", "DeleteMarket");
    private final static QName _DeleteLocationFromBillingDeleteLocationFromBilling_QNAME = new QName("http://xml.blackbean.com/location/services", "DeleteLocationFromBilling");
    private final static QName _ModifyLocationQueueRequestItemTypeNeedByDate_QNAME = new QName("http://xml.blackbean.com/location/types", "NeedByDate");
    private final static QName _ModifyLocationQueueRequestItemTypeComments_QNAME = new QName("http://xml.blackbean.com/location/types", "Comments");
    private final static QName _ModifyLocationQueueRequestItemTypeLocationQueueAddress_QNAME = new QName("http://xml.blackbean.com/location/types", "LocationQueueAddress");
    private final static QName _ModifyLocationQueueRequestItemTypeLeadID_QNAME = new QName("http://xml.blackbean.com/location/types", "LeadID");
    private final static QName _GetBusinessServiceabilityResponseGetBusinessServiceabilityReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "getBusinessServiceabilityReturn");
    private final static QName _ModifyNodeModifyNode_QNAME = new QName("http://xml.blackbean.com/location/services", "ModifyNode");
    private final static QName _DeleteSingleViewAddressAssociationDeleteSingleViewAddressAssociation_QNAME = new QName("http://xml.blackbean.com/location/services", "DeleteSingleViewAddressAssociation");
    private final static QName _UpdateMsagPriorityUpdateMsagPriority_QNAME = new QName("http://xml.blackbean.com/location/services", "UpdateMsagPriority");
    private final static QName _QueryMarketHierarchyQueryMarketHierarchy_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryMarketHierarchy");
    private final static QName _GetLocationInformationResponseGetLocationInformationReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "getLocationInformationReturn");
    private final static QName _AddLocationQueueResponseAddLocationQueueReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "addLocationQueueReturn");
    private final static QName _DeleteMsagAddressAssociationResponseDeleteMsagAddressAssociationReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "deleteMsagAddressAssociationReturn");
    private final static QName _UnitTypesTypeUnitType_QNAME = new QName("http://xml.blackbean.com/location/types", "unitType");
    private final static QName _UnitTypesTypeUnitValue_QNAME = new QName("http://xml.blackbean.com/location/types", "unitValue");
    private final static QName _AlternateNodeNameAlternateNodeNameValue_QNAME = new QName("http://xml.blackbean.com/location/types", "alternateNodeNameValue");
    private final static QName _AlternateNodeNameAlternateNodeNameSequence_QNAME = new QName("http://xml.blackbean.com/location/types", "alternateNodeNameSequence");
    private final static QName _AddNodeResponseAddNodeReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "addNodeReturn");
    private final static QName _LocationLegacyDetailsCSGLineOfBusinessTypeTapStatus_QNAME = new QName("http://xml.blackbean.com/location/types", "tapStatus");
    private final static QName _LocationLegacyDetailsCSGLineOfBusinessTypeProjectServiceDate_QNAME = new QName("http://xml.blackbean.com/location/types", "projectServiceDate");
    private final static QName _LocationLegacyDetailsCSGLineOfBusinessTypeLobSwitch_QNAME = new QName("http://xml.blackbean.com/location/types", "lobSwitch");
    private final static QName _LocationLegacyDetailsCSGLineOfBusinessTypeNode_QNAME = new QName("http://xml.blackbean.com/location/types", "node");
    private final static QName _LocationLegacyDetailsCSGLineOfBusinessTypeRouter_QNAME = new QName("http://xml.blackbean.com/location/types", "router");
    private final static QName _LocationLegacyDetailsCSGLineOfBusinessTypeNetworkInterfaceUnit_QNAME = new QName("http://xml.blackbean.com/location/types", "networkInterfaceUnit");
    private final static QName _LocationLegacyDetailsCSGLineOfBusinessTypeLobServiceStatus_QNAME = new QName("http://xml.blackbean.com/location/types", "lobServiceStatus");
    private final static QName _LocationLegacyDetailsCSGLineOfBusinessTypeInstalledOutlets_QNAME = new QName("http://xml.blackbean.com/location/types", "installedOutlets");
    private final static QName _LocationLegacyDetailsCSGLineOfBusinessTypeHeadend_QNAME = new QName("http://xml.blackbean.com/location/types", "headend");
    private final static QName _LocationLegacyDetailsCSGLineOfBusinessTypeDisableLOBServiceability_QNAME = new QName("http://xml.blackbean.com/location/types", "disableLOBServiceability");
    private final static QName _LocationLegacyDetailsCSGLineOfBusinessTypeLobType_QNAME = new QName("http://xml.blackbean.com/location/types", "lobType");
    private final static QName _StandardizeAddressResponseStandardizeAddressReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "standardizeAddressReturn");
    private final static QName _StandardizeAddressByRuleResponseStandardizeAddressByRuleReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "standardizeAddressByRuleReturn");
    private final static QName _QueryNodeQueryNode_QNAME = new QName("http://xml.blackbean.com/location/services", "QueryNode");
    private final static QName _QueryMarketHierarchyResponseQueryMarketHierarchyReturn_QNAME = new QName("http://xml.blackbean.com/location/services", "queryMarketHierarchyReturn");
    private final static QName _AddMsagDataAddMsagData_QNAME = new QName("http://xml.blackbean.com/location/services", "AddMsagData");
    private final static QName _ModifySingleViewAddressAssociationModifySingleViewAddressAssociation_QNAME = new QName("http://xml.blackbean.com/location/services", "ModifySingleViewAddressAssociation");
    private final static QName _LocationNetworkConnectivityTypeHeadendID_QNAME = new QName("http://xml.blackbean.com/location/types", "headendID");
    private final static QName _LocationNetworkConnectivityTypeHeadendNetworkAddress_QNAME = new QName("http://xml.blackbean.com/location/types", "headendNetworkAddress");
    private final static QName _LocationNetworkConnectivityTypeDropLocation_QNAME = new QName("http://xml.blackbean.com/location/types", "dropLocation");
    private final static QName _DeleteE911AddressDeleteE911Address_QNAME = new QName("http://xml.blackbean.com/location/services", "DeleteE911Address");
    private final static QName _ZipCodeTypeZip4_QNAME = new QName("http://xml.blackbean.com/location/types", "zip4");
    private final static QName _BillerInformationTypeCSGLocationInformation_QNAME = new QName("http://xml.blackbean.com/location/types", "CSGLocationInformation");
    private final static QName _BillerInformationTypeDDPLocationInformation_QNAME = new QName("http://xml.blackbean.com/location/types", "DDPLocationInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.blackbean.cable.esl.router.model.jaxb14_08
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLocation }
     */
    public GetLocation createGetLocation() {
        return new GetLocation();
    }

    /**
     * Create an instance of {@link GetLocationRequestType }
     */
    public GetLocationRequestType createGetLocationRequestType() {
        return new GetLocationRequestType();
    }

    /**
     * Create an instance of {@link DeleteMsagAddressAssociation }
     */
    public DeleteMsagAddressAssociation createDeleteMsagAddressAssociation() {
        return new DeleteMsagAddressAssociation();
    }

    /**
     * Create an instance of {@link DeleteMsagAddressAssociationRequestType }
     */
    public DeleteMsagAddressAssociationRequestType createDeleteMsagAddressAssociationRequestType() {
        return new DeleteMsagAddressAssociationRequestType();
    }

    /**
     * Create an instance of {@link QueryMarketHierarchyResponse }
     */
    public QueryMarketHierarchyResponse createQueryMarketHierarchyResponse() {
        return new QueryMarketHierarchyResponse();
    }

    /**
     * Create an instance of {@link QueryMarketHierarchyResponseType }
     */
    public QueryMarketHierarchyResponseType createQueryMarketHierarchyResponseType() {
        return new QueryMarketHierarchyResponseType();
    }

    /**
     * Create an instance of {@link AddLocationResponse }
     */
    public AddLocationResponse createAddLocationResponse() {
        return new AddLocationResponse();
    }

    /**
     * Create an instance of {@link AddLocationResponseType }
     */
    public AddLocationResponseType createAddLocationResponseType() {
        return new AddLocationResponseType();
    }

    /**
     * Create an instance of {@link QueryLocationGeospatial }
     */
    public QueryLocationGeospatial createQueryLocationGeospatial() {
        return new QueryLocationGeospatial();
    }

    /**
     * Create an instance of {@link QueryLocationGeospatialRequestType }
     */
    public QueryLocationGeospatialRequestType createQueryLocationGeospatialRequestType() {
        return new QueryLocationGeospatialRequestType();
    }

    /**
     * Create an instance of {@link GetMsagDataResponse }
     */
    public GetMsagDataResponse createGetMsagDataResponse() {
        return new GetMsagDataResponse();
    }

    /**
     * Create an instance of {@link GetMsagDataResponseType }
     */
    public GetMsagDataResponseType createGetMsagDataResponseType() {
        return new GetMsagDataResponseType();
    }

    /**
     * Create an instance of {@link GetBusinessServiceabilityResponse }
     */
    public GetBusinessServiceabilityResponse createGetBusinessServiceabilityResponse() {
        return new GetBusinessServiceabilityResponse();
    }

    /**
     * Create an instance of {@link GetBusinessServiceabilityResponseType }
     */
    public GetBusinessServiceabilityResponseType createGetBusinessServiceabilityResponseType() {
        return new GetBusinessServiceabilityResponseType();
    }

    /**
     * Create an instance of {@link QueryLocationReferenceData }
     */
    public QueryLocationReferenceData createQueryLocationReferenceData() {
        return new QueryLocationReferenceData();
    }

    /**
     * Create an instance of {@link QueryLocationReferenceDataRequestType }
     */
    public QueryLocationReferenceDataRequestType createQueryLocationReferenceDataRequestType() {
        return new QueryLocationReferenceDataRequestType();
    }

    /**
     * Create an instance of {@link QueryLocationResponse }
     */
    public QueryLocationResponse createQueryLocationResponse() {
        return new QueryLocationResponse();
    }

    /**
     * Create an instance of {@link QueryLocationResponseType }
     */
    public QueryLocationResponseType createQueryLocationResponseType() {
        return new QueryLocationResponseType();
    }

    /**
     * Create an instance of {@link ModifyLocationQueueResponse }
     */
    public ModifyLocationQueueResponse createModifyLocationQueueResponse() {
        return new ModifyLocationQueueResponse();
    }

    /**
     * Create an instance of {@link ModifyLocationQueueResponseType }
     */
    public ModifyLocationQueueResponseType createModifyLocationQueueResponseType() {
        return new ModifyLocationQueueResponseType();
    }

    /**
     * Create an instance of {@link UpdateMsagPriorityResponse }
     */
    public UpdateMsagPriorityResponse createUpdateMsagPriorityResponse() {
        return new UpdateMsagPriorityResponse();
    }

    /**
     * Create an instance of {@link UpdateMsagPriorityResponseType }
     */
    public UpdateMsagPriorityResponseType createUpdateMsagPriorityResponseType() {
        return new UpdateMsagPriorityResponseType();
    }

    /**
     * Create an instance of {@link QueryLocationReferenceDataResponse }
     */
    public QueryLocationReferenceDataResponse createQueryLocationReferenceDataResponse() {
        return new QueryLocationReferenceDataResponse();
    }

    /**
     * Create an instance of {@link QueryLocationReferenceDataResponseType }
     */
    public QueryLocationReferenceDataResponseType createQueryLocationReferenceDataResponseType() {
        return new QueryLocationReferenceDataResponseType();
    }

    /**
     * Create an instance of {@link QueryLocationByRule }
     */
    public QueryLocationByRule createQueryLocationByRule() {
        return new QueryLocationByRule();
    }

    /**
     * Create an instance of {@link QueryLocationByRuleRequestType }
     */
    public QueryLocationByRuleRequestType createQueryLocationByRuleRequestType() {
        return new QueryLocationByRuleRequestType();
    }

    /**
     * Create an instance of {@link QueryLocationDetails }
     */
    public QueryLocationDetails createQueryLocationDetails() {
        return new QueryLocationDetails();
    }

    /**
     * Create an instance of {@link QueryLocationDetailsRequestType }
     */
    public QueryLocationDetailsRequestType createQueryLocationDetailsRequestType() {
        return new QueryLocationDetailsRequestType();
    }

    /**
     * Create an instance of {@link GetLocationQueue }
     */
    public GetLocationQueue createGetLocationQueue() {
        return new GetLocationQueue();
    }

    /**
     * Create an instance of {@link GetLocationQueueRequestType }
     */
    public GetLocationQueueRequestType createGetLocationQueueRequestType() {
        return new GetLocationQueueRequestType();
    }

    /**
     * Create an instance of {@link DeleteE911AddressResponse }
     */
    public DeleteE911AddressResponse createDeleteE911AddressResponse() {
        return new DeleteE911AddressResponse();
    }

    /**
     * Create an instance of {@link DeleteE911AddressResponseType }
     */
    public DeleteE911AddressResponseType createDeleteE911AddressResponseType() {
        return new DeleteE911AddressResponseType();
    }

    /**
     * Create an instance of {@link ModifyMarketResponse }
     */
    public ModifyMarketResponse createModifyMarketResponse() {
        return new ModifyMarketResponse();
    }

    /**
     * Create an instance of {@link AddModifyMarketResponseType }
     */
    public AddModifyMarketResponseType createAddModifyMarketResponseType() {
        return new AddModifyMarketResponseType();
    }

    /**
     * Create an instance of {@link QueryLocationDetailsResponse }
     */
    public QueryLocationDetailsResponse createQueryLocationDetailsResponse() {
        return new QueryLocationDetailsResponse();
    }

    /**
     * Create an instance of {@link QueryLocationDetailsResponseType }
     */
    public QueryLocationDetailsResponseType createQueryLocationDetailsResponseType() {
        return new QueryLocationDetailsResponseType();
    }

    /**
     * Create an instance of {@link GetBillingSystemFormattedAddressResponse }
     */
    public GetBillingSystemFormattedAddressResponse createGetBillingSystemFormattedAddressResponse() {
        return new GetBillingSystemFormattedAddressResponse();
    }

    /**
     * Create an instance of {@link GetBillingSystemFormattedAddressResponseType }
     */
    public GetBillingSystemFormattedAddressResponseType createGetBillingSystemFormattedAddressResponseType() {
        return new GetBillingSystemFormattedAddressResponseType();
    }

    /**
     * Create an instance of {@link QueryLocationQueueResponse }
     */
    public QueryLocationQueueResponse createQueryLocationQueueResponse() {
        return new QueryLocationQueueResponse();
    }

    /**
     * Create an instance of {@link QueryLocationQueueResponseType }
     */
    public QueryLocationQueueResponseType createQueryLocationQueueResponseType() {
        return new QueryLocationQueueResponseType();
    }

    /**
     * Create an instance of {@link UpdateLocationFromBilling }
     */
    public UpdateLocationFromBilling createUpdateLocationFromBilling() {
        return new UpdateLocationFromBilling();
    }

    /**
     * Create an instance of {@link UpdateLocationFromBillingRequestType }
     */
    public UpdateLocationFromBillingRequestType createUpdateLocationFromBillingRequestType() {
        return new UpdateLocationFromBillingRequestType();
    }

    /**
     * Create an instance of {@link AddMarketResponse }
     */
    public AddMarketResponse createAddMarketResponse() {
        return new AddMarketResponse();
    }

    /**
     * Create an instance of {@link QueryNodeResponse }
     */
    public QueryNodeResponse createQueryNodeResponse() {
        return new QueryNodeResponse();
    }

    /**
     * Create an instance of {@link QueryNodeResponseType }
     */
    public QueryNodeResponseType createQueryNodeResponseType() {
        return new QueryNodeResponseType();
    }

    /**
     * Create an instance of {@link QueryMsagData }
     */
    public QueryMsagData createQueryMsagData() {
        return new QueryMsagData();
    }

    /**
     * Create an instance of {@link QueryMsagDataRequestType }
     */
    public QueryMsagDataRequestType createQueryMsagDataRequestType() {
        return new QueryMsagDataRequestType();
    }

    /**
     * Create an instance of {@link AddLocation }
     */
    public AddLocation createAddLocation() {
        return new AddLocation();
    }

    /**
     * Create an instance of {@link AddLocationRequestType }
     */
    public AddLocationRequestType createAddLocationRequestType() {
        return new AddLocationRequestType();
    }

    /**
     * Create an instance of {@link CopyLocationToBilling }
     */
    public CopyLocationToBilling createCopyLocationToBilling() {
        return new CopyLocationToBilling();
    }

    /**
     * Create an instance of {@link CopyLocationToBillingRequestType }
     */
    public CopyLocationToBillingRequestType createCopyLocationToBillingRequestType() {
        return new CopyLocationToBillingRequestType();
    }

    /**
     * Create an instance of {@link ModifyLocationResponse }
     */
    public ModifyLocationResponse createModifyLocationResponse() {
        return new ModifyLocationResponse();
    }

    /**
     * Create an instance of {@link ModifyLocationResponseType }
     */
    public ModifyLocationResponseType createModifyLocationResponseType() {
        return new ModifyLocationResponseType();
    }

    /**
     * Create an instance of {@link UpdateMsagPriority }
     */
    public UpdateMsagPriority createUpdateMsagPriority() {
        return new UpdateMsagPriority();
    }

    /**
     * Create an instance of {@link UpdateMsagPriorityRequestType }
     */
    public UpdateMsagPriorityRequestType createUpdateMsagPriorityRequestType() {
        return new UpdateMsagPriorityRequestType();
    }

    /**
     * Create an instance of {@link GetLocationFromBillerResponse }
     */
    public GetLocationFromBillerResponse createGetLocationFromBillerResponse() {
        return new GetLocationFromBillerResponse();
    }

    /**
     * Create an instance of {@link GetLocationFromBillerResponseType }
     */
    public GetLocationFromBillerResponseType createGetLocationFromBillerResponseType() {
        return new GetLocationFromBillerResponseType();
    }

    /**
     * Create an instance of {@link AssociateSingleViewAddress }
     */
    public AssociateSingleViewAddress createAssociateSingleViewAddress() {
        return new AssociateSingleViewAddress();
    }

    /**
     * Create an instance of {@link AssociateSingleViewAddressType }
     */
    public AssociateSingleViewAddressType createAssociateSingleViewAddressType() {
        return new AssociateSingleViewAddressType();
    }

    /**
     * Create an instance of {@link StandardizeAddress }
     */
    public StandardizeAddress createStandardizeAddress() {
        return new StandardizeAddress();
    }

    /**
     * Create an instance of {@link StandardizeAddressRequestType }
     */
    public StandardizeAddressRequestType createStandardizeAddressRequestType() {
        return new StandardizeAddressRequestType();
    }

    /**
     * Create an instance of {@link UpdateLocationFromBillingResponse }
     */
    public UpdateLocationFromBillingResponse createUpdateLocationFromBillingResponse() {
        return new UpdateLocationFromBillingResponse();
    }

    /**
     * Create an instance of {@link UpdateLocationFromBillingResponseType }
     */
    public UpdateLocationFromBillingResponseType createUpdateLocationFromBillingResponseType() {
        return new UpdateLocationFromBillingResponseType();
    }

    /**
     * Create an instance of {@link AddLocationQueue }
     */
    public AddLocationQueue createAddLocationQueue() {
        return new AddLocationQueue();
    }

    /**
     * Create an instance of {@link AddLocationQueueRequestType }
     */
    public AddLocationQueueRequestType createAddLocationQueueRequestType() {
        return new AddLocationQueueRequestType();
    }

    /**
     * Create an instance of {@link AddMsagData }
     */
    public AddMsagData createAddMsagData() {
        return new AddMsagData();
    }

    /**
     * Create an instance of {@link AddMsagDataRequestType }
     */
    public AddMsagDataRequestType createAddMsagDataRequestType() {
        return new AddMsagDataRequestType();
    }

    /**
     * Create an instance of {@link ModifyHomeSecurityResponse }
     */
    public ModifyHomeSecurityResponse createModifyHomeSecurityResponse() {
        return new ModifyHomeSecurityResponse();
    }

    /**
     * Create an instance of {@link ModifyHomeSecurityResponseType }
     */
    public ModifyHomeSecurityResponseType createModifyHomeSecurityResponseType() {
        return new ModifyHomeSecurityResponseType();
    }

    /**
     * Create an instance of {@link StandardizeAddressResponse }
     */
    public StandardizeAddressResponse createStandardizeAddressResponse() {
        return new StandardizeAddressResponse();
    }

    /**
     * Create an instance of {@link StandardizeAddressResponseType }
     */
    public StandardizeAddressResponseType createStandardizeAddressResponseType() {
        return new StandardizeAddressResponseType();
    }

    /**
     * Create an instance of {@link GetGeoTagResponse }
     */
    public GetGeoTagResponse createGetGeoTagResponse() {
        return new GetGeoTagResponse();
    }

    /**
     * Create an instance of {@link GetGeoTagResponseType }
     */
    public GetGeoTagResponseType createGetGeoTagResponseType() {
        return new GetGeoTagResponseType();
    }

    /**
     * Create an instance of {@link AddE911AddressResponse }
     */
    public AddE911AddressResponse createAddE911AddressResponse() {
        return new AddE911AddressResponse();
    }

    /**
     * Create an instance of {@link AddE911AddressResponseType }
     */
    public AddE911AddressResponseType createAddE911AddressResponseType() {
        return new AddE911AddressResponseType();
    }

    /**
     * Create an instance of {@link DeleteNode }
     */
    public DeleteNode createDeleteNode() {
        return new DeleteNode();
    }

    /**
     * Create an instance of {@link DeleteNodeRequestType }
     */
    public DeleteNodeRequestType createDeleteNodeRequestType() {
        return new DeleteNodeRequestType();
    }

    /**
     * Create an instance of {@link QueryMarketHierarchy }
     */
    public QueryMarketHierarchy createQueryMarketHierarchy() {
        return new QueryMarketHierarchy();
    }

    /**
     * Create an instance of {@link QueryMarketHierarchyRequestType }
     */
    public QueryMarketHierarchyRequestType createQueryMarketHierarchyRequestType() {
        return new QueryMarketHierarchyRequestType();
    }

    /**
     * Create an instance of {@link GetNodeResponse }
     */
    public GetNodeResponse createGetNodeResponse() {
        return new GetNodeResponse();
    }

    /**
     * Create an instance of {@link GetNodeResponseType }
     */
    public GetNodeResponseType createGetNodeResponseType() {
        return new GetNodeResponseType();
    }

    /**
     * Create an instance of {@link DeleteMarketResponse }
     */
    public DeleteMarketResponse createDeleteMarketResponse() {
        return new DeleteMarketResponse();
    }

    /**
     * Create an instance of {@link DeleteMarketResponseType }
     */
    public DeleteMarketResponseType createDeleteMarketResponseType() {
        return new DeleteMarketResponseType();
    }

    /**
     * Create an instance of {@link GetLocationXfinityResponse }
     */
    public GetLocationXfinityResponse createGetLocationXfinityResponse() {
        return new GetLocationXfinityResponse();
    }

    /**
     * Create an instance of {@link GetLocationXfinityResponseType }
     */
    public GetLocationXfinityResponseType createGetLocationXfinityResponseType() {
        return new GetLocationXfinityResponseType();
    }

    /**
     * Create an instance of {@link QueryMarketByBoundaryResponse }
     */
    public QueryMarketByBoundaryResponse createQueryMarketByBoundaryResponse() {
        return new QueryMarketByBoundaryResponse();
    }

    /**
     * Create an instance of {@link QueryMarketByBoundaryResponseType }
     */
    public QueryMarketByBoundaryResponseType createQueryMarketByBoundaryResponseType() {
        return new QueryMarketByBoundaryResponseType();
    }

    /**
     * Create an instance of {@link RefreshCacheResponse }
     */
    public RefreshCacheResponse createRefreshCacheResponse() {
        return new RefreshCacheResponse();
    }

    /**
     * Create an instance of {@link RefreshCacheResponseType }
     */
    public RefreshCacheResponseType createRefreshCacheResponseType() {
        return new RefreshCacheResponseType();
    }

    /**
     * Create an instance of {@link DeleteLocation }
     */
    public DeleteLocation createDeleteLocation() {
        return new DeleteLocation();
    }

    /**
     * Create an instance of {@link DeleteLocationRequestType }
     */
    public DeleteLocationRequestType createDeleteLocationRequestType() {
        return new DeleteLocationRequestType();
    }

    /**
     * Create an instance of {@link GetMarketResponse }
     */
    public GetMarketResponse createGetMarketResponse() {
        return new GetMarketResponse();
    }

    /**
     * Create an instance of {@link GetMarketResponseType }
     */
    public GetMarketResponseType createGetMarketResponseType() {
        return new GetMarketResponseType();
    }

    /**
     * Create an instance of {@link DeleteNodeResponse }
     */
    public DeleteNodeResponse createDeleteNodeResponse() {
        return new DeleteNodeResponse();
    }

    /**
     * Create an instance of {@link DeleteNodeResponseType }
     */
    public DeleteNodeResponseType createDeleteNodeResponseType() {
        return new DeleteNodeResponseType();
    }

    /**
     * Create an instance of {@link DeleteE911Address }
     */
    public DeleteE911Address createDeleteE911Address() {
        return new DeleteE911Address();
    }

    /**
     * Create an instance of {@link DeleteE911AddressRequestType }
     */
    public DeleteE911AddressRequestType createDeleteE911AddressRequestType() {
        return new DeleteE911AddressRequestType();
    }

    /**
     * Create an instance of {@link GetLocationResponse }
     */
    public GetLocationResponse createGetLocationResponse() {
        return new GetLocationResponse();
    }

    /**
     * Create an instance of {@link GetLocationResponseType }
     */
    public GetLocationResponseType createGetLocationResponseType() {
        return new GetLocationResponseType();
    }

    /**
     * Create an instance of {@link StandardizeAddressByRuleResponse }
     */
    public StandardizeAddressByRuleResponse createStandardizeAddressByRuleResponse() {
        return new StandardizeAddressByRuleResponse();
    }

    /**
     * Create an instance of {@link QueryLocationXfinityResponse }
     */
    public QueryLocationXfinityResponse createQueryLocationXfinityResponse() {
        return new QueryLocationXfinityResponse();
    }

    /**
     * Create an instance of {@link QueryLocationXfinityResponseType }
     */
    public QueryLocationXfinityResponseType createQueryLocationXfinityResponseType() {
        return new QueryLocationXfinityResponseType();
    }

    /**
     * Create an instance of {@link QueryLocationByRuleResponse }
     */
    public QueryLocationByRuleResponse createQueryLocationByRuleResponse() {
        return new QueryLocationByRuleResponse();
    }

    /**
     * Create an instance of {@link AddMsagDataResponse }
     */
    public AddMsagDataResponse createAddMsagDataResponse() {
        return new AddMsagDataResponse();
    }

    /**
     * Create an instance of {@link AddMsagDataResponseType }
     */
    public AddMsagDataResponseType createAddMsagDataResponseType() {
        return new AddMsagDataResponseType();
    }

    /**
     * Create an instance of {@link GetMarket }
     */
    public GetMarket createGetMarket() {
        return new GetMarket();
    }

    /**
     * Create an instance of {@link GetMarketRequestType }
     */
    public GetMarketRequestType createGetMarketRequestType() {
        return new GetMarketRequestType();
    }

    /**
     * Create an instance of {@link GetLocationInformation }
     */
    public GetLocationInformation createGetLocationInformation() {
        return new GetLocationInformation();
    }

    /**
     * Create an instance of {@link GetLocationInformationRequestType }
     */
    public GetLocationInformationRequestType createGetLocationInformationRequestType() {
        return new GetLocationInformationRequestType();
    }

    /**
     * Create an instance of {@link QueryLocationQueue }
     */
    public QueryLocationQueue createQueryLocationQueue() {
        return new QueryLocationQueue();
    }

    /**
     * Create an instance of {@link QueryLocationQueueRequestType }
     */
    public QueryLocationQueueRequestType createQueryLocationQueueRequestType() {
        return new QueryLocationQueueRequestType();
    }

    /**
     * Create an instance of {@link StandardizeAddressByRule }
     */
    public StandardizeAddressByRule createStandardizeAddressByRule() {
        return new StandardizeAddressByRule();
    }

    /**
     * Create an instance of {@link StandardizeAddressByRuleRequestType }
     */
    public StandardizeAddressByRuleRequestType createStandardizeAddressByRuleRequestType() {
        return new StandardizeAddressByRuleRequestType();
    }

    /**
     * Create an instance of {@link DeleteSingleViewAddressAssociation }
     */
    public DeleteSingleViewAddressAssociation createDeleteSingleViewAddressAssociation() {
        return new DeleteSingleViewAddressAssociation();
    }

    /**
     * Create an instance of {@link DeleteSingleViewAddressAssociationType }
     */
    public DeleteSingleViewAddressAssociationType createDeleteSingleViewAddressAssociationType() {
        return new DeleteSingleViewAddressAssociationType();
    }

    /**
     * Create an instance of {@link QueryMsagDataResponse }
     */
    public QueryMsagDataResponse createQueryMsagDataResponse() {
        return new QueryMsagDataResponse();
    }

    /**
     * Create an instance of {@link QueryMsagDataResponseType }
     */
    public QueryMsagDataResponseType createQueryMsagDataResponseType() {
        return new QueryMsagDataResponseType();
    }

    /**
     * Create an instance of {@link ModifyMarket }
     */
    public ModifyMarket createModifyMarket() {
        return new ModifyMarket();
    }

    /**
     * Create an instance of {@link ModifyMarketRequestType }
     */
    public ModifyMarketRequestType createModifyMarketRequestType() {
        return new ModifyMarketRequestType();
    }

    /**
     * Create an instance of {@link ModifySingleViewAddressAssociation }
     */
    public ModifySingleViewAddressAssociation createModifySingleViewAddressAssociation() {
        return new ModifySingleViewAddressAssociation();
    }

    /**
     * Create an instance of {@link ModifySingleViewAddressAssociationType }
     */
    public ModifySingleViewAddressAssociationType createModifySingleViewAddressAssociationType() {
        return new ModifySingleViewAddressAssociationType();
    }

    /**
     * Create an instance of {@link QueryNode }
     */
    public QueryNode createQueryNode() {
        return new QueryNode();
    }

    /**
     * Create an instance of {@link QueryNodeRequestType }
     */
    public QueryNodeRequestType createQueryNodeRequestType() {
        return new QueryNodeRequestType();
    }

    /**
     * Create an instance of {@link DeleteLocationFromBillingResponse }
     */
    public DeleteLocationFromBillingResponse createDeleteLocationFromBillingResponse() {
        return new DeleteLocationFromBillingResponse();
    }

    /**
     * Create an instance of {@link DeleteLocationFromBillingResponseType }
     */
    public DeleteLocationFromBillingResponseType createDeleteLocationFromBillingResponseType() {
        return new DeleteLocationFromBillingResponseType();
    }

    /**
     * Create an instance of {@link QueryMarketByBoundary }
     */
    public QueryMarketByBoundary createQueryMarketByBoundary() {
        return new QueryMarketByBoundary();
    }

    /**
     * Create an instance of {@link QueryMarketByBoundaryRequestType }
     */
    public QueryMarketByBoundaryRequestType createQueryMarketByBoundaryRequestType() {
        return new QueryMarketByBoundaryRequestType();
    }

    /**
     * Create an instance of {@link QueryMarket }
     */
    public QueryMarket createQueryMarket() {
        return new QueryMarket();
    }

    /**
     * Create an instance of {@link QueryMarketRequestType }
     */
    public QueryMarketRequestType createQueryMarketRequestType() {
        return new QueryMarketRequestType();
    }

    /**
     * Create an instance of {@link ModifyNodeResponse }
     */
    public ModifyNodeResponse createModifyNodeResponse() {
        return new ModifyNodeResponse();
    }

    /**
     * Create an instance of {@link ModifyNodeResponseType }
     */
    public ModifyNodeResponseType createModifyNodeResponseType() {
        return new ModifyNodeResponseType();
    }

    /**
     * Create an instance of {@link AssociateSingleViewAddressResponse }
     */
    public AssociateSingleViewAddressResponse createAssociateSingleViewAddressResponse() {
        return new AssociateSingleViewAddressResponse();
    }

    /**
     * Create an instance of {@link ResponseStatusType }
     */
    public ResponseStatusType createResponseStatusType() {
        return new ResponseStatusType();
    }

    /**
     * Create an instance of {@link GetBillingSystemFormattedAddress }
     */
    public GetBillingSystemFormattedAddress createGetBillingSystemFormattedAddress() {
        return new GetBillingSystemFormattedAddress();
    }

    /**
     * Create an instance of {@link GetBillingSystemFormattedAddressRequestType }
     */
    public GetBillingSystemFormattedAddressRequestType createGetBillingSystemFormattedAddressRequestType() {
        return new GetBillingSystemFormattedAddressRequestType();
    }

    /**
     * Create an instance of {@link AddLocationQueueResponse }
     */
    public AddLocationQueueResponse createAddLocationQueueResponse() {
        return new AddLocationQueueResponse();
    }

    /**
     * Create an instance of {@link AddLocationQueueResponseType }
     */
    public AddLocationQueueResponseType createAddLocationQueueResponseType() {
        return new AddLocationQueueResponseType();
    }

    /**
     * Create an instance of {@link DeleteMarket }
     */
    public DeleteMarket createDeleteMarket() {
        return new DeleteMarket();
    }

    /**
     * Create an instance of {@link DeleteMarketRequestType }
     */
    public DeleteMarketRequestType createDeleteMarketRequestType() {
        return new DeleteMarketRequestType();
    }

    /**
     * Create an instance of {@link QueryMarketResponse }
     */
    public QueryMarketResponse createQueryMarketResponse() {
        return new QueryMarketResponse();
    }

    /**
     * Create an instance of {@link QueryMarketResponseType }
     */
    public QueryMarketResponseType createQueryMarketResponseType() {
        return new QueryMarketResponseType();
    }

    /**
     * Create an instance of {@link DeleteMsagAddressAssociationResponse }
     */
    public DeleteMsagAddressAssociationResponse createDeleteMsagAddressAssociationResponse() {
        return new DeleteMsagAddressAssociationResponse();
    }

    /**
     * Create an instance of {@link DeleteMsagAddressAssociationResponseType }
     */
    public DeleteMsagAddressAssociationResponseType createDeleteMsagAddressAssociationResponseType() {
        return new DeleteMsagAddressAssociationResponseType();
    }

    /**
     * Create an instance of {@link DeleteSingleViewAddressAssociationResponse }
     */
    public DeleteSingleViewAddressAssociationResponse createDeleteSingleViewAddressAssociationResponse() {
        return new DeleteSingleViewAddressAssociationResponse();
    }

    /**
     * Create an instance of {@link ModifyLocation }
     */
    public ModifyLocation createModifyLocation() {
        return new ModifyLocation();
    }

    /**
     * Create an instance of {@link ModifyLocationRequestType }
     */
    public ModifyLocationRequestType createModifyLocationRequestType() {
        return new ModifyLocationRequestType();
    }

    /**
     * Create an instance of {@link UpdateLocationInBillingResponse }
     */
    public UpdateLocationInBillingResponse createUpdateLocationInBillingResponse() {
        return new UpdateLocationInBillingResponse();
    }

    /**
     * Create an instance of {@link UpdateLocationInBillingResponseType }
     */
    public UpdateLocationInBillingResponseType createUpdateLocationInBillingResponseType() {
        return new UpdateLocationInBillingResponseType();
    }

    /**
     * Create an instance of {@link ModifySingleViewAddressAssociationResponse }
     */
    public ModifySingleViewAddressAssociationResponse createModifySingleViewAddressAssociationResponse() {
        return new ModifySingleViewAddressAssociationResponse();
    }

    /**
     * Create an instance of {@link GetLocationFromBiller }
     */
    public GetLocationFromBiller createGetLocationFromBiller() {
        return new GetLocationFromBiller();
    }

    /**
     * Create an instance of {@link GetLocationFromBillerRequestType }
     */
    public GetLocationFromBillerRequestType createGetLocationFromBillerRequestType() {
        return new GetLocationFromBillerRequestType();
    }

    /**
     * Create an instance of {@link CopyLocationToBillingResponse }
     */
    public CopyLocationToBillingResponse createCopyLocationToBillingResponse() {
        return new CopyLocationToBillingResponse();
    }

    /**
     * Create an instance of {@link CopyLocationToBillingResponseType }
     */
    public CopyLocationToBillingResponseType createCopyLocationToBillingResponseType() {
        return new CopyLocationToBillingResponseType();
    }

    /**
     * Create an instance of {@link QueryLocationGeospatialResponse }
     */
    public QueryLocationGeospatialResponse createQueryLocationGeospatialResponse() {
        return new QueryLocationGeospatialResponse();
    }

    /**
     * Create an instance of {@link QueryLocationGeospatialResponseType }
     */
    public QueryLocationGeospatialResponseType createQueryLocationGeospatialResponseType() {
        return new QueryLocationGeospatialResponseType();
    }

    /**
     * Create an instance of {@link ModifyLocationQueue }
     */
    public ModifyLocationQueue createModifyLocationQueue() {
        return new ModifyLocationQueue();
    }

    /**
     * Create an instance of {@link ModifyLocationQueueRequestType }
     */
    public ModifyLocationQueueRequestType createModifyLocationQueueRequestType() {
        return new ModifyLocationQueueRequestType();
    }

    /**
     * Create an instance of {@link AddE911Address }
     */
    public AddE911Address createAddE911Address() {
        return new AddE911Address();
    }

    /**
     * Create an instance of {@link AddE911AddressRequestType }
     */
    public AddE911AddressRequestType createAddE911AddressRequestType() {
        return new AddE911AddressRequestType();
    }

    /**
     * Create an instance of {@link AddNode }
     */
    public AddNode createAddNode() {
        return new AddNode();
    }

    /**
     * Create an instance of {@link AddNodeRequestType }
     */
    public AddNodeRequestType createAddNodeRequestType() {
        return new AddNodeRequestType();
    }

    /**
     * Create an instance of {@link ModifyHomeSecurity }
     */
    public ModifyHomeSecurity createModifyHomeSecurity() {
        return new ModifyHomeSecurity();
    }

    /**
     * Create an instance of {@link ModifyHomeSecurityRequestType }
     */
    public ModifyHomeSecurityRequestType createModifyHomeSecurityRequestType() {
        return new ModifyHomeSecurityRequestType();
    }

    /**
     * Create an instance of {@link QueryLocationXfinity }
     */
    public QueryLocationXfinity createQueryLocationXfinity() {
        return new QueryLocationXfinity();
    }

    /**
     * Create an instance of {@link QueryLocationXfinityRequestType }
     */
    public QueryLocationXfinityRequestType createQueryLocationXfinityRequestType() {
        return new QueryLocationXfinityRequestType();
    }

    /**
     * Create an instance of {@link RefreshCache }
     */
    public RefreshCache createRefreshCache() {
        return new RefreshCache();
    }

    /**
     * Create an instance of {@link RefreshCacheRequestType }
     */
    public RefreshCacheRequestType createRefreshCacheRequestType() {
        return new RefreshCacheRequestType();
    }

    /**
     * Create an instance of {@link DeleteLocationResponse }
     */
    public DeleteLocationResponse createDeleteLocationResponse() {
        return new DeleteLocationResponse();
    }

    /**
     * Create an instance of {@link DeleteLocationResponseType }
     */
    public DeleteLocationResponseType createDeleteLocationResponseType() {
        return new DeleteLocationResponseType();
    }

    /**
     * Create an instance of {@link GetLocationQueueResponse }
     */
    public GetLocationQueueResponse createGetLocationQueueResponse() {
        return new GetLocationQueueResponse();
    }

    /**
     * Create an instance of {@link GetLocationQueueResponseType }
     */
    public GetLocationQueueResponseType createGetLocationQueueResponseType() {
        return new GetLocationQueueResponseType();
    }

    /**
     * Create an instance of {@link DeleteLocationFromBilling }
     */
    public DeleteLocationFromBilling createDeleteLocationFromBilling() {
        return new DeleteLocationFromBilling();
    }

    /**
     * Create an instance of {@link DeleteLocationFromBillingRequestType }
     */
    public DeleteLocationFromBillingRequestType createDeleteLocationFromBillingRequestType() {
        return new DeleteLocationFromBillingRequestType();
    }

    /**
     * Create an instance of {@link VerifyLocation }
     */
    public VerifyLocation createVerifyLocation() {
        return new VerifyLocation();
    }

    /**
     * Create an instance of {@link VerifyLocationRequestType }
     */
    public VerifyLocationRequestType createVerifyLocationRequestType() {
        return new VerifyLocationRequestType();
    }

    /**
     * Create an instance of {@link AddNodeResponse }
     */
    public AddNodeResponse createAddNodeResponse() {
        return new AddNodeResponse();
    }

    /**
     * Create an instance of {@link AddNodeResponseType }
     */
    public AddNodeResponseType createAddNodeResponseType() {
        return new AddNodeResponseType();
    }

    /**
     * Create an instance of {@link StandardizeAddressXfinity }
     */
    public StandardizeAddressXfinity createStandardizeAddressXfinity() {
        return new StandardizeAddressXfinity();
    }

    /**
     * Create an instance of {@link StandardizeAddressXfinityRequestType }
     */
    public StandardizeAddressXfinityRequestType createStandardizeAddressXfinityRequestType() {
        return new StandardizeAddressXfinityRequestType();
    }

    /**
     * Create an instance of {@link GetGeoTag }
     */
    public GetGeoTag createGetGeoTag() {
        return new GetGeoTag();
    }

    /**
     * Create an instance of {@link GetGeoTagRequestType }
     */
    public GetGeoTagRequestType createGetGeoTagRequestType() {
        return new GetGeoTagRequestType();
    }

    /**
     * Create an instance of {@link StandardizeAddressXfinityResponse }
     */
    public StandardizeAddressXfinityResponse createStandardizeAddressXfinityResponse() {
        return new StandardizeAddressXfinityResponse();
    }

    /**
     * Create an instance of {@link StandardizeAddressXfinityResponseType }
     */
    public StandardizeAddressXfinityResponseType createStandardizeAddressXfinityResponseType() {
        return new StandardizeAddressXfinityResponseType();
    }

    /**
     * Create an instance of {@link GetLocationXfinity }
     */
    public GetLocationXfinity createGetLocationXfinity() {
        return new GetLocationXfinity();
    }

    /**
     * Create an instance of {@link GetLocationXfinityRequestType }
     */
    public GetLocationXfinityRequestType createGetLocationXfinityRequestType() {
        return new GetLocationXfinityRequestType();
    }

    /**
     * Create an instance of {@link QueryLocation }
     */
    public QueryLocation createQueryLocation() {
        return new QueryLocation();
    }

    /**
     * Create an instance of {@link QueryLocationRequestType }
     */
    public QueryLocationRequestType createQueryLocationRequestType() {
        return new QueryLocationRequestType();
    }

    /**
     * Create an instance of {@link CopyDuplicateHouseToBilling }
     */
    public CopyDuplicateHouseToBilling createCopyDuplicateHouseToBilling() {
        return new CopyDuplicateHouseToBilling();
    }

    /**
     * Create an instance of {@link CopyDuplicateHouseToBillingRequestType }
     */
    public CopyDuplicateHouseToBillingRequestType createCopyDuplicateHouseToBillingRequestType() {
        return new CopyDuplicateHouseToBillingRequestType();
    }

    /**
     * Create an instance of {@link CopyDuplicateHouseToBillingResponse }
     */
    public CopyDuplicateHouseToBillingResponse createCopyDuplicateHouseToBillingResponse() {
        return new CopyDuplicateHouseToBillingResponse();
    }

    /**
     * Create an instance of {@link CopyDuplicateHouseToBillingResponseType }
     */
    public CopyDuplicateHouseToBillingResponseType createCopyDuplicateHouseToBillingResponseType() {
        return new CopyDuplicateHouseToBillingResponseType();
    }

    /**
     * Create an instance of {@link GetBusinessServiceability }
     */
    public GetBusinessServiceability createGetBusinessServiceability() {
        return new GetBusinessServiceability();
    }

    /**
     * Create an instance of {@link GetBusinessServiceabilityRequestType }
     */
    public GetBusinessServiceabilityRequestType createGetBusinessServiceabilityRequestType() {
        return new GetBusinessServiceabilityRequestType();
    }

    /**
     * Create an instance of {@link ModifyNode }
     */
    public ModifyNode createModifyNode() {
        return new ModifyNode();
    }

    /**
     * Create an instance of {@link ModifyNodeRequestType }
     */
    public ModifyNodeRequestType createModifyNodeRequestType() {
        return new ModifyNodeRequestType();
    }

    /**
     * Create an instance of {@link GetLocationInformationResponse }
     */
    public GetLocationInformationResponse createGetLocationInformationResponse() {
        return new GetLocationInformationResponse();
    }

    /**
     * Create an instance of {@link GetLocationInformationResponseType }
     */
    public GetLocationInformationResponseType createGetLocationInformationResponseType() {
        return new GetLocationInformationResponseType();
    }

    /**
     * Create an instance of {@link UpdateLocationInBilling }
     */
    public UpdateLocationInBilling createUpdateLocationInBilling() {
        return new UpdateLocationInBilling();
    }

    /**
     * Create an instance of {@link UpdateLocationInBillingRequestType }
     */
    public UpdateLocationInBillingRequestType createUpdateLocationInBillingRequestType() {
        return new UpdateLocationInBillingRequestType();
    }

    /**
     * Create an instance of {@link GetMsagData }
     */
    public GetMsagData createGetMsagData() {
        return new GetMsagData();
    }

    /**
     * Create an instance of {@link GetMsagDataRequestType }
     */
    public GetMsagDataRequestType createGetMsagDataRequestType() {
        return new GetMsagDataRequestType();
    }

    /**
     * Create an instance of {@link AddMarket }
     */
    public AddMarket createAddMarket() {
        return new AddMarket();
    }

    /**
     * Create an instance of {@link AddMarketRequestType }
     */
    public AddMarketRequestType createAddMarketRequestType() {
        return new AddMarketRequestType();
    }

    /**
     * Create an instance of {@link GetNode }
     */
    public GetNode createGetNode() {
        return new GetNode();
    }

    /**
     * Create an instance of {@link GetNodeRequestType }
     */
    public GetNodeRequestType createGetNodeRequestType() {
        return new GetNodeRequestType();
    }

    /**
     * Create an instance of {@link VerifyLocationResponse }
     */
    public VerifyLocationResponse createVerifyLocationResponse() {
        return new VerifyLocationResponse();
    }

    /**
     * Create an instance of {@link VerifyLocationResponseType }
     */
    public VerifyLocationResponseType createVerifyLocationResponseType() {
        return new VerifyLocationResponseType();
    }

    /**
     * Create an instance of {@link ExceptionType }
     */
    public ExceptionType createExceptionType() {
        return new ExceptionType();
    }

    /**
     * Create an instance of {@link ResponseHeaderType }
     */
    public ResponseHeaderType createResponseHeaderType() {
        return new ResponseHeaderType();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link MessagesType }
     */
    public MessagesType createMessagesType() {
        return new MessagesType();
    }

    /**
     * Create an instance of {@link MessageType }
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link MDUUnitValuesResponseType }
     */
    public MDUUnitValuesResponseType createMDUUnitValuesResponseType() {
        return new MDUUnitValuesResponseType();
    }

    /**
     * Create an instance of {@link LocationLegacyDetailsCSGHouseCommentsType }
     */
    public LocationLegacyDetailsCSGHouseCommentsType createLocationLegacyDetailsCSGHouseCommentsType() {
        return new LocationLegacyDetailsCSGHouseCommentsType();
    }

    /**
     * Create an instance of {@link ModifyNodeRequestItemType }
     */
    public ModifyNodeRequestItemType createModifyNodeRequestItemType() {
        return new ModifyNodeRequestItemType();
    }

    /**
     * Create an instance of {@link MDUUnitValueSingleType }
     */
    public MDUUnitValueSingleType createMDUUnitValueSingleType() {
        return new MDUUnitValueSingleType();
    }

    /**
     * Create an instance of {@link ArrayOfLocationLegacyDetailsCSGHouseCommentType }
     */
    public ArrayOfLocationLegacyDetailsCSGHouseCommentType createArrayOfLocationLegacyDetailsCSGHouseCommentType() {
        return new ArrayOfLocationLegacyDetailsCSGHouseCommentType();
    }

    /**
     * Create an instance of {@link ArrayOfAddLocationQueueRequestItemType }
     */
    public ArrayOfAddLocationQueueRequestItemType createArrayOfAddLocationQueueRequestItemType() {
        return new ArrayOfAddLocationQueueRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfUpdateLocationFromBillingResponseItemType }
     */
    public ArrayOfUpdateLocationFromBillingResponseItemType createArrayOfUpdateLocationFromBillingResponseItemType() {
        return new ArrayOfUpdateLocationFromBillingResponseItemType();
    }

    /**
     * Create an instance of {@link CapabilitiesType }
     */
    public CapabilitiesType createCapabilitiesType() {
        return new CapabilitiesType();
    }

    /**
     * Create an instance of {@link MarketReferenceType }
     */
    public MarketReferenceType createMarketReferenceType() {
        return new MarketReferenceType();
    }

    /**
     * Create an instance of {@link GetGeoTagRequestCoordinateType }
     */
    public GetGeoTagRequestCoordinateType createGetGeoTagRequestCoordinateType() {
        return new GetGeoTagRequestCoordinateType();
    }

    /**
     * Create an instance of {@link ArrayOfLocationUpdateTypeSimpleType }
     */
    public ArrayOfLocationUpdateTypeSimpleType createArrayOfLocationUpdateTypeSimpleType() {
        return new ArrayOfLocationUpdateTypeSimpleType();
    }

    /**
     * Create an instance of {@link DeleteLocationRequestItemType }
     */
    public DeleteLocationRequestItemType createDeleteLocationRequestItemType() {
        return new DeleteLocationRequestItemType();
    }

    /**
     * Create an instance of {@link QueryNodeDefaultSearchCriteriaType }
     */
    public QueryNodeDefaultSearchCriteriaType createQueryNodeDefaultSearchCriteriaType() {
        return new QueryNodeDefaultSearchCriteriaType();
    }

    /**
     * Create an instance of {@link LocationQueueAddressType }
     */
    public LocationQueueAddressType createLocationQueueAddressType() {
        return new LocationQueueAddressType();
    }

    /**
     * Create an instance of {@link UpdateLocationInBillingRequestItemType }
     */
    public UpdateLocationInBillingRequestItemType createUpdateLocationInBillingRequestItemType() {
        return new UpdateLocationInBillingRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfMarketHierarchyPathsType }
     */
    public ArrayOfMarketHierarchyPathsType createArrayOfMarketHierarchyPathsType() {
        return new ArrayOfMarketHierarchyPathsType();
    }

    /**
     * Create an instance of {@link ArrayOfCopyDuplicateHouseToBillingResponseItemType }
     */
    public ArrayOfCopyDuplicateHouseToBillingResponseItemType createArrayOfCopyDuplicateHouseToBillingResponseItemType() {
        return new ArrayOfCopyDuplicateHouseToBillingResponseItemType();
    }

    /**
     * Create an instance of {@link ArrayOfReferenceDataPropertyType }
     */
    public ArrayOfReferenceDataPropertyType createArrayOfReferenceDataPropertyType() {
        return new ArrayOfReferenceDataPropertyType();
    }

    /**
     * Create an instance of {@link ArrayOfVerifyLocationResponseItemType }
     */
    public ArrayOfVerifyLocationResponseItemType createArrayOfVerifyLocationResponseItemType() {
        return new ArrayOfVerifyLocationResponseItemType();
    }

    /**
     * Create an instance of {@link VerifyLocationResponseItemType }
     */
    public VerifyLocationResponseItemType createVerifyLocationResponseItemType() {
        return new VerifyLocationResponseItemType();
    }

    /**
     * Create an instance of {@link AddLocationRequestItemType }
     */
    public AddLocationRequestItemType createAddLocationRequestItemType() {
        return new AddLocationRequestItemType();
    }

    /**
     * Create an instance of {@link E911RateCenterServiceableType }
     */
    public E911RateCenterServiceableType createE911RateCenterServiceableType() {
        return new E911RateCenterServiceableType();
    }

    /**
     * Create an instance of {@link ArrayOfStandardizeAddressResponseItemType }
     */
    public ArrayOfStandardizeAddressResponseItemType createArrayOfStandardizeAddressResponseItemType() {
        return new ArrayOfStandardizeAddressResponseItemType();
    }

    /**
     * Create an instance of {@link AddLocationQueueRequestItemType }
     */
    public AddLocationQueueRequestItemType createAddLocationQueueRequestItemType() {
        return new AddLocationQueueRequestItemType();
    }

    /**
     * Create an instance of {@link GeocodingConstraintsType }
     */
    public GeocodingConstraintsType createGeocodingConstraintsType() {
        return new GeocodingConstraintsType();
    }

    /**
     * Create an instance of {@link DSTLegacyMarketType }
     */
    public DSTLegacyMarketType createDSTLegacyMarketType() {
        return new DSTLegacyMarketType();
    }

    /**
     * Create an instance of {@link CSGDetailsType }
     */
    public CSGDetailsType createCSGDetailsType() {
        return new CSGDetailsType();
    }

    /**
     * Create an instance of {@link MDUUnitsResponseType }
     */
    public MDUUnitsResponseType createMDUUnitsResponseType() {
        return new MDUUnitsResponseType();
    }

    /**
     * Create an instance of {@link ArrayOfAlternatePostalAddressType }
     */
    public ArrayOfAlternatePostalAddressType createArrayOfAlternatePostalAddressType() {
        return new ArrayOfAlternatePostalAddressType();
    }

    /**
     * Create an instance of {@link UnitTypesType }
     */
    public UnitTypesType createUnitTypesType() {
        return new UnitTypesType();
    }

    /**
     * Create an instance of {@link ArrayOfLocationCustomFieldsType }
     */
    public ArrayOfLocationCustomFieldsType createArrayOfLocationCustomFieldsType() {
        return new ArrayOfLocationCustomFieldsType();
    }

    /**
     * Create an instance of {@link LocationCapabilitiesInfoType }
     */
    public LocationCapabilitiesInfoType createLocationCapabilitiesInfoType() {
        return new LocationCapabilitiesInfoType();
    }

    /**
     * Create an instance of {@link LocationLegacyDetailsCSGType }
     */
    public LocationLegacyDetailsCSGType createLocationLegacyDetailsCSGType() {
        return new LocationLegacyDetailsCSGType();
    }

    /**
     * Create an instance of {@link AddLocationQueueAddressType }
     */
    public AddLocationQueueAddressType createAddLocationQueueAddressType() {
        return new AddLocationQueueAddressType();
    }

    /**
     * Create an instance of {@link LocationMultiResponseMessageType }
     */
    public LocationMultiResponseMessageType createLocationMultiResponseMessageType() {
        return new LocationMultiResponseMessageType();
    }

    /**
     * Create an instance of {@link MarketHierarchyLevelResponseType }
     */
    public MarketHierarchyLevelResponseType createMarketHierarchyLevelResponseType() {
        return new MarketHierarchyLevelResponseType();
    }

    /**
     * Create an instance of {@link MarketHierarchyPathsType }
     */
    public MarketHierarchyPathsType createMarketHierarchyPathsType() {
        return new MarketHierarchyPathsType();
    }

    /**
     * Create an instance of {@link ZipCodeType }
     */
    public ZipCodeType createZipCodeType() {
        return new ZipCodeType();
    }

    /**
     * Create an instance of {@link ArrayOfModifyLocationQueueRequestItemType }
     */
    public ArrayOfModifyLocationQueueRequestItemType createArrayOfModifyLocationQueueRequestItemType() {
        return new ArrayOfModifyLocationQueueRequestItemType();
    }

    /**
     * Create an instance of {@link StandardizedAddressType }
     */
    public StandardizedAddressType createStandardizedAddressType() {
        return new StandardizedAddressType();
    }

    /**
     * Create an instance of {@link QueryResultSpecType }
     */
    public QueryResultSpecType createQueryResultSpecType() {
        return new QueryResultSpecType();
    }

    /**
     * Create an instance of {@link LocationDSTServicabilityTypes }
     */
    public LocationDSTServicabilityTypes createLocationDSTServicabilityTypes() {
        return new LocationDSTServicabilityTypes();
    }

    /**
     * Create an instance of {@link ArrayOfLocationMultiResponseMessageType }
     */
    public ArrayOfLocationMultiResponseMessageType createArrayOfLocationMultiResponseMessageType() {
        return new ArrayOfLocationMultiResponseMessageType();
    }

    /**
     * Create an instance of {@link ArrayOfQueryMsagDataType }
     */
    public ArrayOfQueryMsagDataType createArrayOfQueryMsagDataType() {
        return new ArrayOfQueryMsagDataType();
    }

    /**
     * Create an instance of {@link MultiDwellingUnitDetailsType }
     */
    public MultiDwellingUnitDetailsType createMultiDwellingUnitDetailsType() {
        return new MultiDwellingUnitDetailsType();
    }

    /**
     * Create an instance of {@link PostalAddressUpdateType }
     */
    public PostalAddressUpdateType createPostalAddressUpdateType() {
        return new PostalAddressUpdateType();
    }

    /**
     * Create an instance of {@link RefreshCacheResponseItemType }
     */
    public RefreshCacheResponseItemType createRefreshCacheResponseItemType() {
        return new RefreshCacheResponseItemType();
    }

    /**
     * Create an instance of {@link ArrayOfMarketHierarchyLevelResponseType }
     */
    public ArrayOfMarketHierarchyLevelResponseType createArrayOfMarketHierarchyLevelResponseType() {
        return new ArrayOfMarketHierarchyLevelResponseType();
    }

    /**
     * Create an instance of {@link ModifyMarketRequestMarketType }
     */
    public ModifyMarketRequestMarketType createModifyMarketRequestMarketType() {
        return new ModifyMarketRequestMarketType();
    }

    /**
     * Create an instance of {@link ArrayOfCopyLocationToBillingRequestItemType }
     */
    public ArrayOfCopyLocationToBillingRequestItemType createArrayOfCopyLocationToBillingRequestItemType() {
        return new ArrayOfCopyLocationToBillingRequestItemType();
    }

    /**
     * Create an instance of {@link ASOGAddressType }
     */
    public ASOGAddressType createASOGAddressType() {
        return new ASOGAddressType();
    }

    /**
     * Create an instance of {@link LocationLegacyDetailsCSGLineOfBusinessType }
     */
    public LocationLegacyDetailsCSGLineOfBusinessType createLocationLegacyDetailsCSGLineOfBusinessType() {
        return new LocationLegacyDetailsCSGLineOfBusinessType();
    }

    /**
     * Create an instance of {@link BusinessServiceabilityResponseItemType }
     */
    public BusinessServiceabilityResponseItemType createBusinessServiceabilityResponseItemType() {
        return new BusinessServiceabilityResponseItemType();
    }

    /**
     * Create an instance of {@link GeographicCoordinateMeasurementType }
     */
    public GeographicCoordinateMeasurementType createGeographicCoordinateMeasurementType() {
        return new GeographicCoordinateMeasurementType();
    }

    /**
     * Create an instance of {@link AlternateNodeName }
     */
    public AlternateNodeName createAlternateNodeName() {
        return new AlternateNodeName();
    }

    /**
     * Create an instance of {@link MarketType }
     */
    public MarketType createMarketType() {
        return new MarketType();
    }

    /**
     * Create an instance of {@link ArrayOfUpdateLocationInBillingRequestItemType }
     */
    public ArrayOfUpdateLocationInBillingRequestItemType createArrayOfUpdateLocationInBillingRequestItemType() {
        return new ArrayOfUpdateLocationInBillingRequestItemType();
    }

    /**
     * Create an instance of {@link LegacyLocationIDType }
     */
    public LegacyLocationIDType createLegacyLocationIDType() {
        return new LegacyLocationIDType();
    }

    /**
     * Create an instance of {@link MultiDwellingUnitDetailsResponseType }
     */
    public MultiDwellingUnitDetailsResponseType createMultiDwellingUnitDetailsResponseType() {
        return new MultiDwellingUnitDetailsResponseType();
    }

    /**
     * Create an instance of {@link ArrayOfBillingSystemFormattedAddressesType }
     */
    public ArrayOfBillingSystemFormattedAddressesType createArrayOfBillingSystemFormattedAddressesType() {
        return new ArrayOfBillingSystemFormattedAddressesType();
    }

    /**
     * Create an instance of {@link AddressInfoType }
     */
    public AddressInfoType createAddressInfoType() {
        return new AddressInfoType();
    }

    /**
     * Create an instance of {@link ModifyNodeResponseItemType }
     */
    public ModifyNodeResponseItemType createModifyNodeResponseItemType() {
        return new ModifyNodeResponseItemType();
    }

    /**
     * Create an instance of {@link BusinessServiceabilityType }
     */
    public BusinessServiceabilityType createBusinessServiceabilityType() {
        return new BusinessServiceabilityType();
    }

    /**
     * Create an instance of {@link ArrayOfLocationLegacyDetailsCSGLineOfBusinessType }
     */
    public ArrayOfLocationLegacyDetailsCSGLineOfBusinessType createArrayOfLocationLegacyDetailsCSGLineOfBusinessType() {
        return new ArrayOfLocationLegacyDetailsCSGLineOfBusinessType();
    }

    /**
     * Create an instance of {@link ArrayOfLocationCommentsType }
     */
    public ArrayOfLocationCommentsType createArrayOfLocationCommentsType() {
        return new ArrayOfLocationCommentsType();
    }

    /**
     * Create an instance of {@link E911AddressType }
     */
    public E911AddressType createE911AddressType() {
        return new E911AddressType();
    }

    /**
     * Create an instance of {@link QueryMarketHierarchyRequestItemType }
     */
    public QueryMarketHierarchyRequestItemType createQueryMarketHierarchyRequestItemType() {
        return new QueryMarketHierarchyRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfAddNodeRequestItemType }
     */
    public ArrayOfAddNodeRequestItemType createArrayOfAddNodeRequestItemType() {
        return new ArrayOfAddNodeRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfBusinessServiceabilityResponseItemType }
     */
    public ArrayOfBusinessServiceabilityResponseItemType createArrayOfBusinessServiceabilityResponseItemType() {
        return new ArrayOfBusinessServiceabilityResponseItemType();
    }

    /**
     * Create an instance of {@link ArrayOfDeleteLocationRequestItemType }
     */
    public ArrayOfDeleteLocationRequestItemType createArrayOfDeleteLocationRequestItemType() {
        return new ArrayOfDeleteLocationRequestItemType();
    }

    /**
     * Create an instance of {@link ReferenceDataPropertyType }
     */
    public ReferenceDataPropertyType createReferenceDataPropertyType() {
        return new ReferenceDataPropertyType();
    }

    /**
     * Create an instance of {@link QueryOrderByType }
     */
    public QueryOrderByType createQueryOrderByType() {
        return new QueryOrderByType();
    }

    /**
     * Create an instance of {@link ArrayOfStandardizeAddressXfinityAddressType }
     */
    public ArrayOfStandardizeAddressXfinityAddressType createArrayOfStandardizeAddressXfinityAddressType() {
        return new ArrayOfStandardizeAddressXfinityAddressType();
    }

    /**
     * Create an instance of {@link LegacyMarketIDType }
     */
    public LegacyMarketIDType createLegacyMarketIDType() {
        return new LegacyMarketIDType();
    }

    /**
     * Create an instance of {@link NodeReferenceType }
     */
    public NodeReferenceType createNodeReferenceType() {
        return new NodeReferenceType();
    }

    /**
     * Create an instance of {@link LocationQueueContactInfoType }
     */
    public LocationQueueContactInfoType createLocationQueueContactInfoType() {
        return new LocationQueueContactInfoType();
    }

    /**
     * Create an instance of {@link VerifyLocationRequestItemType }
     */
    public VerifyLocationRequestItemType createVerifyLocationRequestItemType() {
        return new VerifyLocationRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfModifyNodeRequestItemType }
     */
    public ArrayOfModifyNodeRequestItemType createArrayOfModifyNodeRequestItemType() {
        return new ArrayOfModifyNodeRequestItemType();
    }

    /**
     * Create an instance of {@link LocationQueueAddressCriteriaType }
     */
    public LocationQueueAddressCriteriaType createLocationQueueAddressCriteriaType() {
        return new LocationQueueAddressCriteriaType();
    }

    /**
     * Create an instance of {@link QueryLocationReferenceDataSearchParamsType }
     */
    public QueryLocationReferenceDataSearchParamsType createQueryLocationReferenceDataSearchParamsType() {
        return new QueryLocationReferenceDataSearchParamsType();
    }

    /**
     * Create an instance of {@link LocationLegacyDetailsCSGBridgerType }
     */
    public LocationLegacyDetailsCSGBridgerType createLocationLegacyDetailsCSGBridgerType() {
        return new LocationLegacyDetailsCSGBridgerType();
    }

    /**
     * Create an instance of {@link QueryMsagDataType }
     */
    public QueryMsagDataType createQueryMsagDataType() {
        return new QueryMsagDataType();
    }

    /**
     * Create an instance of {@link LocationLegacyDetailsCSGLineTagsType }
     */
    public LocationLegacyDetailsCSGLineTagsType createLocationLegacyDetailsCSGLineTagsType() {
        return new LocationLegacyDetailsCSGLineTagsType();
    }

    /**
     * Create an instance of {@link BuildingAttributesType }
     */
    public BuildingAttributesType createBuildingAttributesType() {
        return new BuildingAttributesType();
    }

    /**
     * Create an instance of {@link USPSAddressInputType }
     */
    public USPSAddressInputType createUSPSAddressInputType() {
        return new USPSAddressInputType();
    }

    /**
     * Create an instance of {@link HomeSecurityContactNumbersType }
     */
    public HomeSecurityContactNumbersType createHomeSecurityContactNumbersType() {
        return new HomeSecurityContactNumbersType();
    }

    /**
     * Create an instance of {@link ArrayOfLocationQueueReferenceType }
     */
    public ArrayOfLocationQueueReferenceType createArrayOfLocationQueueReferenceType() {
        return new ArrayOfLocationQueueReferenceType();
    }

    /**
     * Create an instance of {@link LocationLegacyDetailsCSGCustomFieldsType }
     */
    public LocationLegacyDetailsCSGCustomFieldsType createLocationLegacyDetailsCSGCustomFieldsType() {
        return new LocationLegacyDetailsCSGCustomFieldsType();
    }

    /**
     * Create an instance of {@link ArrayOfDeleteNodeRequestItemType }
     */
    public ArrayOfDeleteNodeRequestItemType createArrayOfDeleteNodeRequestItemType() {
        return new ArrayOfDeleteNodeRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfMDUUnitValuesType }
     */
    public ArrayOfMDUUnitValuesType createArrayOfMDUUnitValuesType() {
        return new ArrayOfMDUUnitValuesType();
    }

    /**
     * Create an instance of {@link MarketHierarchyResponseType }
     */
    public MarketHierarchyResponseType createMarketHierarchyResponseType() {
        return new MarketHierarchyResponseType();
    }

    /**
     * Create an instance of {@link SeasonalSuspendType }
     */
    public SeasonalSuspendType createSeasonalSuspendType() {
        return new SeasonalSuspendType();
    }

    /**
     * Create an instance of {@link ArrayOfQueryLocationReferenceDataSearchParamsType }
     */
    public ArrayOfQueryLocationReferenceDataSearchParamsType createArrayOfQueryLocationReferenceDataSearchParamsType() {
        return new ArrayOfQueryLocationReferenceDataSearchParamsType();
    }

    /**
     * Create an instance of {@link AddModifyMarketLegacyMarketDetailsType }
     */
    public AddModifyMarketLegacyMarketDetailsType createAddModifyMarketLegacyMarketDetailsType() {
        return new AddModifyMarketLegacyMarketDetailsType();
    }

    /**
     * Create an instance of {@link ArrayOfCapabilityType }
     */
    public ArrayOfCapabilityType createArrayOfCapabilityType() {
        return new ArrayOfCapabilityType();
    }

    /**
     * Create an instance of {@link CSGLegacyMarketType }
     */
    public CSGLegacyMarketType createCSGLegacyMarketType() {
        return new CSGLegacyMarketType();
    }

    /**
     * Create an instance of {@link QueryLocationDetailsType }
     */
    public QueryLocationDetailsType createQueryLocationDetailsType() {
        return new QueryLocationDetailsType();
    }

    /**
     * Create an instance of {@link ArrayOfResponseMessageType }
     */
    public ArrayOfResponseMessageType createArrayOfResponseMessageType() {
        return new ArrayOfResponseMessageType();
    }

    /**
     * Create an instance of {@link StandardizeAddressXfinityRequestedResultsType }
     */
    public StandardizeAddressXfinityRequestedResultsType createStandardizeAddressXfinityRequestedResultsType() {
        return new StandardizeAddressXfinityRequestedResultsType();
    }

    /**
     * Create an instance of {@link AddNodeResponseItemType }
     */
    public AddNodeResponseItemType createAddNodeResponseItemType() {
        return new AddNodeResponseItemType();
    }

    /**
     * Create an instance of {@link AddLocationQueueResponseItemType }
     */
    public AddLocationQueueResponseItemType createAddLocationQueueResponseItemType() {
        return new AddLocationQueueResponseItemType();
    }

    /**
     * Create an instance of {@link StandardizeAddressXfinityResponseItemType }
     */
    public StandardizeAddressXfinityResponseItemType createStandardizeAddressXfinityResponseItemType() {
        return new StandardizeAddressXfinityResponseItemType();
    }

    /**
     * Create an instance of {@link DDPDetailsType }
     */
    public DDPDetailsType createDDPDetailsType() {
        return new DDPDetailsType();
    }

    /**
     * Create an instance of {@link GeocodingPrecisionType }
     */
    public GeocodingPrecisionType createGeocodingPrecisionType() {
        return new GeocodingPrecisionType();
    }

    /**
     * Create an instance of {@link ArrayOfCSGDetailsType }
     */
    public ArrayOfCSGDetailsType createArrayOfCSGDetailsType() {
        return new ArrayOfCSGDetailsType();
    }

    /**
     * Create an instance of {@link LegacyLocationIDCriteriaType }
     */
    public LegacyLocationIDCriteriaType createLegacyLocationIDCriteriaType() {
        return new LegacyLocationIDCriteriaType();
    }

    /**
     * Create an instance of {@link GeographyInfoType }
     */
    public GeographyInfoType createGeographyInfoType() {
        return new GeographyInfoType();
    }

    /**
     * Create an instance of {@link AddNodeRequestItemType }
     */
    public AddNodeRequestItemType createAddNodeRequestItemType() {
        return new AddNodeRequestItemType();
    }

    /**
     * Create an instance of {@link LocationDetailsUpdateType }
     */
    public LocationDetailsUpdateType createLocationDetailsUpdateType() {
        return new LocationDetailsUpdateType();
    }

    /**
     * Create an instance of {@link StandardizeAddressRequestedAddrType }
     */
    public StandardizeAddressRequestedAddrType createStandardizeAddressRequestedAddrType() {
        return new StandardizeAddressRequestedAddrType();
    }

    /**
     * Create an instance of {@link BillingSystemFormattedAddressesCSGType }
     */
    public BillingSystemFormattedAddressesCSGType createBillingSystemFormattedAddressesCSGType() {
        return new BillingSystemFormattedAddressesCSGType();
    }

    /**
     * Create an instance of {@link NearestNeighborCriteriaType }
     */
    public NearestNeighborCriteriaType createNearestNeighborCriteriaType() {
        return new NearestNeighborCriteriaType();
    }

    /**
     * Create an instance of {@link ArrayOfLocationLegacyDetailsCSGType }
     */
    public ArrayOfLocationLegacyDetailsCSGType createArrayOfLocationLegacyDetailsCSGType() {
        return new ArrayOfLocationLegacyDetailsCSGType();
    }

    /**
     * Create an instance of {@link ArrayOfMDUUnitValuesResponseType }
     */
    public ArrayOfMDUUnitValuesResponseType createArrayOfMDUUnitValuesResponseType() {
        return new ArrayOfMDUUnitValuesResponseType();
    }

    /**
     * Create an instance of {@link ArrayOfMarketHierarchyNodeType }
     */
    public ArrayOfMarketHierarchyNodeType createArrayOfMarketHierarchyNodeType() {
        return new ArrayOfMarketHierarchyNodeType();
    }

    /**
     * Create an instance of {@link ModifyLocationRequestItemType }
     */
    public ModifyLocationRequestItemType createModifyLocationRequestItemType() {
        return new ModifyLocationRequestItemType();
    }

    /**
     * Create an instance of {@link DeleteNodeRequestItemType }
     */
    public DeleteNodeRequestItemType createDeleteNodeRequestItemType() {
        return new DeleteNodeRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfStandardizedAddressType }
     */
    public ArrayOfStandardizedAddressType createArrayOfStandardizedAddressType() {
        return new ArrayOfStandardizedAddressType();
    }

    /**
     * Create an instance of {@link ArrayOfMsagDataType }
     */
    public ArrayOfMsagDataType createArrayOfMsagDataType() {
        return new ArrayOfMsagDataType();
    }

    /**
     * Create an instance of {@link LegacyMarketIDCriteriaType }
     */
    public LegacyMarketIDCriteriaType createLegacyMarketIDCriteriaType() {
        return new LegacyMarketIDCriteriaType();
    }

    /**
     * Create an instance of {@link CopyDuplicateHouseToBillingResponseItemType }
     */
    public CopyDuplicateHouseToBillingResponseItemType createCopyDuplicateHouseToBillingResponseItemType() {
        return new CopyDuplicateHouseToBillingResponseItemType();
    }

    /**
     * Create an instance of {@link GetLocationXfinityRequestedResultsType }
     */
    public GetLocationXfinityRequestedResultsType createGetLocationXfinityRequestedResultsType() {
        return new GetLocationXfinityRequestedResultsType();
    }

    /**
     * Create an instance of {@link LocationLegacyDetailsCSGCustomFieldType }
     */
    public LocationLegacyDetailsCSGCustomFieldType createLocationLegacyDetailsCSGCustomFieldType() {
        return new LocationLegacyDetailsCSGCustomFieldType();
    }

    /**
     * Create an instance of {@link ArrayOfAlternateNodeName }
     */
    public ArrayOfAlternateNodeName createArrayOfAlternateNodeName() {
        return new ArrayOfAlternateNodeName();
    }

    /**
     * Create an instance of {@link TelephonyType }
     */
    public TelephonyType createTelephonyType() {
        return new TelephonyType();
    }

    /**
     * Create an instance of {@link ArrayOfLocationLegacyDetailsCSGCustomFieldType }
     */
    public ArrayOfLocationLegacyDetailsCSGCustomFieldType createArrayOfLocationLegacyDetailsCSGCustomFieldType() {
        return new ArrayOfLocationLegacyDetailsCSGCustomFieldType();
    }

    /**
     * Create an instance of {@link LocationQueueModifyContactInfoType }
     */
    public LocationQueueModifyContactInfoType createLocationQueueModifyContactInfoType() {
        return new LocationQueueModifyContactInfoType();
    }

    /**
     * Create an instance of {@link CopyLocationToBillingResponseItemType }
     */
    public CopyLocationToBillingResponseItemType createCopyLocationToBillingResponseItemType() {
        return new CopyLocationToBillingResponseItemType();
    }

    /**
     * Create an instance of {@link DeleteLocationFromBillingRequestItemType }
     */
    public DeleteLocationFromBillingRequestItemType createDeleteLocationFromBillingRequestItemType() {
        return new DeleteLocationFromBillingRequestItemType();
    }

    /**
     * Create an instance of {@link PostalAddressType }
     */
    public PostalAddressType createPostalAddressType() {
        return new PostalAddressType();
    }

    /**
     * Create an instance of {@link AddressCriteriaType }
     */
    public AddressCriteriaType createAddressCriteriaType() {
        return new AddressCriteriaType();
    }

    /**
     * Create an instance of {@link MarketHierarchyLevelInfo }
     */
    public MarketHierarchyLevelInfo createMarketHierarchyLevelInfo() {
        return new MarketHierarchyLevelInfo();
    }

    /**
     * Create an instance of {@link StandardizeAddressXfinityAddressType }
     */
    public StandardizeAddressXfinityAddressType createStandardizeAddressXfinityAddressType() {
        return new StandardizeAddressXfinityAddressType();
    }

    /**
     * Create an instance of {@link AlternatePostalAddressType }
     */
    public AlternatePostalAddressType createAlternatePostalAddressType() {
        return new AlternatePostalAddressType();
    }

    /**
     * Create an instance of {@link ArrayOfNodeReferenceType }
     */
    public ArrayOfNodeReferenceType createArrayOfNodeReferenceType() {
        return new ArrayOfNodeReferenceType();
    }

    /**
     * Create an instance of {@link UpdateLocationFromBillingResponseItemType }
     */
    public UpdateLocationFromBillingResponseItemType createUpdateLocationFromBillingResponseItemType() {
        return new UpdateLocationFromBillingResponseItemType();
    }

    /**
     * Create an instance of {@link ArrayOfLocationLegacyDetailsCSGLineTagType }
     */
    public ArrayOfLocationLegacyDetailsCSGLineTagType createArrayOfLocationLegacyDetailsCSGLineTagType() {
        return new ArrayOfLocationLegacyDetailsCSGLineTagType();
    }

    /**
     * Create an instance of {@link ArrayOfAddLocationQueueResponseItemType }
     */
    public ArrayOfAddLocationQueueResponseItemType createArrayOfAddLocationQueueResponseItemType() {
        return new ArrayOfAddLocationQueueResponseItemType();
    }

    /**
     * Create an instance of {@link ArrayOfQueryLocationDetailsType }
     */
    public ArrayOfQueryLocationDetailsType createArrayOfQueryLocationDetailsType() {
        return new ArrayOfQueryLocationDetailsType();
    }

    /**
     * Create an instance of {@link ArrayOfVerifyLocationRequestItemType }
     */
    public ArrayOfVerifyLocationRequestItemType createArrayOfVerifyLocationRequestItemType() {
        return new ArrayOfVerifyLocationRequestItemType();
    }

    /**
     * Create an instance of {@link LocationReferenceType }
     */
    public LocationReferenceType createLocationReferenceType() {
        return new LocationReferenceType();
    }

    /**
     * Create an instance of {@link BusinessServiceabilityRequestItemType }
     */
    public BusinessServiceabilityRequestItemType createBusinessServiceabilityRequestItemType() {
        return new BusinessServiceabilityRequestItemType();
    }

    /**
     * Create an instance of {@link ReasonType }
     */
    public ReasonType createReasonType() {
        return new ReasonType();
    }

    /**
     * Create an instance of {@link AddressVerificationDetailsType }
     */
    public AddressVerificationDetailsType createAddressVerificationDetailsType() {
        return new AddressVerificationDetailsType();
    }

    /**
     * Create an instance of {@link SingleViewAddressDetailsType }
     */
    public SingleViewAddressDetailsType createSingleViewAddressDetailsType() {
        return new SingleViewAddressDetailsType();
    }

    /**
     * Create an instance of {@link ArrayOfAddLocationRequestItemType }
     */
    public ArrayOfAddLocationRequestItemType createArrayOfAddLocationRequestItemType() {
        return new ArrayOfAddLocationRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfDeleteLocationFromBillingRequestItemType }
     */
    public ArrayOfDeleteLocationFromBillingRequestItemType createArrayOfDeleteLocationFromBillingRequestItemType() {
        return new ArrayOfDeleteLocationFromBillingRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfMarketReferenceType }
     */
    public ArrayOfMarketReferenceType createArrayOfMarketReferenceType() {
        return new ArrayOfMarketReferenceType();
    }

    /**
     * Create an instance of {@link ArrayOfAddNodeResponseItemType }
     */
    public ArrayOfAddNodeResponseItemType createArrayOfAddNodeResponseItemType() {
        return new ArrayOfAddNodeResponseItemType();
    }

    /**
     * Create an instance of {@link RefreshCacheRequestItemType }
     */
    public RefreshCacheRequestItemType createRefreshCacheRequestItemType() {
        return new RefreshCacheRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfModifyLocationResponseItemType }
     */
    public ArrayOfModifyLocationResponseItemType createArrayOfModifyLocationResponseItemType() {
        return new ArrayOfModifyLocationResponseItemType();
    }

    /**
     * Create an instance of {@link MsagCriteriaType }
     */
    public MsagCriteriaType createMsagCriteriaType() {
        return new MsagCriteriaType();
    }

    /**
     * Create an instance of {@link ModifyLocationQueueAddressType }
     */
    public ModifyLocationQueueAddressType createModifyLocationQueueAddressType() {
        return new ModifyLocationQueueAddressType();
    }

    /**
     * Create an instance of {@link ArrayOfCopyLocationToBillingResponseItemType }
     */
    public ArrayOfCopyLocationToBillingResponseItemType createArrayOfCopyLocationToBillingResponseItemType() {
        return new ArrayOfCopyLocationToBillingResponseItemType();
    }

    /**
     * Create an instance of {@link BillingSystemFormattedAddressesDDPType }
     */
    public BillingSystemFormattedAddressesDDPType createBillingSystemFormattedAddressesDDPType() {
        return new BillingSystemFormattedAddressesDDPType();
    }

    /**
     * Create an instance of {@link CopyDuplicateHouseToBillingRequestItemType }
     */
    public CopyDuplicateHouseToBillingRequestItemType createCopyDuplicateHouseToBillingRequestItemType() {
        return new CopyDuplicateHouseToBillingRequestItemType();
    }

    /**
     * Create an instance of {@link QueryPostalAddressType }
     */
    public QueryPostalAddressType createQueryPostalAddressType() {
        return new QueryPostalAddressType();
    }

    /**
     * Create an instance of {@link ModifyLocationResponseItemType }
     */
    public ModifyLocationResponseItemType createModifyLocationResponseItemType() {
        return new ModifyLocationResponseItemType();
    }

    /**
     * Create an instance of {@link ArrayOfCopyDuplicateHouseToBillingRequestItemType }
     */
    public ArrayOfCopyDuplicateHouseToBillingRequestItemType createArrayOfCopyDuplicateHouseToBillingRequestItemType() {
        return new ArrayOfCopyDuplicateHouseToBillingRequestItemType();
    }

    /**
     * Create an instance of {@link MDUUnitValuesType }
     */
    public MDUUnitValuesType createMDUUnitValuesType() {
        return new MDUUnitValuesType();
    }

    /**
     * Create an instance of {@link BillerInformationType }
     */
    public BillerInformationType createBillerInformationType() {
        return new BillerInformationType();
    }

    /**
     * Create an instance of {@link ArrayOfModifyLocationQueueResponseItemType }
     */
    public ArrayOfModifyLocationQueueResponseItemType createArrayOfModifyLocationQueueResponseItemType() {
        return new ArrayOfModifyLocationQueueResponseItemType();
    }

    /**
     * Create an instance of {@link OptionalZipCodeType }
     */
    public OptionalZipCodeType createOptionalZipCodeType() {
        return new OptionalZipCodeType();
    }

    /**
     * Create an instance of {@link MDUUnitsType }
     */
    public MDUUnitsType createMDUUnitsType() {
        return new MDUUnitsType();
    }

    /**
     * Create an instance of {@link ArrayOfBusinessServiceabilityRequestItemType }
     */
    public ArrayOfBusinessServiceabilityRequestItemType createArrayOfBusinessServiceabilityRequestItemType() {
        return new ArrayOfBusinessServiceabilityRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfUnitTypesType }
     */
    public ArrayOfUnitTypesType createArrayOfUnitTypesType() {
        return new ArrayOfUnitTypesType();
    }

    /**
     * Create an instance of {@link AddressSummaryCriteria }
     */
    public AddressSummaryCriteria createAddressSummaryCriteria() {
        return new AddressSummaryCriteria();
    }

    /**
     * Create an instance of {@link ArrayOfAddLocationResponseItemType }
     */
    public ArrayOfAddLocationResponseItemType createArrayOfAddLocationResponseItemType() {
        return new ArrayOfAddLocationResponseItemType();
    }

    /**
     * Create an instance of {@link NodeType }
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link VendorMarketReferenceType }
     */
    public VendorMarketReferenceType createVendorMarketReferenceType() {
        return new VendorMarketReferenceType();
    }

    /**
     * Create an instance of {@link QueryLocationAddressSearchType }
     */
    public QueryLocationAddressSearchType createQueryLocationAddressSearchType() {
        return new QueryLocationAddressSearchType();
    }

    /**
     * Create an instance of {@link ArrayOfLegacyLocationIDType }
     */
    public ArrayOfLegacyLocationIDType createArrayOfLegacyLocationIDType() {
        return new ArrayOfLegacyLocationIDType();
    }

    /**
     * Create an instance of {@link ReferenceDataItemType }
     */
    public ReferenceDataItemType createReferenceDataItemType() {
        return new ReferenceDataItemType();
    }

    /**
     * Create an instance of {@link DDPBillerInformationType }
     */
    public DDPBillerInformationType createDDPBillerInformationType() {
        return new DDPBillerInformationType();
    }

    /**
     * Create an instance of {@link LocationTelephonyType }
     */
    public LocationTelephonyType createLocationTelephonyType() {
        return new LocationTelephonyType();
    }

    /**
     * Create an instance of {@link ArrayOfGeographicCoordinatePointType }
     */
    public ArrayOfGeographicCoordinatePointType createArrayOfGeographicCoordinatePointType() {
        return new ArrayOfGeographicCoordinatePointType();
    }

    /**
     * Create an instance of {@link ArrayOfStandardizeAddressRequestedAddrType }
     */
    public ArrayOfStandardizeAddressRequestedAddrType createArrayOfStandardizeAddressRequestedAddrType() {
        return new ArrayOfStandardizeAddressRequestedAddrType();
    }

    /**
     * Create an instance of {@link GeocodingCustomMatchModeType }
     */
    public GeocodingCustomMatchModeType createGeocodingCustomMatchModeType() {
        return new GeocodingCustomMatchModeType();
    }

    /**
     * Create an instance of {@link ArrayOfBusinessServiceabilityType }
     */
    public ArrayOfBusinessServiceabilityType createArrayOfBusinessServiceabilityType() {
        return new ArrayOfBusinessServiceabilityType();
    }

    /**
     * Create an instance of {@link AddressStandardizationCriteriaType }
     */
    public AddressStandardizationCriteriaType createAddressStandardizationCriteriaType() {
        return new AddressStandardizationCriteriaType();
    }

    /**
     * Create an instance of {@link ArrayOfModifyNodeResponseItemType }
     */
    public ArrayOfModifyNodeResponseItemType createArrayOfModifyNodeResponseItemType() {
        return new ArrayOfModifyNodeResponseItemType();
    }

    /**
     * Create an instance of {@link LocationNetworkConnectivityType }
     */
    public LocationNetworkConnectivityType createLocationNetworkConnectivityType() {
        return new LocationNetworkConnectivityType();
    }

    /**
     * Create an instance of {@link E911AvailabilityType }
     */
    public E911AvailabilityType createE911AvailabilityType() {
        return new E911AvailabilityType();
    }

    /**
     * Create an instance of {@link StandardizeAddressResponseItemType }
     */
    public StandardizeAddressResponseItemType createStandardizeAddressResponseItemType() {
        return new StandardizeAddressResponseItemType();
    }

    /**
     * Create an instance of {@link LocationGeographyType }
     */
    public LocationGeographyType createLocationGeographyType() {
        return new LocationGeographyType();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link LocationType }
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link MarketCriteriaType }
     */
    public MarketCriteriaType createMarketCriteriaType() {
        return new MarketCriteriaType();
    }

    /**
     * Create an instance of {@link ArrayOfModifyLocationRequestItemType }
     */
    public ArrayOfModifyLocationRequestItemType createArrayOfModifyLocationRequestItemType() {
        return new ArrayOfModifyLocationRequestItemType();
    }

    /**
     * Create an instance of {@link LocationLegacyDetailsCSGLineTagType }
     */
    public LocationLegacyDetailsCSGLineTagType createLocationLegacyDetailsCSGLineTagType() {
        return new LocationLegacyDetailsCSGLineTagType();
    }

    /**
     * Create an instance of {@link CopyLocationToBillingRequestItemType }
     */
    public CopyLocationToBillingRequestItemType createCopyLocationToBillingRequestItemType() {
        return new CopyLocationToBillingRequestItemType();
    }

    /**
     * Create an instance of {@link LocationDetailsType }
     */
    public LocationDetailsType createLocationDetailsType() {
        return new LocationDetailsType();
    }

    /**
     * Create an instance of {@link UpdateLocationFromBillingRequestItemType }
     */
    public UpdateLocationFromBillingRequestItemType createUpdateLocationFromBillingRequestItemType() {
        return new UpdateLocationFromBillingRequestItemType();
    }

    /**
     * Create an instance of {@link BoundaryCriteriaType }
     */
    public BoundaryCriteriaType createBoundaryCriteriaType() {
        return new BoundaryCriteriaType();
    }

    /**
     * Create an instance of {@link LocationServiceabilityUpdateType }
     */
    public LocationServiceabilityUpdateType createLocationServiceabilityUpdateType() {
        return new LocationServiceabilityUpdateType();
    }

    /**
     * Create an instance of {@link BillingSystemFormattedAddressesType }
     */
    public BillingSystemFormattedAddressesType createBillingSystemFormattedAddressesType() {
        return new BillingSystemFormattedAddressesType();
    }

    /**
     * Create an instance of {@link AddressXfinityCriteriaType }
     */
    public AddressXfinityCriteriaType createAddressXfinityCriteriaType() {
        return new AddressXfinityCriteriaType();
    }

    /**
     * Create an instance of {@link GeocodingResultsType }
     */
    public GeocodingResultsType createGeocodingResultsType() {
        return new GeocodingResultsType();
    }

    /**
     * Create an instance of {@link LocationCommentsType }
     */
    public LocationCommentsType createLocationCommentsType() {
        return new LocationCommentsType();
    }

    /**
     * Create an instance of {@link GeographyType }
     */
    public GeographyType createGeographyType() {
        return new GeographyType();
    }

    /**
     * Create an instance of {@link ArrayOfVendorMarketReferenceType }
     */
    public ArrayOfVendorMarketReferenceType createArrayOfVendorMarketReferenceType() {
        return new ArrayOfVendorMarketReferenceType();
    }

    /**
     * Create an instance of {@link QueryMarketAddressSearchType }
     */
    public QueryMarketAddressSearchType createQueryMarketAddressSearchType() {
        return new QueryMarketAddressSearchType();
    }

    /**
     * Create an instance of {@link CSGBillerInformationType }
     */
    public CSGBillerInformationType createCSGBillerInformationType() {
        return new CSGBillerInformationType();
    }

    /**
     * Create an instance of {@link AddressStandardizationConstraintCriteriaType }
     */
    public AddressStandardizationConstraintCriteriaType createAddressStandardizationConstraintCriteriaType() {
        return new AddressStandardizationConstraintCriteriaType();
    }

    /**
     * Create an instance of {@link ArrayOfLocationLegacyDetailsDSTType }
     */
    public ArrayOfLocationLegacyDetailsDSTType createArrayOfLocationLegacyDetailsDSTType() {
        return new ArrayOfLocationLegacyDetailsDSTType();
    }

    /**
     * Create an instance of {@link ModifyLocationHouseAssociationType }
     */
    public ModifyLocationHouseAssociationType createModifyLocationHouseAssociationType() {
        return new ModifyLocationHouseAssociationType();
    }

    /**
     * Create an instance of {@link ArrayOfReferenceDataItemType }
     */
    public ArrayOfReferenceDataItemType createArrayOfReferenceDataItemType() {
        return new ArrayOfReferenceDataItemType();
    }

    /**
     * Create an instance of {@link NearestNeighborCriteriaStartingPointType }
     */
    public NearestNeighborCriteriaStartingPointType createNearestNeighborCriteriaStartingPointType() {
        return new NearestNeighborCriteriaStartingPointType();
    }

    /**
     * Create an instance of {@link MarketHierarchyNodeType }
     */
    public MarketHierarchyNodeType createMarketHierarchyNodeType() {
        return new MarketHierarchyNodeType();
    }

    /**
     * Create an instance of {@link ArrayOfMDUUnitValueSingleType }
     */
    public ArrayOfMDUUnitValueSingleType createArrayOfMDUUnitValueSingleType() {
        return new ArrayOfMDUUnitValueSingleType();
    }

    /**
     * Create an instance of {@link ArrayOfQueryAddressResponseType }
     */
    public ArrayOfQueryAddressResponseType createArrayOfQueryAddressResponseType() {
        return new ArrayOfQueryAddressResponseType();
    }

    /**
     * Create an instance of {@link HomeSecurityType }
     */
    public HomeSecurityType createHomeSecurityType() {
        return new HomeSecurityType();
    }

    /**
     * Create an instance of {@link TelephonyInfoType }
     */
    public TelephonyInfoType createTelephonyInfoType() {
        return new TelephonyInfoType();
    }

    /**
     * Create an instance of {@link LocationLegacyDetailsCSGHouseCommentType }
     */
    public LocationLegacyDetailsCSGHouseCommentType createLocationLegacyDetailsCSGHouseCommentType() {
        return new LocationLegacyDetailsCSGHouseCommentType();
    }

    /**
     * Create an instance of {@link ArrayOfMDUUnitValueRangeType }
     */
    public ArrayOfMDUUnitValueRangeType createArrayOfMDUUnitValueRangeType() {
        return new ArrayOfMDUUnitValueRangeType();
    }

    /**
     * Create an instance of {@link StandardizedAddressXfinityType }
     */
    public StandardizedAddressXfinityType createStandardizedAddressXfinityType() {
        return new StandardizedAddressXfinityType();
    }

    /**
     * Create an instance of {@link ArrayOfStandardizedAddressXfinityType }
     */
    public ArrayOfStandardizedAddressXfinityType createArrayOfStandardizedAddressXfinityType() {
        return new ArrayOfStandardizedAddressXfinityType();
    }

    /**
     * Create an instance of {@link GeographicCoordinatePointType }
     */
    public GeographicCoordinatePointType createGeographicCoordinatePointType() {
        return new GeographicCoordinatePointType();
    }

    /**
     * Create an instance of {@link MsagDataType }
     */
    public MsagDataType createMsagDataType() {
        return new MsagDataType();
    }

    /**
     * Create an instance of {@link ArrayOfStandardizeAddressXfinityResponseItemType }
     */
    public ArrayOfStandardizeAddressXfinityResponseItemType createArrayOfStandardizeAddressXfinityResponseItemType() {
        return new ArrayOfStandardizeAddressXfinityResponseItemType();
    }

    /**
     * Create an instance of {@link GeospatialShapePolygonType }
     */
    public GeospatialShapePolygonType createGeospatialShapePolygonType() {
        return new GeospatialShapePolygonType();
    }

    /**
     * Create an instance of {@link LocationLegacyDetailsDSTType }
     */
    public LocationLegacyDetailsDSTType createLocationLegacyDetailsDSTType() {
        return new LocationLegacyDetailsDSTType();
    }

    /**
     * Create an instance of {@link ArrayOfQueryOrderByType }
     */
    public ArrayOfQueryOrderByType createArrayOfQueryOrderByType() {
        return new ArrayOfQueryOrderByType();
    }

    /**
     * Create an instance of {@link MarketCapabilitiesType }
     */
    public MarketCapabilitiesType createMarketCapabilitiesType() {
        return new MarketCapabilitiesType();
    }

    /**
     * Create an instance of {@link ModifyLocationQueueRequestItemType }
     */
    public ModifyLocationQueueRequestItemType createModifyLocationQueueRequestItemType() {
        return new ModifyLocationQueueRequestItemType();
    }

    /**
     * Create an instance of {@link ArrayOfMarketCriteriaType }
     */
    public ArrayOfMarketCriteriaType createArrayOfMarketCriteriaType() {
        return new ArrayOfMarketCriteriaType();
    }

    /**
     * Create an instance of {@link GeospatialSearchCriteriaType }
     */
    public GeospatialSearchCriteriaType createGeospatialSearchCriteriaType() {
        return new GeospatialSearchCriteriaType();
    }

    /**
     * Create an instance of {@link ArrayOfModifyLocationRequestDetailsType }
     */
    public ArrayOfModifyLocationRequestDetailsType createArrayOfModifyLocationRequestDetailsType() {
        return new ArrayOfModifyLocationRequestDetailsType();
    }

    /**
     * Create an instance of {@link ModifyLocationRequestDetailsType }
     */
    public ModifyLocationRequestDetailsType createModifyLocationRequestDetailsType() {
        return new ModifyLocationRequestDetailsType();
    }

    /**
     * Create an instance of {@link ResponseMessageType }
     */
    public ResponseMessageType createResponseMessageType() {
        return new ResponseMessageType();
    }

    /**
     * Create an instance of {@link AddLocationResponseItemType }
     */
    public AddLocationResponseItemType createAddLocationResponseItemType() {
        return new AddLocationResponseItemType();
    }

    /**
     * Create an instance of {@link TimeZoneType }
     */
    public TimeZoneType createTimeZoneType() {
        return new TimeZoneType();
    }

    /**
     * Create an instance of {@link ModifyLocationQueueResponseItemType }
     */
    public ModifyLocationQueueResponseItemType createModifyLocationQueueResponseItemType() {
        return new ModifyLocationQueueResponseItemType();
    }

    /**
     * Create an instance of {@link BusinessServiceabilityAttributesType }
     */
    public BusinessServiceabilityAttributesType createBusinessServiceabilityAttributesType() {
        return new BusinessServiceabilityAttributesType();
    }

    /**
     * Create an instance of {@link ArrayOfDDPDetailsType }
     */
    public ArrayOfDDPDetailsType createArrayOfDDPDetailsType() {
        return new ArrayOfDDPDetailsType();
    }

    /**
     * Create an instance of {@link BillingDetailsInfoType }
     */
    public BillingDetailsInfoType createBillingDetailsInfoType() {
        return new BillingDetailsInfoType();
    }

    /**
     * Create an instance of {@link QueryAddressResponseType }
     */
    public QueryAddressResponseType createQueryAddressResponseType() {
        return new QueryAddressResponseType();
    }

    /**
     * Create an instance of {@link ArrayOfRefreshCacheRequestItemType }
     */
    public ArrayOfRefreshCacheRequestItemType createArrayOfRefreshCacheRequestItemType() {
        return new ArrayOfRefreshCacheRequestItemType();
    }

    /**
     * Create an instance of {@link AddMarketRequestMarketType }
     */
    public AddMarketRequestMarketType createAddMarketRequestMarketType() {
        return new AddMarketRequestMarketType();
    }

    /**
     * Create an instance of {@link ArrayOfRefreshCacheResponseItemType }
     */
    public ArrayOfRefreshCacheResponseItemType createArrayOfRefreshCacheResponseItemType() {
        return new ArrayOfRefreshCacheResponseItemType();
    }

    /**
     * Create an instance of {@link CapabilityType }
     */
    public CapabilityType createCapabilityType() {
        return new CapabilityType();
    }

    /**
     * Create an instance of {@link GeocodedAddressType }
     */
    public GeocodedAddressType createGeocodedAddressType() {
        return new GeocodedAddressType();
    }

    /**
     * Create an instance of {@link GetLocationQueueReferenceType }
     */
    public GetLocationQueueReferenceType createGetLocationQueueReferenceType() {
        return new GetLocationQueueReferenceType();
    }

    /**
     * Create an instance of {@link LocationCustomFieldsType }
     */
    public LocationCustomFieldsType createLocationCustomFieldsType() {
        return new LocationCustomFieldsType();
    }

    /**
     * Create an instance of {@link LocationLegacyDetailsType }
     */
    public LocationLegacyDetailsType createLocationLegacyDetailsType() {
        return new LocationLegacyDetailsType();
    }

    /**
     * Create an instance of {@link MDUUnitValueRangeType }
     */
    public MDUUnitValueRangeType createMDUUnitValueRangeType() {
        return new MDUUnitValueRangeType();
    }

    /**
     * Create an instance of {@link LocationQueueReferenceType }
     */
    public LocationQueueReferenceType createLocationQueueReferenceType() {
        return new LocationQueueReferenceType();
    }

    /**
     * Create an instance of {@link ArrayOfLocationReferenceType }
     */
    public ArrayOfLocationReferenceType createArrayOfLocationReferenceType() {
        return new ArrayOfLocationReferenceType();
    }

    /**
     * Create an instance of {@link AddressCriteriaByRulesType }
     */
    public AddressCriteriaByRulesType createAddressCriteriaByRulesType() {
        return new AddressCriteriaByRulesType();
    }

    /**
     * Create an instance of {@link ArrayOfUpdateLocationFromBillingRequestItemType }
     */
    public ArrayOfUpdateLocationFromBillingRequestItemType createArrayOfUpdateLocationFromBillingRequestItemType() {
        return new ArrayOfUpdateLocationFromBillingRequestItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/types", name = "requestHeader")
    public JAXBElement<RequestHeaderType> createRequestHeader(RequestHeaderType value) {
        return new JAXBElement<RequestHeaderType>(_RequestHeader_QNAME, RequestHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseHeaderType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/types", name = "responseHeader")
    public JAXBElement<ResponseHeaderType> createResponseHeader(ResponseHeaderType value) {
        return new JAXBElement<ResponseHeaderType>(_ResponseHeader_QNAME, ResponseHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/types", name = "serviceFault")
    public JAXBElement<ExceptionType> createServiceFault(ExceptionType value) {
        return new JAXBElement<ExceptionType>(_ServiceFault_QNAME, ExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMsagPriorityResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "updateMsagPriorityReturn", scope = UpdateMsagPriorityResponse.class)
    public JAXBElement<UpdateMsagPriorityResponseType> createUpdateMsagPriorityResponseUpdateMsagPriorityReturn(UpdateMsagPriorityResponseType value) {
        return new JAXBElement<UpdateMsagPriorityResponseType>(_UpdateMsagPriorityResponseUpdateMsagPriorityReturn_QNAME, UpdateMsagPriorityResponseType.class, UpdateMsagPriorityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLocationFromBillingResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "updateLocationFromBillingReturn", scope = UpdateLocationFromBillingResponse.class)
    public JAXBElement<UpdateLocationFromBillingResponseType> createUpdateLocationFromBillingResponseUpdateLocationFromBillingReturn(UpdateLocationFromBillingResponseType value) {
        return new JAXBElement<UpdateLocationFromBillingResponseType>(_UpdateLocationFromBillingResponseUpdateLocationFromBillingReturn_QNAME, UpdateLocationFromBillingResponseType.class, UpdateLocationFromBillingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyLocationToBillingResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "copyLocationToBillingReturn", scope = CopyLocationToBillingResponse.class)
    public JAXBElement<CopyLocationToBillingResponseType> createCopyLocationToBillingResponseCopyLocationToBillingReturn(CopyLocationToBillingResponseType value) {
        return new JAXBElement<CopyLocationToBillingResponseType>(_CopyLocationToBillingResponseCopyLocationToBillingReturn_QNAME, CopyLocationToBillingResponseType.class, CopyLocationToBillingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyLocationRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "VerifyLocation", scope = VerifyLocation.class)
    public JAXBElement<VerifyLocationRequestType> createVerifyLocationVerifyLocation(VerifyLocationRequestType value) {
        return new JAXBElement<VerifyLocationRequestType>(_VerifyLocationVerifyLocation_QNAME, VerifyLocationRequestType.class, VerifyLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unitTypes", scope = LocationQueueAddressType.class)
    public JAXBElement<ArrayOfUnitTypesType> createLocationQueueAddressTypeUnitTypes(ArrayOfUnitTypesType value) {
        return new JAXBElement<ArrayOfUnitTypesType>(_LocationQueueAddressTypeUnitTypes_QNAME, ArrayOfUnitTypesType.class, LocationQueueAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "country", scope = LocationQueueAddressType.class)
    public JAXBElement<CountryCodeType> createLocationQueueAddressTypeCountry(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_LocationQueueAddressTypeCountry_QNAME, CountryCodeType.class, LocationQueueAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "TemplateHouseNumber", scope = CopyDuplicateHouseToBillingRequestItemType.class)
    public JAXBElement<String> createCopyDuplicateHouseToBillingRequestItemTypeTemplateHouseNumber(String value) {
        return new JAXBElement<String>(_CopyDuplicateHouseToBillingRequestItemTypeTemplateHouseNumber_QNAME, String.class, CopyDuplicateHouseToBillingRequestItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "GetLocation", scope = GetLocation.class)
    public JAXBElement<GetLocationRequestType> createGetLocationGetLocation(GetLocationRequestType value) {
        return new JAXBElement<GetLocationRequestType>(_GetLocationGetLocation_QNAME, GetLocationRequestType.class, GetLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unitTypes", scope = PostalAddressType.class)
    public JAXBElement<ArrayOfUnitTypesType> createPostalAddressTypeUnitTypes(ArrayOfUnitTypesType value) {
        return new JAXBElement<ArrayOfUnitTypesType>(_LocationQueueAddressTypeUnitTypes_QNAME, ArrayOfUnitTypesType.class, PostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dwellingCode", scope = PostalAddressType.class)
    public JAXBElement<String> createPostalAddressTypeDwellingCode(String value) {
        return new JAXBElement<String>(_PostalAddressTypeDwellingCode_QNAME, String.class, PostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "country", scope = PostalAddressType.class)
    public JAXBElement<CountryCodeType> createPostalAddressTypeCountry(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_LocationQueueAddressTypeCountry_QNAME, CountryCodeType.class, PostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetPreDirection", scope = PostalAddressType.class)
    public JAXBElement<String> createPostalAddressTypeStreetPreDirection(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetPreDirection_QNAME, String.class, PostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumberSuffix", scope = PostalAddressType.class)
    public JAXBElement<String> createPostalAddressTypeHouseNumberSuffix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumberSuffix_QNAME, String.class, PostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumber", scope = PostalAddressType.class)
    public JAXBElement<String> createPostalAddressTypeHouseNumber(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumber_QNAME, String.class, PostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetPostDirection", scope = PostalAddressType.class)
    public JAXBElement<String> createPostalAddressTypeStreetPostDirection(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetPostDirection_QNAME, String.class, PostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetSuffix", scope = PostalAddressType.class)
    public JAXBElement<String> createPostalAddressTypeStreetSuffix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetSuffix_QNAME, String.class, PostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumberPrefix", scope = PostalAddressType.class)
    public JAXBElement<String> createPostalAddressTypeHouseNumberPrefix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumberPrefix_QNAME, String.class, PostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodedAddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "geocodedAddress", scope = StandardizedAddressXfinityType.class)
    public JAXBElement<GeocodedAddressType> createStandardizedAddressXfinityTypeGeocodedAddress(GeocodedAddressType value) {
        return new JAXBElement<GeocodedAddressType>(_StandardizedAddressXfinityTypeGeocodedAddress_QNAME, GeocodedAddressType.class, StandardizedAddressXfinityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographyType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "geography", scope = StandardizedAddressXfinityType.class)
    public JAXBElement<GeographyType> createStandardizedAddressXfinityTypeGeography(GeographyType value) {
        return new JAXBElement<GeographyType>(_StandardizedAddressXfinityTypeGeography_QNAME, GeographyType.class, StandardizedAddressXfinityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelephonyType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "telephony", scope = StandardizedAddressXfinityType.class)
    public JAXBElement<TelephonyType> createStandardizedAddressXfinityTypeTelephony(TelephonyType value) {
        return new JAXBElement<TelephonyType>(_StandardizedAddressXfinityTypeTelephony_QNAME, TelephonyType.class, StandardizedAddressXfinityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMsagDataType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "msag", scope = StandardizedAddressXfinityType.class)
    public JAXBElement<ArrayOfMsagDataType> createStandardizedAddressXfinityTypeMsag(ArrayOfMsagDataType value) {
        return new JAXBElement<ArrayOfMsagDataType>(_StandardizedAddressXfinityTypeMsag_QNAME, ArrayOfMsagDataType.class, StandardizedAddressXfinityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationXfinityRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryLocationXfinity", scope = QueryLocationXfinity.class)
    public JAXBElement<QueryLocationXfinityRequestType> createQueryLocationXfinityQueryLocationXfinity(QueryLocationXfinityRequestType value) {
        return new JAXBElement<QueryLocationXfinityRequestType>(_QueryLocationXfinityQueryLocationXfinity_QNAME, QueryLocationXfinityRequestType.class, QueryLocationXfinity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoTagRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "GetGeoTag", scope = GetGeoTag.class)
    public JAXBElement<GetGeoTagRequestType> createGetGeoTagGetGeoTag(GetGeoTagRequestType value) {
        return new JAXBElement<GetGeoTagRequestType>(_GetGeoTagGetGeoTag_QNAME, GetGeoTagRequestType.class, GetGeoTag.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "singleViewID", scope = DeleteSingleViewAddressAssociationType.class)
    public JAXBElement<String> createDeleteSingleViewAddressAssociationTypeSingleViewID(String value) {
        return new JAXBElement<String>(_DeleteSingleViewAddressAssociationTypeSingleViewID_QNAME, String.class, DeleteSingleViewAddressAssociationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "addressID", scope = DeleteSingleViewAddressAssociationType.class)
    public JAXBElement<String> createDeleteSingleViewAddressAssociationTypeAddressID(String value) {
        return new JAXBElement<String>(_DeleteSingleViewAddressAssociationTypeAddressID_QNAME, String.class, DeleteSingleViewAddressAssociationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillingSystemFormattedAddressRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "GetBillingSystemFormattedAddress", scope = GetBillingSystemFormattedAddress.class)
    public JAXBElement<GetBillingSystemFormattedAddressRequestType> createGetBillingSystemFormattedAddressGetBillingSystemFormattedAddress(GetBillingSystemFormattedAddressRequestType value) {
        return new JAXBElement<GetBillingSystemFormattedAddressRequestType>(_GetBillingSystemFormattedAddressGetBillingSystemFormattedAddress_QNAME, GetBillingSystemFormattedAddressRequestType.class, GetBillingSystemFormattedAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "rateCenterName", scope = TelephonyType.class)
    public JAXBElement<String> createTelephonyTypeRateCenterName(String value) {
        return new JAXBElement<String>(_TelephonyTypeRateCenterName_QNAME, String.class, TelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "TNOrderPool", scope = TelephonyType.class)
    public JAXBElement<String> createTelephonyTypeTNOrderPool(String value) {
        return new JAXBElement<String>(_TelephonyTypeTNOrderPool_QNAME, String.class, TelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "LATA", scope = TelephonyType.class)
    public JAXBElement<String> createTelephonyTypeLATA(String value) {
        return new JAXBElement<String>(_TelephonyTypeLATA_QNAME, String.class, TelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "wireCenter", scope = TelephonyType.class)
    public JAXBElement<String> createTelephonyTypeWireCenter(String value) {
        return new JAXBElement<String>(_TelephonyTypeWireCenter_QNAME, String.class, TelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "LATAName", scope = TelephonyType.class)
    public JAXBElement<String> createTelephonyTypeLATAName(String value) {
        return new JAXBElement<String>(_TelephonyTypeLATAName_QNAME, String.class, TelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link E911RateCenterServiceableType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "rateCenterServiceable", scope = TelephonyType.class)
    public JAXBElement<E911RateCenterServiceableType> createTelephonyTypeRateCenterServiceable(E911RateCenterServiceableType value) {
        return new JAXBElement<E911RateCenterServiceableType>(_TelephonyTypeRateCenterServiceable_QNAME, E911RateCenterServiceableType.class, TelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "ILECName", scope = TelephonyType.class)
    public JAXBElement<String> createTelephonyTypeILECName(String value) {
        return new JAXBElement<String>(_TelephonyTypeILECName_QNAME, String.class, TelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "PSAPAgency", scope = TelephonyType.class)
    public JAXBElement<String> createTelephonyTypePSAPAgency(String value) {
        return new JAXBElement<String>(_TelephonyTypePSAPAgency_QNAME, String.class, TelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "PSAPId", scope = TelephonyType.class)
    public JAXBElement<String> createTelephonyTypePSAPId(String value) {
        return new JAXBElement<String>(_TelephonyTypePSAPId_QNAME, String.class, TelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link E911RateCenterCertificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "rateCenterCertification", scope = TelephonyType.class)
    public JAXBElement<E911RateCenterCertificationType> createTelephonyTypeRateCenterCertification(E911RateCenterCertificationType value) {
        return new JAXBElement<E911RateCenterCertificationType>(_TelephonyTypeRateCenterCertification_QNAME, E911RateCenterCertificationType.class, TelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMsagDataRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "GetMsagData", scope = GetMsagData.class)
    public JAXBElement<GetMsagDataRequestType> createGetMsagDataGetMsagData(GetMsagDataRequestType value) {
        return new JAXBElement<GetMsagDataRequestType>(_GetMsagDataGetMsagData_QNAME, GetMsagDataRequestType.class, GetMsagData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBusinessServiceabilityResponseItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "BusinessServiceabilityResponses", scope = GetBusinessServiceabilityResponseType.class)
    public JAXBElement<ArrayOfBusinessServiceabilityResponseItemType> createGetBusinessServiceabilityResponseTypeBusinessServiceabilityResponses(ArrayOfBusinessServiceabilityResponseItemType value) {
        return new JAXBElement<ArrayOfBusinessServiceabilityResponseItemType>(_GetBusinessServiceabilityResponseTypeBusinessServiceabilityResponses_QNAME, ArrayOfBusinessServiceabilityResponseItemType.class, GetBusinessServiceabilityResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationXfinityResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryLocationXfinityReturn", scope = QueryLocationXfinityResponse.class)
    public JAXBElement<QueryLocationXfinityResponseType> createQueryLocationXfinityResponseQueryLocationXfinityReturn(QueryLocationXfinityResponseType value) {
        return new JAXBElement<QueryLocationXfinityResponseType>(_QueryLocationXfinityResponseQueryLocationXfinityReturn_QNAME, QueryLocationXfinityResponseType.class, QueryLocationXfinityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "Transport", scope = BusinessServiceabilityType.class)
    public JAXBElement<TransportType> createBusinessServiceabilityTypeTransport(TransportType value) {
        return new JAXBElement<TransportType>(_BusinessServiceabilityTypeTransport_QNAME, TransportType.class, BusinessServiceabilityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessServiceabilityAttributesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "Attributes", scope = BusinessServiceabilityType.class)
    public JAXBElement<BusinessServiceabilityAttributesType> createBusinessServiceabilityTypeAttributes(BusinessServiceabilityAttributesType value) {
        return new JAXBElement<BusinessServiceabilityAttributesType>(_BusinessServiceabilityTypeAttributes_QNAME, BusinessServiceabilityAttributesType.class, BusinessServiceabilityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "SupportedProducts", scope = BusinessServiceabilityType.class)
    public JAXBElement<ArrayOfString> createBusinessServiceabilityTypeSupportedProducts(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_BusinessServiceabilityTypeSupportedProducts_QNAME, ArrayOfString.class, BusinessServiceabilityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryLocationReturn", scope = QueryLocationResponse.class)
    public JAXBElement<QueryLocationResponseType> createQueryLocationResponseQueryLocationReturn(QueryLocationResponseType value) {
        return new JAXBElement<QueryLocationResponseType>(_QueryLocationResponseQueryLocationReturn_QNAME, QueryLocationResponseType.class, QueryLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "modifySingleViewAddressAssociationReturn", scope = ModifySingleViewAddressAssociationResponse.class)
    public JAXBElement<ResponseStatusType> createModifySingleViewAddressAssociationResponseModifySingleViewAddressAssociationReturn(ResponseStatusType value) {
        return new JAXBElement<ResponseStatusType>(_ModifySingleViewAddressAssociationResponseModifySingleViewAddressAssociationReturn_QNAME, ResponseStatusType.class, ModifySingleViewAddressAssociationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "rateCenterName", scope = GeocodingResultsType.class)
    public JAXBElement<String> createGeocodingResultsTypeRateCenterName(String value) {
        return new JAXBElement<String>(_TelephonyTypeRateCenterName_QNAME, String.class, GeocodingResultsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "latitude", scope = GeocodingResultsType.class)
    public JAXBElement<BigDecimal> createGeocodingResultsTypeLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GeocodingResultsTypeLatitude_QNAME, BigDecimal.class, GeocodingResultsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodingPrecisionType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "geocodingPrecision", scope = GeocodingResultsType.class)
    public JAXBElement<GeocodingPrecisionType> createGeocodingResultsTypeGeocodingPrecision(GeocodingPrecisionType value) {
        return new JAXBElement<GeocodingPrecisionType>(_GeocodingResultsTypeGeocodingPrecision_QNAME, GeocodingPrecisionType.class, GeocodingResultsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "censusBlock", scope = GeocodingResultsType.class)
    public JAXBElement<String> createGeocodingResultsTypeCensusBlock(String value) {
        return new JAXBElement<String>(_GeocodingResultsTypeCensusBlock_QNAME, String.class, GeocodingResultsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "urbanization", scope = GeocodingResultsType.class)
    public JAXBElement<String> createGeocodingResultsTypeUrbanization(String value) {
        return new JAXBElement<String>(_GeocodingResultsTypeUrbanization_QNAME, String.class, GeocodingResultsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "longitude", scope = GeocodingResultsType.class)
    public JAXBElement<BigDecimal> createGeocodingResultsTypeLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GeocodingResultsTypeLongitude_QNAME, BigDecimal.class, GeocodingResultsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddE911AddressResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "addE911AddressReturn", scope = AddE911AddressResponse.class)
    public JAXBElement<AddE911AddressResponseType> createAddE911AddressResponseAddE911AddressReturn(AddE911AddressResponseType value) {
        return new JAXBElement<AddE911AddressResponseType>(_AddE911AddressResponseAddE911AddressReturn_QNAME, AddE911AddressResponseType.class, AddE911AddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddE911AddressRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "AddE911Address", scope = AddE911Address.class)
    public JAXBElement<AddE911AddressRequestType> createAddE911AddressAddE911Address(AddE911AddressRequestType value) {
        return new JAXBElement<AddE911AddressRequestType>(_AddE911AddressAddE911Address_QNAME, AddE911AddressRequestType.class, AddE911Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodedAddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "StandardizeAddress", scope = BusinessServiceabilityResponseItemType.class)
    public JAXBElement<GeocodedAddressType> createBusinessServiceabilityResponseItemTypeStandardizeAddress(GeocodedAddressType value) {
        return new JAXBElement<GeocodedAddressType>(_BusinessServiceabilityResponseItemTypeStandardizeAddress_QNAME, GeocodedAddressType.class, BusinessServiceabilityResponseItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unitTypes", scope = PostalAddressUpdateType.class)
    public JAXBElement<ArrayOfUnitTypesType> createPostalAddressUpdateTypeUnitTypes(ArrayOfUnitTypesType value) {
        return new JAXBElement<ArrayOfUnitTypesType>(_LocationQueueAddressTypeUnitTypes_QNAME, ArrayOfUnitTypesType.class, PostalAddressUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "city", scope = PostalAddressUpdateType.class)
    public JAXBElement<String> createPostalAddressUpdateTypeCity(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeCity_QNAME, String.class, PostalAddressUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "country", scope = PostalAddressUpdateType.class)
    public JAXBElement<CountryCodeType> createPostalAddressUpdateTypeCountry(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_LocationQueueAddressTypeCountry_QNAME, CountryCodeType.class, PostalAddressUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetPreDirection", scope = PostalAddressUpdateType.class)
    public JAXBElement<String> createPostalAddressUpdateTypeStreetPreDirection(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetPreDirection_QNAME, String.class, PostalAddressUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetName", scope = PostalAddressUpdateType.class)
    public JAXBElement<String> createPostalAddressUpdateTypeStreetName(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeStreetName_QNAME, String.class, PostalAddressUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumberSuffix", scope = PostalAddressUpdateType.class)
    public JAXBElement<String> createPostalAddressUpdateTypeHouseNumberSuffix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumberSuffix_QNAME, String.class, PostalAddressUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumber", scope = PostalAddressUpdateType.class)
    public JAXBElement<String> createPostalAddressUpdateTypeHouseNumber(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumber_QNAME, String.class, PostalAddressUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetPostDirection", scope = PostalAddressUpdateType.class)
    public JAXBElement<String> createPostalAddressUpdateTypeStreetPostDirection(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetPostDirection_QNAME, String.class, PostalAddressUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetSuffix", scope = PostalAddressUpdateType.class)
    public JAXBElement<String> createPostalAddressUpdateTypeStreetSuffix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetSuffix_QNAME, String.class, PostalAddressUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumberPrefix", scope = PostalAddressUpdateType.class)
    public JAXBElement<String> createPostalAddressUpdateTypeHouseNumberPrefix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumberPrefix_QNAME, String.class, PostalAddressUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "state", scope = PostalAddressUpdateType.class)
    public JAXBElement<String> createPostalAddressUpdateTypeState(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeState_QNAME, String.class, PostalAddressUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CSGLegacyMarketType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "CSGMarketID", scope = LegacyMarketIDType.class)
    public JAXBElement<CSGLegacyMarketType> createLegacyMarketIDTypeCSGMarketID(CSGLegacyMarketType value) {
        return new JAXBElement<CSGLegacyMarketType>(_LegacyMarketIDTypeCSGMarketID_QNAME, CSGLegacyMarketType.class, LegacyMarketIDType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSTLegacyMarketType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "DSTMarketID", scope = LegacyMarketIDType.class)
    public JAXBElement<DSTLegacyMarketType> createLegacyMarketIDTypeDSTMarketID(DSTLegacyMarketType value) {
        return new JAXBElement<DSTLegacyMarketType>(_LegacyMarketIDTypeDSTMarketID_QNAME, DSTLegacyMarketType.class, LegacyMarketIDType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "elocNodeID", scope = NodeType.class)
    public JAXBElement<Long> createNodeTypeElocNodeID(Long value) {
        return new JAXBElement<Long>(_NodeTypeElocNodeID_QNAME, Long.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilitiesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "nodeCapabilities", scope = NodeType.class)
    public JAXBElement<CapabilitiesType> createNodeTypeNodeCapabilities(CapabilitiesType value) {
        return new JAXBElement<CapabilitiesType>(_NodeTypeNodeCapabilities_QNAME, CapabilitiesType.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlternateNodeName }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "alternateNodeNames", scope = NodeType.class)
    public JAXBElement<ArrayOfAlternateNodeName> createNodeTypeAlternateNodeNames(ArrayOfAlternateNodeName value) {
        return new JAXBElement<ArrayOfAlternateNodeName>(_NodeTypeAlternateNodeNames_QNAME, ArrayOfAlternateNodeName.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "nodeHubLocation", scope = NodeType.class)
    public JAXBElement<String> createNodeTypeNodeHubLocation(String value) {
        return new JAXBElement<String>(_NodeTypeNodeHubLocation_QNAME, String.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "nodeBoundary", scope = NodeType.class)
    public JAXBElement<String> createNodeTypeNodeBoundary(String value) {
        return new JAXBElement<String>(_NodeTypeNodeBoundary_QNAME, String.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeBoundaryTypeSimpleType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "nodeBoundaryType", scope = NodeType.class)
    public JAXBElement<NodeBoundaryTypeSimpleType> createNodeTypeNodeBoundaryType(NodeBoundaryTypeSimpleType value) {
        return new JAXBElement<NodeBoundaryTypeSimpleType>(_NodeTypeNodeBoundaryType_QNAME, NodeBoundaryTypeSimpleType.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "nodeName", scope = NodeType.class)
    public JAXBElement<String> createNodeTypeNodeName(String value) {
        return new JAXBElement<String>(_NodeTypeNodeName_QNAME, String.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "hubID", scope = NodeType.class)
    public JAXBElement<String> createNodeTypeHubID(String value) {
        return new JAXBElement<String>(_NodeTypeHubID_QNAME, String.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "elocMarketID", scope = NodeType.class)
    public JAXBElement<Long> createNodeTypeElocMarketID(Long value) {
        return new JAXBElement<Long>(_NodeTypeElocMarketID_QNAME, Long.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeStatusSimpleType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "nodeStatus", scope = NodeType.class)
    public JAXBElement<NodeStatusSimpleType> createNodeTypeNodeStatus(NodeStatusSimpleType value) {
        return new JAXBElement<NodeStatusSimpleType>(_NodeTypeNodeStatus_QNAME, NodeStatusSimpleType.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "nodeDescription", scope = NodeType.class)
    public JAXBElement<String> createNodeTypeNodeDescription(String value) {
        return new JAXBElement<String>(_NodeTypeNodeDescription_QNAME, String.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "plannedAvailabilityDate", scope = NodeType.class)
    public JAXBElement<XMLGregorianCalendar> createNodeTypePlannedAvailabilityDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NodeTypePlannedAvailabilityDate_QNAME, XMLGregorianCalendar.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "nodePaths", scope = NodeType.class)
    public JAXBElement<String> createNodeTypeNodePaths(String value) {
        return new JAXBElement<String>(_NodeTypeNodePaths_QNAME, String.class, NodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "state", scope = LocationReferenceType.class)
    public JAXBElement<String> createLocationReferenceTypeState(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeState_QNAME, String.class, LocationReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBillingSystemFormattedAddressResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "getBillingSystemFormattedAddressReturn", scope = GetBillingSystemFormattedAddressResponse.class)
    public JAXBElement<GetBillingSystemFormattedAddressResponseType> createGetBillingSystemFormattedAddressResponseGetBillingSystemFormattedAddressReturn(GetBillingSystemFormattedAddressResponseType value) {
        return new JAXBElement<GetBillingSystemFormattedAddressResponseType>(_GetBillingSystemFormattedAddressResponseGetBillingSystemFormattedAddressReturn_QNAME, GetBillingSystemFormattedAddressResponseType.class, GetBillingSystemFormattedAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessServiceabilityRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "GetBusinessServiceabilityRequest", scope = GetBusinessServiceability.class)
    public JAXBElement<GetBusinessServiceabilityRequestType> createGetBusinessServiceabilityGetBusinessServiceabilityRequest(GetBusinessServiceabilityRequestType value) {
        return new JAXBElement<GetBusinessServiceabilityRequestType>(_GetBusinessServiceabilityGetBusinessServiceabilityRequest_QNAME, GetBusinessServiceabilityRequestType.class, GetBusinessServiceability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLocationFromBillingResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "deleteLocationFromBillingReturn", scope = DeleteLocationFromBillingResponse.class)
    public JAXBElement<DeleteLocationFromBillingResponseType> createDeleteLocationFromBillingResponseDeleteLocationFromBillingReturn(DeleteLocationFromBillingResponseType value) {
        return new JAXBElement<DeleteLocationFromBillingResponseType>(_DeleteLocationFromBillingResponseDeleteLocationFromBillingReturn_QNAME, DeleteLocationFromBillingResponseType.class, DeleteLocationFromBillingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "hierarchyID", scope = MarketHierarchyResponseType.class)
    public JAXBElement<Integer> createMarketHierarchyResponseTypeHierarchyID(Integer value) {
        return new JAXBElement<Integer>(_MarketHierarchyResponseTypeHierarchyID_QNAME, Integer.class, MarketHierarchyResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetAddress", scope = ModifyLocationQueueAddressType.class)
    public JAXBElement<String> createModifyLocationQueueAddressTypeStreetAddress(String value) {
        return new JAXBElement<String>(_ModifyLocationQueueAddressTypeStreetAddress_QNAME, String.class, ModifyLocationQueueAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unitTypes", scope = ModifyLocationQueueAddressType.class)
    public JAXBElement<ArrayOfUnitTypesType> createModifyLocationQueueAddressTypeUnitTypes(ArrayOfUnitTypesType value) {
        return new JAXBElement<ArrayOfUnitTypesType>(_LocationQueueAddressTypeUnitTypes_QNAME, ArrayOfUnitTypesType.class, ModifyLocationQueueAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegacyMarketIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "legacyMarketID", scope = MarketReferenceType.class)
    public JAXBElement<LegacyMarketIDType> createMarketReferenceTypeLegacyMarketID(LegacyMarketIDType value) {
        return new JAXBElement<LegacyMarketIDType>(_MarketReferenceTypeLegacyMarketID_QNAME, LegacyMarketIDType.class, MarketReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryLocationByRuleReturn", scope = QueryLocationByRuleResponse.class)
    public JAXBElement<QueryLocationResponseType> createQueryLocationByRuleResponseQueryLocationByRuleReturn(QueryLocationResponseType value) {
        return new JAXBElement<QueryLocationResponseType>(_QueryLocationByRuleResponseQueryLocationByRuleReturn_QNAME, QueryLocationResponseType.class, QueryLocationByRuleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNodeResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "deleteNodeReturn", scope = DeleteNodeResponse.class)
    public JAXBElement<DeleteNodeResponseType> createDeleteNodeResponseDeleteNodeReturn(DeleteNodeResponseType value) {
        return new JAXBElement<DeleteNodeResponseType>(_DeleteNodeResponseDeleteNodeReturn_QNAME, DeleteNodeResponseType.class, DeleteNodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NearestNeighborCriteriaType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "NearestNeighborCriteria", scope = GeospatialSearchCriteriaType.class)
    public JAXBElement<NearestNeighborCriteriaType> createGeospatialSearchCriteriaTypeNearestNeighborCriteria(NearestNeighborCriteriaType value) {
        return new JAXBElement<NearestNeighborCriteriaType>(_GeospatialSearchCriteriaTypeNearestNeighborCriteria_QNAME, NearestNeighborCriteriaType.class, GeospatialSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoundaryCriteriaType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "BoundaryCriteria", scope = GeospatialSearchCriteriaType.class)
    public JAXBElement<BoundaryCriteriaType> createGeospatialSearchCriteriaTypeBoundaryCriteria(BoundaryCriteriaType value) {
        return new JAXBElement<BoundaryCriteriaType>(_GeospatialSearchCriteriaTypeBoundaryCriteria_QNAME, BoundaryCriteriaType.class, GeospatialSearchCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "getLocationReturn", scope = GetLocationResponse.class)
    public JAXBElement<GetLocationResponseType> createGetLocationResponseGetLocationReturn(GetLocationResponseType value) {
        return new JAXBElement<GetLocationResponseType>(_GetLocationResponseGetLocationReturn_QNAME, GetLocationResponseType.class, GetLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "stateCode", scope = QueryMarketByBoundaryRequestType.class)
    public JAXBElement<String> createQueryMarketByBoundaryRequestTypeStateCode(String value) {
        return new JAXBElement<String>(_QueryMarketByBoundaryRequestTypeStateCode_QNAME, String.class, QueryMarketByBoundaryRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLocationResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "addLocationReturn", scope = AddLocationResponse.class)
    public JAXBElement<AddLocationResponseType> createAddLocationResponseAddLocationReturn(AddLocationResponseType value) {
        return new JAXBElement<AddLocationResponseType>(_AddLocationResponseAddLocationReturn_QNAME, AddLocationResponseType.class, AddLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetName", scope = AddressCriteriaType.class)
    public JAXBElement<String> createAddressCriteriaTypeStreetName(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeStreetName_QNAME, String.class, AddressCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMarketByBoundaryResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryMarketByBoundaryReturn", scope = QueryMarketByBoundaryResponse.class)
    public JAXBElement<QueryMarketByBoundaryResponseType> createQueryMarketByBoundaryResponseQueryMarketByBoundaryReturn(QueryMarketByBoundaryResponseType value) {
        return new JAXBElement<QueryMarketByBoundaryResponseType>(_QueryMarketByBoundaryResponseQueryMarketByBoundaryReturn_QNAME, QueryMarketByBoundaryResponseType.class, QueryMarketByBoundaryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefreshCacheRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "RefreshCache", scope = RefreshCache.class)
    public JAXBElement<RefreshCacheRequestType> createRefreshCacheRefreshCache(RefreshCacheRequestType value) {
        return new JAXBElement<RefreshCacheRequestType>(_RefreshCacheRefreshCache_QNAME, RefreshCacheRequestType.class, RefreshCache.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationDetailsResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryLocationDetailsReturn", scope = QueryLocationDetailsResponse.class)
    public JAXBElement<QueryLocationDetailsResponseType> createQueryLocationDetailsResponseQueryLocationDetailsReturn(QueryLocationDetailsResponseType value) {
        return new JAXBElement<QueryLocationDetailsResponseType>(_QueryLocationDetailsResponseQueryLocationDetailsReturn_QNAME, QueryLocationDetailsResponseType.class, QueryLocationDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeoTagResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "getGeoTagReturn", scope = GetGeoTagResponse.class)
    public JAXBElement<GetGeoTagResponseType> createGetGeoTagResponseGetGeoTagReturn(GetGeoTagResponseType value) {
        return new JAXBElement<GetGeoTagResponseType>(_GetGeoTagResponseGetGeoTagReturn_QNAME, GetGeoTagResponseType.class, GetGeoTagResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationCommentsType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "LocationComments", scope = LocationDetailsUpdateType.class)
    public JAXBElement<ArrayOfLocationCommentsType> createLocationDetailsUpdateTypeLocationComments(ArrayOfLocationCommentsType value) {
        return new JAXBElement<ArrayOfLocationCommentsType>(_LocationDetailsUpdateTypeLocationComments_QNAME, ArrayOfLocationCommentsType.class, LocationDetailsUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "AddressGroupID", scope = LocationDetailsUpdateType.class)
    public JAXBElement<String> createLocationDetailsUpdateTypeAddressGroupID(String value) {
        return new JAXBElement<String>(_LocationDetailsUpdateTypeAddressGroupID_QNAME, String.class, LocationDetailsUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetName", scope = AddressSummaryCriteria.class)
    public JAXBElement<String> createAddressSummaryCriteriaStreetName(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeStreetName_QNAME, String.class, AddressSummaryCriteria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMarketReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "marketReference", scope = QueryLocationResponseType.class)
    public JAXBElement<ArrayOfMarketReferenceType> createQueryLocationResponseTypeMarketReference(ArrayOfMarketReferenceType value) {
        return new JAXBElement<ArrayOfMarketReferenceType>(_QueryLocationResponseTypeMarketReference_QNAME, ArrayOfMarketReferenceType.class, QueryLocationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "location", scope = QueryLocationResponseType.class)
    public JAXBElement<LocationType> createQueryLocationResponseTypeLocation(LocationType value) {
        return new JAXBElement<LocationType>(_QueryLocationResponseTypeLocation_QNAME, LocationType.class, QueryLocationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "locationReference", scope = QueryLocationResponseType.class)
    public JAXBElement<ArrayOfLocationReferenceType> createQueryLocationResponseTypeLocationReference(ArrayOfLocationReferenceType value) {
        return new JAXBElement<ArrayOfLocationReferenceType>(_QueryLocationResponseTypeLocationReference_QNAME, ArrayOfLocationReferenceType.class, QueryLocationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNodeRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "AddNode", scope = AddNode.class)
    public JAXBElement<AddNodeRequestType> createAddNodeAddNode(AddNodeRequestType value) {
        return new JAXBElement<AddNodeRequestType>(_AddNodeAddNode_QNAME, AddNodeRequestType.class, AddNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "singleViewID", scope = AssociateSingleViewAddressType.class)
    public JAXBElement<String> createAssociateSingleViewAddressTypeSingleViewID(String value) {
        return new JAXBElement<String>(_DeleteSingleViewAddressAssociationTypeSingleViewID_QNAME, String.class, AssociateSingleViewAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "addressID", scope = AssociateSingleViewAddressType.class)
    public JAXBElement<String> createAssociateSingleViewAddressTypeAddressID(String value) {
        return new JAXBElement<String>(_DeleteSingleViewAddressAssociationTypeAddressID_QNAME, String.class, AssociateSingleViewAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodeResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "getNodeReturn", scope = GetNodeResponse.class)
    public JAXBElement<GetNodeResponseType> createGetNodeResponseGetNodeReturn(GetNodeResponseType value) {
        return new JAXBElement<GetNodeResponseType>(_GetNodeResponseGetNodeReturn_QNAME, GetNodeResponseType.class, GetNodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddModifyMarketResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "modifyMarketReturn", scope = ModifyMarketResponse.class)
    public JAXBElement<AddModifyMarketResponseType> createModifyMarketResponseModifyMarketReturn(AddModifyMarketResponseType value) {
        return new JAXBElement<AddModifyMarketResponseType>(_ModifyMarketResponseModifyMarketReturn_QNAME, AddModifyMarketResponseType.class, ModifyMarketResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "closeMatch", scope = GeocodedAddressType.class)
    public JAXBElement<Boolean> createGeocodedAddressTypeCloseMatch(Boolean value) {
        return new JAXBElement<Boolean>(_GeocodedAddressTypeCloseMatch_QNAME, Boolean.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unitTypes", scope = GeocodedAddressType.class)
    public JAXBElement<ArrayOfUnitTypesType> createGeocodedAddressTypeUnitTypes(ArrayOfUnitTypesType value) {
        return new JAXBElement<ArrayOfUnitTypesType>(_LocationQueueAddressTypeUnitTypes_QNAME, ArrayOfUnitTypesType.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetPreDirection", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeStreetPreDirection(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetPreDirection_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetName", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeStreetName(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeStreetName_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "longitude", scope = GeocodedAddressType.class)
    public JAXBElement<BigDecimal> createGeocodedAddressTypeLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GeocodingResultsTypeLongitude_QNAME, BigDecimal.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetSuffix", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeStreetSuffix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetSuffix_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "state", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeState(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeState_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetSide", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeStreetSide(String value) {
        return new JAXBElement<String>(_GeocodedAddressTypeStreetSide_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "city", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeCity(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeCity_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "CensusBlock", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeCensusBlock(String value) {
        return new JAXBElement<String>(_GeocodedAddressTypeCensusBlock_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dwellingCode", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeDwellingCode(String value) {
        return new JAXBElement<String>(_PostalAddressTypeDwellingCode_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "latitude", scope = GeocodedAddressType.class)
    public JAXBElement<BigDecimal> createGeocodedAddressTypeLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GeocodingResultsTypeLatitude_QNAME, BigDecimal.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZipCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "zipCode", scope = GeocodedAddressType.class)
    public JAXBElement<ZipCodeType> createGeocodedAddressTypeZipCode(ZipCodeType value) {
        return new JAXBElement<ZipCodeType>(_GeocodedAddressTypeZipCode_QNAME, ZipCodeType.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodingPrecisionType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "geocodingPrecision", scope = GeocodedAddressType.class)
    public JAXBElement<GeocodingPrecisionType> createGeocodedAddressTypeGeocodingPrecision(GeocodingPrecisionType value) {
        return new JAXBElement<GeocodingPrecisionType>(_GeocodingResultsTypeGeocodingPrecision_QNAME, GeocodingPrecisionType.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "CensusTract", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeCensusTract(String value) {
        return new JAXBElement<String>(_GeocodedAddressTypeCensusTract_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumberSuffix", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeHouseNumberSuffix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumberSuffix_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "urbanization", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeUrbanization(String value) {
        return new JAXBElement<String>(_GeocodingResultsTypeUrbanization_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumber", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeHouseNumber(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumber_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetPostDirection", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeStreetPostDirection(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetPostDirection_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumberPrefix", scope = GeocodedAddressType.class)
    public JAXBElement<String> createGeocodedAddressTypeHouseNumberPrefix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumberPrefix_QNAME, String.class, GeocodedAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateSingleViewAddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "AssociateSingleViewAddress", scope = AssociateSingleViewAddress.class)
    public JAXBElement<AssociateSingleViewAddressType> createAssociateSingleViewAddressAssociateSingleViewAddress(AssociateSingleViewAddressType value) {
        return new JAXBElement<AssociateSingleViewAddressType>(_AssociateSingleViewAddressAssociateSingleViewAddress_QNAME, AssociateSingleViewAddressType.class, AssociateSingleViewAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyDuplicateHouseToBillingRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "CopyDuplicateHouseToBilling", scope = CopyDuplicateHouseToBilling.class)
    public JAXBElement<CopyDuplicateHouseToBillingRequestType> createCopyDuplicateHouseToBillingCopyDuplicateHouseToBilling(CopyDuplicateHouseToBillingRequestType value) {
        return new JAXBElement<CopyDuplicateHouseToBillingRequestType>(_CopyDuplicateHouseToBillingCopyDuplicateHouseToBilling_QNAME, CopyDuplicateHouseToBillingRequestType.class, CopyDuplicateHouseToBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMsagDataResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryMsagDataReturn", scope = QueryMsagDataResponse.class)
    public JAXBElement<QueryMsagDataResponseType> createQueryMsagDataResponseQueryMsagDataReturn(QueryMsagDataResponseType value) {
        return new JAXBElement<QueryMsagDataResponseType>(_QueryMsagDataResponseQueryMsagDataReturn_QNAME, QueryMsagDataResponseType.class, QueryMsagDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodeRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "GetNode", scope = GetNode.class)
    public JAXBElement<GetNodeRequestType> createGetNodeGetNode(GetNodeRequestType value) {
        return new JAXBElement<GetNodeRequestType>(_GetNodeGetNode_QNAME, GetNodeRequestType.class, GetNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "elocNodeID", scope = NodeReferenceType.class)
    public JAXBElement<Long> createNodeReferenceTypeElocNodeID(Long value) {
        return new JAXBElement<Long>(_NodeTypeElocNodeID_QNAME, Long.class, NodeReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "nodeName", scope = NodeReferenceType.class)
    public JAXBElement<String> createNodeReferenceTypeNodeName(String value) {
        return new JAXBElement<String>(_NodeTypeNodeName_QNAME, String.class, NodeReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeStatusSimpleType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "nodeStatus", scope = NodeReferenceType.class)
    public JAXBElement<NodeStatusSimpleType> createNodeReferenceTypeNodeStatus(NodeStatusSimpleType value) {
        return new JAXBElement<NodeStatusSimpleType>(_NodeTypeNodeStatus_QNAME, NodeStatusSimpleType.class, NodeReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "nodeDescription", scope = NodeReferenceType.class)
    public JAXBElement<String> createNodeReferenceTypeNodeDescription(String value) {
        return new JAXBElement<String>(_NodeTypeNodeDescription_QNAME, String.class, NodeReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "plannedAvailabilityDate", scope = NodeReferenceType.class)
    public JAXBElement<XMLGregorianCalendar> createNodeReferenceTypePlannedAvailabilityDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NodeTypePlannedAvailabilityDate_QNAME, XMLGregorianCalendar.class, NodeReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "marketID", scope = NodeReferenceType.class)
    public JAXBElement<Long> createNodeReferenceTypeMarketID(Long value) {
        return new JAXBElement<Long>(_NodeReferenceTypeMarketID_QNAME, Long.class, NodeReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationGeospatialRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryLocationGeospatial", scope = QueryLocationGeospatial.class)
    public JAXBElement<QueryLocationGeospatialRequestType> createQueryLocationGeospatialQueryLocationGeospatial(QueryLocationGeospatialRequestType value) {
        return new JAXBElement<QueryLocationGeospatialRequestType>(_QueryLocationGeospatialQueryLocationGeospatial_QNAME, QueryLocationGeospatialRequestType.class, QueryLocationGeospatial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "fiberNodeName", scope = GetLocationInformationResponseType.class)
    public JAXBElement<String> createGetLocationInformationResponseTypeFiberNodeName(String value) {
        return new JAXBElement<String>(_GetLocationInformationResponseTypeFiberNodeName_QNAME, String.class, GetLocationInformationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "locationReference", scope = GetLocationInformationResponseType.class)
    public JAXBElement<ArrayOfLocationReferenceType> createGetLocationInformationResponseTypeLocationReference(ArrayOfLocationReferenceType value) {
        return new JAXBElement<ArrayOfLocationReferenceType>(_QueryLocationResponseTypeLocationReference_QNAME, ArrayOfLocationReferenceType.class, GetLocationInformationResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unitTypes", scope = E911AddressType.class)
    public JAXBElement<ArrayOfUnitTypesType> createE911AddressTypeUnitTypes(ArrayOfUnitTypesType value) {
        return new JAXBElement<ArrayOfUnitTypesType>(_LocationQueueAddressTypeUnitTypes_QNAME, ArrayOfUnitTypesType.class, E911AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetPreDirection", scope = E911AddressType.class)
    public JAXBElement<String> createE911AddressTypeStreetPreDirection(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetPreDirection_QNAME, String.class, E911AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumberSuffix", scope = E911AddressType.class)
    public JAXBElement<String> createE911AddressTypeHouseNumberSuffix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumberSuffix_QNAME, String.class, E911AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumber", scope = E911AddressType.class)
    public JAXBElement<String> createE911AddressTypeHouseNumber(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumber_QNAME, String.class, E911AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetPostDirection", scope = E911AddressType.class)
    public JAXBElement<String> createE911AddressTypeStreetPostDirection(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetPostDirection_QNAME, String.class, E911AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetSuffix", scope = E911AddressType.class)
    public JAXBElement<String> createE911AddressTypeStreetSuffix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetSuffix_QNAME, String.class, E911AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumberPrefix", scope = E911AddressType.class)
    public JAXBElement<String> createE911AddressTypeHouseNumberPrefix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumberPrefix_QNAME, String.class, E911AddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLocationQueueRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "AddLocationQueue", scope = AddLocationQueue.class)
    public JAXBElement<AddLocationQueueRequestType> createAddLocationQueueAddLocationQueue(AddLocationQueueRequestType value) {
        return new JAXBElement<AddLocationQueueRequestType>(_AddLocationQueueAddLocationQueue_QNAME, AddLocationQueueRequestType.class, AddLocationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyHomeSecurityResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "modifyHomeSecurityReturn", scope = ModifyHomeSecurityResponse.class)
    public JAXBElement<ModifyHomeSecurityResponseType> createModifyHomeSecurityResponseModifyHomeSecurityReturn(ModifyHomeSecurityResponseType value) {
        return new JAXBElement<ModifyHomeSecurityResponseType>(_ModifyHomeSecurityResponseModifyHomeSecurityReturn_QNAME, ModifyHomeSecurityResponseType.class, ModifyHomeSecurityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryLocation", scope = QueryLocation.class)
    public JAXBElement<QueryLocationRequestType> createQueryLocationQueryLocation(QueryLocationRequestType value) {
        return new JAXBElement<QueryLocationRequestType>(_QueryLocationQueryLocation_QNAME, QueryLocationRequestType.class, QueryLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationLegacyDetailsDSTType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "DSTLegacyDetails", scope = LocationLegacyDetailsType.class)
    public JAXBElement<ArrayOfLocationLegacyDetailsDSTType> createLocationLegacyDetailsTypeDSTLegacyDetails(ArrayOfLocationLegacyDetailsDSTType value) {
        return new JAXBElement<ArrayOfLocationLegacyDetailsDSTType>(_LocationLegacyDetailsTypeDSTLegacyDetails_QNAME, ArrayOfLocationLegacyDetailsDSTType.class, LocationLegacyDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLocationLegacyDetailsCSGType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "CSGLegacyDetails", scope = LocationLegacyDetailsType.class)
    public JAXBElement<ArrayOfLocationLegacyDetailsCSGType> createLocationLegacyDetailsTypeCSGLegacyDetails(ArrayOfLocationLegacyDetailsCSGType value) {
        return new JAXBElement<ArrayOfLocationLegacyDetailsCSGType>(_LocationLegacyDetailsTypeCSGLegacyDetails_QNAME, ArrayOfLocationLegacyDetailsCSGType.class, LocationLegacyDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardizeAddressByRuleRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "StandardizeAddressByRule", scope = StandardizeAddressByRule.class)
    public JAXBElement<StandardizeAddressByRuleRequestType> createStandardizeAddressByRuleStandardizeAddressByRule(StandardizeAddressByRuleRequestType value) {
        return new JAXBElement<StandardizeAddressByRuleRequestType>(_StandardizeAddressByRuleStandardizeAddressByRule_QNAME, StandardizeAddressByRuleRequestType.class, StandardizeAddressByRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMarketRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryMarket", scope = QueryMarket.class)
    public JAXBElement<QueryMarketRequestType> createQueryMarketQueryMarket(QueryMarketRequestType value) {
        return new JAXBElement<QueryMarketRequestType>(_QueryMarketQueryMarket_QNAME, QueryMarketRequestType.class, QueryMarket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "marketHierarchyInfo", scope = GetLocationXfinityRequestedResultsType.class)
    public JAXBElement<Boolean> createGetLocationXfinityRequestedResultsTypeMarketHierarchyInfo(Boolean value) {
        return new JAXBElement<Boolean>(_GetLocationXfinityRequestedResultsTypeMarketHierarchyInfo_QNAME, Boolean.class, GetLocationXfinityRequestedResultsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressCriteriaByRulesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "addressSearch", scope = QueryLocationByRuleRequestType.class)
    public JAXBElement<AddressCriteriaByRulesType> createQueryLocationByRuleRequestTypeAddressSearch(AddressCriteriaByRulesType value) {
        return new JAXBElement<AddressCriteriaByRulesType>(_QueryLocationByRuleRequestTypeAddressSearch_QNAME, AddressCriteriaByRulesType.class, QueryLocationByRuleRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMarketResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "getMarketReturn", scope = GetMarketResponse.class)
    public JAXBElement<GetMarketResponseType> createGetMarketResponseGetMarketReturn(GetMarketResponseType value) {
        return new JAXBElement<GetMarketResponseType>(_GetMarketResponseGetMarketReturn_QNAME, GetMarketResponseType.class, GetMarketResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyMarketRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "ModifyMarket", scope = ModifyMarket.class)
    public JAXBElement<ModifyMarketRequestType> createModifyMarketModifyMarket(ModifyMarketRequestType value) {
        return new JAXBElement<ModifyMarketRequestType>(_ModifyMarketModifyMarket_QNAME, ModifyMarketRequestType.class, ModifyMarket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "applyConsumerRule", scope = StandardizeAddressByRuleRequestType.class)
    public JAXBElement<String> createStandardizeAddressByRuleRequestTypeApplyConsumerRule(String value) {
        return new JAXBElement<String>(_StandardizeAddressByRuleRequestTypeApplyConsumerRule_QNAME, String.class, StandardizeAddressByRuleRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyHomeSecurityRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "ModifyHomeSecurity", scope = ModifyHomeSecurity.class)
    public JAXBElement<ModifyHomeSecurityRequestType> createModifyHomeSecurityModifyHomeSecurity(ModifyHomeSecurityRequestType value) {
        return new JAXBElement<ModifyHomeSecurityRequestType>(_ModifyHomeSecurityModifyHomeSecurity_QNAME, ModifyHomeSecurityRequestType.class, ModifyHomeSecurity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "BuildingCategory", scope = BuildingAttributesType.class)
    public JAXBElement<String> createBuildingAttributesTypeBuildingCategory(String value) {
        return new JAXBElement<String>(_BuildingAttributesTypeBuildingCategory_QNAME, String.class, BuildingAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationXfinityResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "getLocationXfinityReturn", scope = GetLocationXfinityResponse.class)
    public JAXBElement<GetLocationXfinityResponseType> createGetLocationXfinityResponseGetLocationXfinityReturn(GetLocationXfinityResponseType value) {
        return new JAXBElement<GetLocationXfinityResponseType>(_GetLocationXfinityResponseGetLocationXfinityReturn_QNAME, GetLocationXfinityResponseType.class, GetLocationXfinityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMarketRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "GetMarket", scope = GetMarket.class)
    public JAXBElement<GetMarketRequestType> createGetMarketGetMarket(GetMarketRequestType value) {
        return new JAXBElement<GetMarketRequestType>(_GetMarketGetMarket_QNAME, GetMarketRequestType.class, GetMarket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryNodeResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryNodeReturn", scope = QueryNodeResponse.class)
    public JAXBElement<QueryNodeResponseType> createQueryNodeResponseQueryNodeReturn(QueryNodeResponseType value) {
        return new JAXBElement<QueryNodeResponseType>(_QueryNodeResponseQueryNodeReturn_QNAME, QueryNodeResponseType.class, QueryNodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLocationRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "DeleteLocation", scope = DeleteLocation.class)
    public JAXBElement<DeleteLocationRequestType> createDeleteLocationDeleteLocation(DeleteLocationRequestType value) {
        return new JAXBElement<DeleteLocationRequestType>(_DeleteLocationDeleteLocation_QNAME, DeleteLocationRequestType.class, DeleteLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressXfinityCriteriaType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "addressSearch", scope = QueryLocationXfinityRequestType.class)
    public JAXBElement<AddressXfinityCriteriaType> createQueryLocationXfinityRequestTypeAddressSearch(AddressXfinityCriteriaType value) {
        return new JAXBElement<AddressXfinityCriteriaType>(_QueryLocationByRuleRequestTypeAddressSearch_QNAME, AddressXfinityCriteriaType.class, QueryLocationXfinityRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyLocationQueueResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "modifyLocationQueueReturn", scope = ModifyLocationQueueResponse.class)
    public JAXBElement<ModifyLocationQueueResponseType> createModifyLocationQueueResponseModifyLocationQueueReturn(ModifyLocationQueueResponseType value) {
        return new JAXBElement<ModifyLocationQueueResponseType>(_ModifyLocationQueueResponseModifyLocationQueueReturn_QNAME, ModifyLocationQueueResponseType.class, ModifyLocationQueueResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationReferenceDataResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryLocationReferenceDataReturn", scope = QueryLocationReferenceDataResponse.class)
    public JAXBElement<QueryLocationReferenceDataResponseType> createQueryLocationReferenceDataResponseQueryLocationReferenceDataReturn(QueryLocationReferenceDataResponseType value) {
        return new JAXBElement<QueryLocationReferenceDataResponseType>(_QueryLocationReferenceDataResponseQueryLocationReferenceDataReturn_QNAME, QueryLocationReferenceDataResponseType.class, QueryLocationReferenceDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardizeAddressRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "StandardizeAddress", scope = StandardizeAddress.class)
    public JAXBElement<StandardizeAddressRequestType> createStandardizeAddressStandardizeAddress(StandardizeAddressRequestType value) {
        return new JAXBElement<StandardizeAddressRequestType>(_StandardizeAddressStandardizeAddress_QNAME, StandardizeAddressRequestType.class, StandardizeAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unitTypes", scope = QueryPostalAddressType.class)
    public JAXBElement<ArrayOfUnitTypesType> createQueryPostalAddressTypeUnitTypes(ArrayOfUnitTypesType value) {
        return new JAXBElement<ArrayOfUnitTypesType>(_LocationQueueAddressTypeUnitTypes_QNAME, ArrayOfUnitTypesType.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetPreDirection", scope = QueryPostalAddressType.class)
    public JAXBElement<String> createQueryPostalAddressTypeStreetPreDirection(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetPreDirection_QNAME, String.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetName", scope = QueryPostalAddressType.class)
    public JAXBElement<String> createQueryPostalAddressTypeStreetName(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeStreetName_QNAME, String.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetSuffix", scope = QueryPostalAddressType.class)
    public JAXBElement<String> createQueryPostalAddressTypeStreetSuffix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetSuffix_QNAME, String.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "state", scope = QueryPostalAddressType.class)
    public JAXBElement<String> createQueryPostalAddressTypeState(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeState_QNAME, String.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "city", scope = QueryPostalAddressType.class)
    public JAXBElement<String> createQueryPostalAddressTypeCity(String value) {
        return new JAXBElement<String>(_PostalAddressUpdateTypeCity_QNAME, String.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dwellingCode", scope = QueryPostalAddressType.class)
    public JAXBElement<String> createQueryPostalAddressTypeDwellingCode(String value) {
        return new JAXBElement<String>(_PostalAddressTypeDwellingCode_QNAME, String.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZipCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "zipCode", scope = QueryPostalAddressType.class)
    public JAXBElement<ZipCodeType> createQueryPostalAddressTypeZipCode(ZipCodeType value) {
        return new JAXBElement<ZipCodeType>(_GeocodedAddressTypeZipCode_QNAME, ZipCodeType.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "country", scope = QueryPostalAddressType.class)
    public JAXBElement<CountryCodeType> createQueryPostalAddressTypeCountry(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_LocationQueueAddressTypeCountry_QNAME, CountryCodeType.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumberSuffix", scope = QueryPostalAddressType.class)
    public JAXBElement<String> createQueryPostalAddressTypeHouseNumberSuffix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumberSuffix_QNAME, String.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumber", scope = QueryPostalAddressType.class)
    public JAXBElement<String> createQueryPostalAddressTypeHouseNumber(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumber_QNAME, String.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "streetPostDirection", scope = QueryPostalAddressType.class)
    public JAXBElement<String> createQueryPostalAddressTypeStreetPostDirection(String value) {
        return new JAXBElement<String>(_PostalAddressTypeStreetPostDirection_QNAME, String.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumberPrefix", scope = QueryPostalAddressType.class)
    public JAXBElement<String> createQueryPostalAddressTypeHouseNumberPrefix(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumberPrefix_QNAME, String.class, QueryPostalAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "StructureType", scope = LocationDetailsType.class)
    public JAXBElement<String> createLocationDetailsTypeStructureType(String value) {
        return new JAXBElement<String>(_LocationDetailsTypeStructureType_QNAME, String.class, LocationDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "StructureUse", scope = LocationDetailsType.class)
    public JAXBElement<String> createLocationDetailsTypeStructureUse(String value) {
        return new JAXBElement<String>(_LocationDetailsTypeStructureUse_QNAME, String.class, LocationDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "AddressGroupID", scope = LocationDetailsType.class)
    public JAXBElement<String> createLocationDetailsTypeAddressGroupID(String value) {
        return new JAXBElement<String>(_LocationDetailsUpdateTypeAddressGroupID_QNAME, String.class, LocationDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLocationRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "AddLocation", scope = AddLocation.class)
    public JAXBElement<AddLocationRequestType> createAddLocationAddLocation(AddLocationRequestType value) {
        return new JAXBElement<AddLocationRequestType>(_AddLocationAddLocation_QNAME, AddLocationRequestType.class, AddLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationFromBillerResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "getLocationFromBillerReturn", scope = GetLocationFromBillerResponse.class)
    public JAXBElement<GetLocationFromBillerResponseType> createGetLocationFromBillerResponseGetLocationFromBillerReturn(GetLocationFromBillerResponseType value) {
        return new JAXBElement<GetLocationFromBillerResponseType>(_GetLocationFromBillerResponseGetLocationFromBillerReturn_QNAME, GetLocationFromBillerResponseType.class, GetLocationFromBillerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLocationInBillingResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "updateLocationInBillingReturn", scope = UpdateLocationInBillingResponse.class)
    public JAXBElement<UpdateLocationInBillingResponseType> createUpdateLocationInBillingResponseUpdateLocationInBillingReturn(UpdateLocationInBillingResponseType value) {
        return new JAXBElement<UpdateLocationInBillingResponseType>(_UpdateLocationInBillingResponseUpdateLocationInBillingReturn_QNAME, UpdateLocationInBillingResponseType.class, UpdateLocationInBillingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationFromBillerRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "GetLocationFromBiller", scope = GetLocationFromBiller.class)
    public JAXBElement<GetLocationFromBillerRequestType> createGetLocationFromBillerGetLocationFromBiller(GetLocationFromBillerRequestType value) {
        return new JAXBElement<GetLocationFromBillerRequestType>(_GetLocationFromBillerGetLocationFromBiller_QNAME, GetLocationFromBillerRequestType.class, GetLocationFromBiller.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationByRuleRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryLocationByRule", scope = QueryLocationByRule.class)
    public JAXBElement<QueryLocationByRuleRequestType> createQueryLocationByRuleQueryLocationByRule(QueryLocationByRuleRequestType value) {
        return new JAXBElement<QueryLocationByRuleRequestType>(_QueryLocationByRuleQueryLocationByRule_QNAME, QueryLocationByRuleRequestType.class, QueryLocationByRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceabilityUpdateType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "updateAction", scope = LocationServiceabilityUpdateType.class)
    public JAXBElement<ServiceabilityUpdateType> createLocationServiceabilityUpdateTypeUpdateAction(ServiceabilityUpdateType value) {
        return new JAXBElement<ServiceabilityUpdateType>(_LocationServiceabilityUpdateTypeUpdateAction_QNAME, ServiceabilityUpdateType.class, LocationServiceabilityUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "serviceableFlag", scope = LocationServiceabilityUpdateType.class)
    public JAXBElement<Boolean> createLocationServiceabilityUpdateTypeServiceableFlag(Boolean value) {
        return new JAXBElement<Boolean>(_LocationServiceabilityUpdateTypeServiceableFlag_QNAME, Boolean.class, LocationServiceabilityUpdateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyLocationResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "verifyLocationReturn", scope = VerifyLocationResponse.class)
    public JAXBElement<VerifyLocationResponseType> createVerifyLocationResponseVerifyLocationReturn(VerifyLocationResponseType value) {
        return new JAXBElement<VerifyLocationResponseType>(_VerifyLocationResponseVerifyLocationReturn_QNAME, VerifyLocationResponseType.class, VerifyLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationQueueResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "getLocationQueueReturn", scope = GetLocationQueueResponse.class)
    public JAXBElement<GetLocationQueueResponseType> createGetLocationQueueResponseGetLocationQueueReturn(GetLocationQueueResponseType value) {
        return new JAXBElement<GetLocationQueueResponseType>(_GetLocationQueueResponseGetLocationQueueReturn_QNAME, GetLocationQueueResponseType.class, GetLocationQueueResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMarketResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "deleteMarketReturn", scope = DeleteMarketResponse.class)
    public JAXBElement<DeleteMarketResponseType> createDeleteMarketResponseDeleteMarketReturn(DeleteMarketResponseType value) {
        return new JAXBElement<DeleteMarketResponseType>(_DeleteMarketResponseDeleteMarketReturn_QNAME, DeleteMarketResponseType.class, DeleteMarketResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "Elevation", scope = GeographicCoordinateMeasurementType.class)
    public JAXBElement<BigDecimal> createGeographicCoordinateMeasurementTypeElevation(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GeographicCoordinateMeasurementTypeElevation_QNAME, BigDecimal.class, GeographicCoordinateMeasurementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStandardizeAddressXfinityResponseItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "addresses", scope = StandardizeAddressXfinityResponseType.class)
    public JAXBElement<ArrayOfStandardizeAddressXfinityResponseItemType> createStandardizeAddressXfinityResponseTypeAddresses(ArrayOfStandardizeAddressXfinityResponseItemType value) {
        return new JAXBElement<ArrayOfStandardizeAddressXfinityResponseItemType>(_StandardizeAddressXfinityResponseTypeAddresses_QNAME, ArrayOfStandardizeAddressXfinityResponseItemType.class, StandardizeAddressXfinityResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "MarketID", scope = ModifyLocationRequestDetailsType.class)
    public JAXBElement<Long> createModifyLocationRequestDetailsTypeMarketID(Long value) {
        return new JAXBElement<Long>(_ModifyLocationRequestDetailsTypeMarketID_QNAME, Long.class, ModifyLocationRequestDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalAddressUpdateType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "LocationPostalAddress", scope = ModifyLocationRequestDetailsType.class)
    public JAXBElement<PostalAddressUpdateType> createModifyLocationRequestDetailsTypeLocationPostalAddress(PostalAddressUpdateType value) {
        return new JAXBElement<PostalAddressUpdateType>(_ModifyLocationRequestDetailsTypeLocationPostalAddress_QNAME, PostalAddressUpdateType.class, ModifyLocationRequestDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMsagDataRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryMsagData", scope = QueryMsagData.class)
    public JAXBElement<QueryMsagDataRequestType> createQueryMsagDataQueryMsagData(QueryMsagDataRequestType value) {
        return new JAXBElement<QueryMsagDataRequestType>(_QueryMsagDataQueryMsagData_QNAME, QueryMsagDataRequestType.class, QueryMsagData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyLocationRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "ModifyLocation", scope = ModifyLocation.class)
    public JAXBElement<ModifyLocationRequestType> createModifyLocationModifyLocation(ModifyLocationRequestType value) {
        return new JAXBElement<ModifyLocationRequestType>(_ModifyLocationModifyLocation_QNAME, ModifyLocationRequestType.class, ModifyLocation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "TNOrderPool", scope = LocationTelephonyType.class)
    public JAXBElement<String> createLocationTelephonyTypeTNOrderPool(String value) {
        return new JAXBElement<String>(_TelephonyTypeTNOrderPool_QNAME, String.class, LocationTelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "LATA", scope = LocationTelephonyType.class)
    public JAXBElement<String> createLocationTelephonyTypeLATA(String value) {
        return new JAXBElement<String>(_TelephonyTypeLATA_QNAME, String.class, LocationTelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "LATAName", scope = LocationTelephonyType.class)
    public JAXBElement<String> createLocationTelephonyTypeLATAName(String value) {
        return new JAXBElement<String>(_TelephonyTypeLATAName_QNAME, String.class, LocationTelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "ILECName", scope = LocationTelephonyType.class)
    public JAXBElement<String> createLocationTelephonyTypeILECName(String value) {
        return new JAXBElement<String>(_TelephonyTypeILECName_QNAME, String.class, LocationTelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "PSAPAgency", scope = LocationTelephonyType.class)
    public JAXBElement<String> createLocationTelephonyTypePSAPAgency(String value) {
        return new JAXBElement<String>(_TelephonyTypePSAPAgency_QNAME, String.class, LocationTelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "PSAPId", scope = LocationTelephonyType.class)
    public JAXBElement<String> createLocationTelephonyTypePSAPId(String value) {
        return new JAXBElement<String>(_TelephonyTypePSAPId_QNAME, String.class, LocationTelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "RateCenterName", scope = LocationTelephonyType.class)
    public JAXBElement<String> createLocationTelephonyTypeRateCenterName(String value) {
        return new JAXBElement<String>(_LocationTelephonyTypeRateCenterName_QNAME, String.class, LocationTelephonyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "locationStatus", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeLocationStatus(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeLocationStatus_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "customerType", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeCustomerType(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeCustomerType_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unincorporatedFlag", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeUnincorporatedFlag(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeUnincorporatedFlag_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dwellingCodeDescr", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeDwellingCodeDescr(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeDwellingCodeDescr_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "poleOwner", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypePoleOwner(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypePoleOwner_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "addressLine2Override", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeAddressLine2Override(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeAddressLine2Override_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "salesArea", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeSalesArea(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeSalesArea_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "hookupType", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeHookupType(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeHookupType_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "pedestal", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypePedestal(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypePedestal_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "lastCallDate", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<XMLGregorianCalendar> createLocationLegacyDetailsCSGTypeLastCallDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LocationLegacyDetailsCSGTypeLastCallDate_QNAME, XMLGregorianCalendar.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGHouseCommentsType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseComments", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<LocationLegacyDetailsCSGHouseCommentsType> createLocationLegacyDetailsCSGTypeHouseComments(LocationLegacyDetailsCSGHouseCommentsType value) {
        return new JAXBElement<LocationLegacyDetailsCSGHouseCommentsType>(_LocationLegacyDetailsCSGTypeHouseComments_QNAME, LocationLegacyDetailsCSGHouseCommentsType.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "cell", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeCell(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeCell_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dropLength", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeDropLength(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeDropLength_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGLineTagsType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "lineTag", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<LocationLegacyDetailsCSGLineTagsType> createLocationLegacyDetailsCSGTypeLineTag(LocationLegacyDetailsCSGLineTagsType value) {
        return new JAXBElement<LocationLegacyDetailsCSGLineTagsType>(_LocationLegacyDetailsCSGTypeLineTag_QNAME, LocationLegacyDetailsCSGLineTagsType.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "powerSupply", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypePowerSupply(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypePowerSupply_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "locationType", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeLocationType(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeLocationType_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "demographicCode", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeDemographicCode(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeDemographicCode_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "hub", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeHub(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeHub_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseMisc", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeHouseMisc(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeHouseMisc_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "rightOfEntryPermission", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeRightOfEntryPermission(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeRightOfEntryPermission_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dropType", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeDropType(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeDropType_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseUsageCode", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeHouseUsageCode(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeHouseUsageCode_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "technicianArea", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeTechnicianArea(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeTechnicianArea_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "mapCode", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeMapCode(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeMapCode_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "poleNumber", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypePoleNumber(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypePoleNumber_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGBridgerType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "bridgerAddress", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<LocationLegacyDetailsCSGBridgerType> createLocationLegacyDetailsCSGTypeBridgerAddress(LocationLegacyDetailsCSGBridgerType value) {
        return new JAXBElement<LocationLegacyDetailsCSGBridgerType>(_LocationLegacyDetailsCSGTypeBridgerAddress_QNAME, LocationLegacyDetailsCSGBridgerType.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "lastCallStatus", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeLastCallStatus(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeLastCallStatus_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "amplifier", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeAmplifier(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeAmplifier_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "ground", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeGround(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeGround_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "serviceArea", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeServiceArea(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeServiceArea_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dropSite", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeDropSite(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeDropSite_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "timeZone", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeTimeZone(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeTimeZone_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "locationCountyID", scope = LocationLegacyDetailsCSGType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGTypeLocationCountyID(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeLocationCountyID_QNAME, String.class, LocationLegacyDetailsCSGType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationReferenceDataRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryLocationReferenceData", scope = QueryLocationReferenceData.class)
    public JAXBElement<QueryLocationReferenceDataRequestType> createQueryLocationReferenceDataQueryLocationReferenceData(QueryLocationReferenceDataRequestType value) {
        return new JAXBElement<QueryLocationReferenceDataRequestType>(_QueryLocationReferenceDataQueryLocationReferenceData_QNAME, QueryLocationReferenceDataRequestType.class, QueryLocationReferenceData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNodeRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "DeleteNode", scope = DeleteNode.class)
    public JAXBElement<DeleteNodeRequestType> createDeleteNodeDeleteNode(DeleteNodeRequestType value) {
        return new JAXBElement<DeleteNodeRequestType>(_DeleteNodeDeleteNode_QNAME, DeleteNodeRequestType.class, DeleteNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "medicalNumber", scope = HomeSecurityContactNumbersType.class)
    public JAXBElement<String> createHomeSecurityContactNumbersTypeMedicalNumber(String value) {
        return new JAXBElement<String>(_HomeSecurityContactNumbersTypeMedicalNumber_QNAME, String.class, HomeSecurityContactNumbersType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "policeNumber", scope = HomeSecurityContactNumbersType.class)
    public JAXBElement<String> createHomeSecurityContactNumbersTypePoliceNumber(String value) {
        return new JAXBElement<String>(_HomeSecurityContactNumbersTypePoliceNumber_QNAME, String.class, HomeSecurityContactNumbersType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "fireNumber", scope = HomeSecurityContactNumbersType.class)
    public JAXBElement<String> createHomeSecurityContactNumbersTypeFireNumber(String value) {
        return new JAXBElement<String>(_HomeSecurityContactNumbersTypeFireNumber_QNAME, String.class, HomeSecurityContactNumbersType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMarketReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "marketReference", scope = QueryMarketResponseType.class)
    public JAXBElement<ArrayOfMarketReferenceType> createQueryMarketResponseTypeMarketReference(ArrayOfMarketReferenceType value) {
        return new JAXBElement<ArrayOfMarketReferenceType>(_QueryLocationResponseTypeMarketReference_QNAME, ArrayOfMarketReferenceType.class, QueryMarketResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVendorMarketReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "vendorMarketReference", scope = QueryMarketResponseType.class)
    public JAXBElement<ArrayOfVendorMarketReferenceType> createQueryMarketResponseTypeVendorMarketReference(ArrayOfVendorMarketReferenceType value) {
        return new JAXBElement<ArrayOfVendorMarketReferenceType>(_QueryMarketResponseTypeVendorMarketReference_QNAME, ArrayOfVendorMarketReferenceType.class, QueryMarketResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationXfinityRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "GetLocationXfinity", scope = GetLocationXfinity.class)
    public JAXBElement<GetLocationXfinityRequestType> createGetLocationXfinityGetLocationXfinity(GetLocationXfinityRequestType value) {
        return new JAXBElement<GetLocationXfinityRequestType>(_GetLocationXfinityGetLocationXfinity_QNAME, GetLocationXfinityRequestType.class, GetLocationXfinity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefreshCacheResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "refreshCacheReturn", scope = RefreshCacheResponse.class)
    public JAXBElement<RefreshCacheResponseType> createRefreshCacheResponseRefreshCacheReturn(RefreshCacheResponseType value) {
        return new JAXBElement<RefreshCacheResponseType>(_RefreshCacheResponseRefreshCacheReturn_QNAME, RefreshCacheResponseType.class, RefreshCacheResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationInformationRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "GetLocationInformation", scope = GetLocationInformation.class)
    public JAXBElement<GetLocationInformationRequestType> createGetLocationInformationGetLocationInformation(GetLocationInformationRequestType value) {
        return new JAXBElement<GetLocationInformationRequestType>(_GetLocationInformationGetLocationInformation_QNAME, GetLocationInformationRequestType.class, GetLocationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMarketRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "AddMarket", scope = AddMarket.class)
    public JAXBElement<AddMarketRequestType> createAddMarketAddMarket(AddMarketRequestType value) {
        return new JAXBElement<AddMarketRequestType>(_AddMarketAddMarket_QNAME, AddMarketRequestType.class, AddMarket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "CensusBlock", scope = LocationGeographyType.class)
    public JAXBElement<String> createLocationGeographyTypeCensusBlock(String value) {
        return new JAXBElement<String>(_GeocodedAddressTypeCensusBlock_QNAME, String.class, LocationGeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "PlaceName", scope = LocationGeographyType.class)
    public JAXBElement<String> createLocationGeographyTypePlaceName(String value) {
        return new JAXBElement<String>(_LocationGeographyTypePlaceName_QNAME, String.class, LocationGeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "CensusTract", scope = LocationGeographyType.class)
    public JAXBElement<String> createLocationGeographyTypeCensusTract(String value) {
        return new JAXBElement<String>(_GeocodedAddressTypeCensusTract_QNAME, String.class, LocationGeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "MinorCivilDivision", scope = LocationGeographyType.class)
    public JAXBElement<String> createLocationGeographyTypeMinorCivilDivision(String value) {
        return new JAXBElement<String>(_LocationGeographyTypeMinorCivilDivision_QNAME, String.class, LocationGeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "FIPSCode", scope = LocationGeographyType.class)
    public JAXBElement<String> createLocationGeographyTypeFIPSCode(String value) {
        return new JAXBElement<String>(_LocationGeographyTypeFIPSCode_QNAME, String.class, LocationGeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "CountyName", scope = LocationGeographyType.class)
    public JAXBElement<String> createLocationGeographyTypeCountyName(String value) {
        return new JAXBElement<String>(_LocationGeographyTypeCountyName_QNAME, String.class, LocationGeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "VertexCode", scope = LocationGeographyType.class)
    public JAXBElement<String> createLocationGeographyTypeVertexCode(String value) {
        return new JAXBElement<String>(_LocationGeographyTypeVertexCode_QNAME, String.class, LocationGeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyNodeResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "modifyNodeReturn", scope = ModifyNodeResponse.class)
    public JAXBElement<ModifyNodeResponseType> createModifyNodeResponseModifyNodeReturn(ModifyNodeResponseType value) {
        return new JAXBElement<ModifyNodeResponseType>(_ModifyNodeResponseModifyNodeReturn_QNAME, ModifyNodeResponseType.class, ModifyNodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLocationFromBillingRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "UpdateLocationFromBilling", scope = UpdateLocationFromBilling.class)
    public JAXBElement<UpdateLocationFromBillingRequestType> createUpdateLocationFromBillingUpdateLocationFromBilling(UpdateLocationFromBillingRequestType value) {
        return new JAXBElement<UpdateLocationFromBillingRequestType>(_UpdateLocationFromBillingUpdateLocationFromBilling_QNAME, UpdateLocationFromBillingRequestType.class, UpdateLocationFromBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStandardizedAddressXfinityType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "standardizedAddresses", scope = StandardizeAddressXfinityResponseItemType.class)
    public JAXBElement<ArrayOfStandardizedAddressXfinityType> createStandardizeAddressXfinityResponseItemTypeStandardizedAddresses(ArrayOfStandardizedAddressXfinityType value) {
        return new JAXBElement<ArrayOfStandardizedAddressXfinityType>(_StandardizeAddressXfinityResponseItemTypeStandardizedAddresses_QNAME, ArrayOfStandardizedAddressXfinityType.class, StandardizeAddressXfinityResponseItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfModifyLocationQueueRequestItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "ModifyLocationQueueRequests", scope = ModifyLocationQueueRequestType.class)
    public JAXBElement<ArrayOfModifyLocationQueueRequestItemType> createModifyLocationQueueRequestTypeModifyLocationQueueRequests(ArrayOfModifyLocationQueueRequestItemType value) {
        return new JAXBElement<ArrayOfModifyLocationQueueRequestItemType>(_ModifyLocationQueueRequestTypeModifyLocationQueueRequests_QNAME, ArrayOfModifyLocationQueueRequestItemType.class, ModifyLocationQueueRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "location", scope = UpdateLocationFromBillingResponseItemType.class)
    public JAXBElement<LocationType> createUpdateLocationFromBillingResponseItemTypeLocation(LocationType value) {
        return new JAXBElement<LocationType>(_QueryLocationResponseTypeLocation_QNAME, LocationType.class, UpdateLocationFromBillingResponseItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingAttributesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "BuildingAttribute", scope = BusinessServiceabilityAttributesType.class)
    public JAXBElement<BuildingAttributesType> createBusinessServiceabilityAttributesTypeBuildingAttribute(BuildingAttributesType value) {
        return new JAXBElement<BuildingAttributesType>(_BusinessServiceabilityAttributesTypeBuildingAttribute_QNAME, BuildingAttributesType.class, BusinessServiceabilityAttributesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationQueueRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryLocationQueue", scope = QueryLocationQueue.class)
    public JAXBElement<QueryLocationQueueRequestType> createQueryLocationQueueQueryLocationQueue(QueryLocationQueueRequestType value) {
        return new JAXBElement<QueryLocationQueueRequestType>(_QueryLocationQueueQueryLocationQueue_QNAME, QueryLocationQueueRequestType.class, QueryLocationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyDuplicateHouseToBillingResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "copyDuplicateHouseToBillingReturn", scope = CopyDuplicateHouseToBillingResponse.class)
    public JAXBElement<CopyDuplicateHouseToBillingResponseType> createCopyDuplicateHouseToBillingResponseCopyDuplicateHouseToBillingReturn(CopyDuplicateHouseToBillingResponseType value) {
        return new JAXBElement<CopyDuplicateHouseToBillingResponseType>(_CopyDuplicateHouseToBillingResponseCopyDuplicateHouseToBillingReturn_QNAME, CopyDuplicateHouseToBillingResponseType.class, CopyDuplicateHouseToBillingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "complex", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeComplex(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeComplex_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "mkt", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeMkt(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeMkt_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "auxX1", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeAuxX1(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeAuxX1_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "customerType", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeCustomerType(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeCustomerType_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "auxX3", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeAuxX3(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeAuxX3_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dual", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeDual(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeDual_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dualHouse", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeDualHouse(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeDualHouse_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "auxX2", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeAuxX2(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeAuxX2_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "map", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeMap(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeMap_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "constructionArea", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeConstructionArea(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeConstructionArea_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "info", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeInfo(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeInfo_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dupHouse", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeDupHouse(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeDupHouse_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dwellingCodeDescr", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeDwellingCodeDescr(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeDwellingCodeDescr_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseComment", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeHouseComment(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeHouseComment_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "drop", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeDrop(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeDrop_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "auxY6", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeAuxY6(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeAuxY6_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dwellingTypeCode", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeDwellingTypeCode(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeDwellingTypeCode_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "auxY7", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeAuxY7(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeAuxY7_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseNumber", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeHouseNumber(String value) {
        return new JAXBElement<String>(_PostalAddressTypeHouseNumber_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "controlArea", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeControlArea(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeControlArea_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "auxY2", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeAuxY2(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeAuxY2_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "auxY1", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeAuxY1(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeAuxY1_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "networkInfo", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeNetworkInfo(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeNetworkInfo_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "auxY3", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeAuxY3(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeAuxY3_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "networkID", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeNetworkID(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeNetworkID_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "customerNumber", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeCustomerNumber(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeCustomerNumber_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "salesRoute", scope = LocationLegacyDetailsDSTType.class)
    public JAXBElement<String> createLocationLegacyDetailsDSTTypeSalesRoute(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsDSTTypeSalesRoute_QNAME, String.class, LocationLegacyDetailsDSTType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMsagDataResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "addMsagDataReturn", scope = AddMsagDataResponse.class)
    public JAXBElement<AddMsagDataResponseType> createAddMsagDataResponseAddMsagDataReturn(AddMsagDataResponseType value) {
        return new JAXBElement<AddMsagDataResponseType>(_AddMsagDataResponseAddMsagDataReturn_QNAME, AddMsagDataResponseType.class, AddMsagDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodingCustomMatchModeType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "customMatchModeSettings", scope = GeocodingConstraintsType.class)
    public JAXBElement<GeocodingCustomMatchModeType> createGeocodingConstraintsTypeCustomMatchModeSettings(GeocodingCustomMatchModeType value) {
        return new JAXBElement<GeocodingCustomMatchModeType>(_GeocodingConstraintsTypeCustomMatchModeSettings_QNAME, GeocodingCustomMatchModeType.class, GeocodingConstraintsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyLocationQueueRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "ModifyLocationQueue", scope = ModifyLocationQueue.class)
    public JAXBElement<ModifyLocationQueueRequestType> createModifyLocationQueueModifyLocationQueue(ModifyLocationQueueRequestType value) {
        return new JAXBElement<ModifyLocationQueueRequestType>(_ModifyLocationQueueModifyLocationQueue_QNAME, ModifyLocationQueueRequestType.class, ModifyLocationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyLocationResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "modifyLocationReturn", scope = ModifyLocationResponse.class)
    public JAXBElement<ModifyLocationResponseType> createModifyLocationResponseModifyLocationReturn(ModifyLocationResponseType value) {
        return new JAXBElement<ModifyLocationResponseType>(_ModifyLocationResponseModifyLocationReturn_QNAME, ModifyLocationResponseType.class, ModifyLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "deleteSingleViewAddressAssociationReturn", scope = DeleteSingleViewAddressAssociationResponse.class)
    public JAXBElement<ResponseStatusType> createDeleteSingleViewAddressAssociationResponseDeleteSingleViewAddressAssociationReturn(ResponseStatusType value) {
        return new JAXBElement<ResponseStatusType>(_DeleteSingleViewAddressAssociationResponseDeleteSingleViewAddressAssociationReturn_QNAME, ResponseStatusType.class, DeleteSingleViewAddressAssociationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationQueueRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "GetLocationQueue", scope = GetLocationQueue.class)
    public JAXBElement<GetLocationQueueRequestType> createGetLocationQueueGetLocationQueue(GetLocationQueueRequestType value) {
        return new JAXBElement<GetLocationQueueRequestType>(_GetLocationQueueGetLocationQueue_QNAME, GetLocationQueueRequestType.class, GetLocationQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLocationResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "deleteLocationReturn", scope = DeleteLocationResponse.class)
    public JAXBElement<DeleteLocationResponseType> createDeleteLocationResponseDeleteLocationReturn(DeleteLocationResponseType value) {
        return new JAXBElement<DeleteLocationResponseType>(_DeleteLocationResponseDeleteLocationReturn_QNAME, DeleteLocationResponseType.class, DeleteLocationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseStatusType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "associateSingleViewAddressReturn", scope = AssociateSingleViewAddressResponse.class)
    public JAXBElement<ResponseStatusType> createAssociateSingleViewAddressResponseAssociateSingleViewAddressReturn(ResponseStatusType value) {
        return new JAXBElement<ResponseStatusType>(_AssociateSingleViewAddressResponseAssociateSingleViewAddressReturn_QNAME, ResponseStatusType.class, AssociateSingleViewAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "NTID", scope = LocationQueueModifyContactInfoType.class)
    public JAXBElement<String> createLocationQueueModifyContactInfoTypeNTID(String value) {
        return new JAXBElement<String>(_LocationQueueModifyContactInfoTypeNTID_QNAME, String.class, LocationQueueModifyContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "phone", scope = LocationQueueModifyContactInfoType.class)
    public JAXBElement<String> createLocationQueueModifyContactInfoTypePhone(String value) {
        return new JAXBElement<String>(_LocationQueueModifyContactInfoTypePhone_QNAME, String.class, LocationQueueModifyContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationQueueOrigType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "organization", scope = LocationQueueModifyContactInfoType.class)
    public JAXBElement<LocationQueueOrigType> createLocationQueueModifyContactInfoTypeOrganization(LocationQueueOrigType value) {
        return new JAXBElement<LocationQueueOrigType>(_LocationQueueModifyContactInfoTypeOrganization_QNAME, LocationQueueOrigType.class, LocationQueueModifyContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "email", scope = LocationQueueModifyContactInfoType.class)
    public JAXBElement<String> createLocationQueueModifyContactInfoTypeEmail(String value) {
        return new JAXBElement<String>(_LocationQueueModifyContactInfoTypeEmail_QNAME, String.class, LocationQueueModifyContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "name", scope = LocationQueueModifyContactInfoType.class)
    public JAXBElement<String> createLocationQueueModifyContactInfoTypeName(String value) {
        return new JAXBElement<String>(_LocationQueueModifyContactInfoTypeName_QNAME, String.class, LocationQueueModifyContactInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationDetailsRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryLocationDetails", scope = QueryLocationDetails.class)
    public JAXBElement<QueryLocationDetailsRequestType> createQueryLocationDetailsQueryLocationDetails(QueryLocationDetailsRequestType value) {
        return new JAXBElement<QueryLocationDetailsRequestType>(_QueryLocationDetailsQueryLocationDetails_QNAME, QueryLocationDetailsRequestType.class, QueryLocationDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationQueueResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryLocationQueueReturn", scope = QueryLocationQueueResponse.class)
    public JAXBElement<QueryLocationQueueResponseType> createQueryLocationQueueResponseQueryLocationQueueReturn(QueryLocationQueueResponseType value) {
        return new JAXBElement<QueryLocationQueueResponseType>(_QueryLocationQueueResponseQueryLocationQueueReturn_QNAME, QueryLocationQueueResponseType.class, QueryLocationQueueResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMarketHierarchyLevelResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "marketHierarchy", scope = MarketHierarchyLevelInfo.class)
    public JAXBElement<ArrayOfMarketHierarchyLevelResponseType> createMarketHierarchyLevelInfoMarketHierarchy(ArrayOfMarketHierarchyLevelResponseType value) {
        return new JAXBElement<ArrayOfMarketHierarchyLevelResponseType>(_MarketHierarchyLevelInfoMarketHierarchy_QNAME, ArrayOfMarketHierarchyLevelResponseType.class, MarketHierarchyLevelInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingSystemFormattedAddressesDDPType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "ddpFormattedAddress", scope = BillingSystemFormattedAddressesType.class)
    public JAXBElement<BillingSystemFormattedAddressesDDPType> createBillingSystemFormattedAddressesTypeDdpFormattedAddress(BillingSystemFormattedAddressesDDPType value) {
        return new JAXBElement<BillingSystemFormattedAddressesDDPType>(_BillingSystemFormattedAddressesTypeDdpFormattedAddress_QNAME, BillingSystemFormattedAddressesDDPType.class, BillingSystemFormattedAddressesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingSystemFormattedAddressesCSGType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "csgFormattedAddress", scope = BillingSystemFormattedAddressesType.class)
    public JAXBElement<BillingSystemFormattedAddressesCSGType> createBillingSystemFormattedAddressesTypeCsgFormattedAddress(BillingSystemFormattedAddressesCSGType value) {
        return new JAXBElement<BillingSystemFormattedAddressesCSGType>(_BillingSystemFormattedAddressesTypeCsgFormattedAddress_QNAME, BillingSystemFormattedAddressesCSGType.class, BillingSystemFormattedAddressesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "bridgerPrivate", scope = LocationLegacyDetailsCSGBridgerType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGBridgerTypeBridgerPrivate(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGBridgerTypeBridgerPrivate_QNAME, String.class, LocationLegacyDetailsCSGBridgerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "bridgerBidirectional", scope = LocationLegacyDetailsCSGBridgerType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGBridgerTypeBridgerBidirectional(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGBridgerTypeBridgerBidirectional_QNAME, String.class, LocationLegacyDetailsCSGBridgerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "bridgerGateControl", scope = LocationLegacyDetailsCSGBridgerType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGBridgerTypeBridgerGateControl(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGBridgerTypeBridgerGateControl_QNAME, String.class, LocationLegacyDetailsCSGBridgerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddModifyMarketResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "addMarketReturn", scope = AddMarketResponse.class)
    public JAXBElement<AddModifyMarketResponseType> createAddMarketResponseAddMarketReturn(AddModifyMarketResponseType value) {
        return new JAXBElement<AddModifyMarketResponseType>(_AddMarketResponseAddMarketReturn_QNAME, AddModifyMarketResponseType.class, AddMarketResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMarketByBoundaryRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryMarketByBoundary", scope = QueryMarketByBoundary.class)
    public JAXBElement<QueryMarketByBoundaryRequestType> createQueryMarketByBoundaryQueryMarketByBoundary(QueryMarketByBoundaryRequestType value) {
        return new JAXBElement<QueryMarketByBoundaryRequestType>(_QueryMarketByBoundaryQueryMarketByBoundary_QNAME, QueryMarketByBoundaryRequestType.class, QueryMarketByBoundary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "RequestedPriority", scope = LocationQueueReferenceType.class)
    public JAXBElement<Integer> createLocationQueueReferenceTypeRequestedPriority(Integer value) {
        return new JAXBElement<Integer>(_LocationQueueReferenceTypeRequestedPriority_QNAME, Integer.class, LocationQueueReferenceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unitTypes", scope = AddLocationQueueAddressType.class)
    public JAXBElement<ArrayOfUnitTypesType> createAddLocationQueueAddressTypeUnitTypes(ArrayOfUnitTypesType value) {
        return new JAXBElement<ArrayOfUnitTypesType>(_LocationQueueAddressTypeUnitTypes_QNAME, ArrayOfUnitTypesType.class, AddLocationQueueAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "country", scope = AddLocationQueueAddressType.class)
    public JAXBElement<CountryCodeType> createAddLocationQueueAddressTypeCountry(CountryCodeType value) {
        return new JAXBElement<CountryCodeType>(_LocationQueueAddressTypeCountry_QNAME, CountryCodeType.class, AddLocationQueueAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "ManagementArea", scope = DSTLegacyMarketType.class)
    public JAXBElement<String> createDSTLegacyMarketTypeManagementArea(String value) {
        return new JAXBElement<String>(_DSTLegacyMarketTypeManagementArea_QNAME, String.class, DSTLegacyMarketType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "FranchiseTaxArea", scope = DSTLegacyMarketType.class)
    public JAXBElement<String> createDSTLegacyMarketTypeFranchiseTaxArea(String value) {
        return new JAXBElement<String>(_DSTLegacyMarketTypeFranchiseTaxArea_QNAME, String.class, DSTLegacyMarketType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyLocationToBillingRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "CopyLocationToBilling", scope = CopyLocationToBilling.class)
    public JAXBElement<CopyLocationToBillingRequestType> createCopyLocationToBillingCopyLocationToBilling(CopyLocationToBillingRequestType value) {
        return new JAXBElement<CopyLocationToBillingRequestType>(_CopyLocationToBillingCopyLocationToBilling_QNAME, CopyLocationToBillingRequestType.class, CopyLocationToBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardizeAddressXfinityRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "StandardizeAddressXfinity", scope = StandardizeAddressXfinity.class)
    public JAXBElement<StandardizeAddressXfinityRequestType> createStandardizeAddressXfinityStandardizeAddressXfinity(StandardizeAddressXfinityRequestType value) {
        return new JAXBElement<StandardizeAddressXfinityRequestType>(_StandardizeAddressXfinityStandardizeAddressXfinity_QNAME, StandardizeAddressXfinityRequestType.class, StandardizeAddressXfinity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardizeAddressXfinityResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "standardizeAddressXfinityReturn", scope = StandardizeAddressXfinityResponse.class)
    public JAXBElement<StandardizeAddressXfinityResponseType> createStandardizeAddressXfinityResponseStandardizeAddressXfinityReturn(StandardizeAddressXfinityResponseType value) {
        return new JAXBElement<StandardizeAddressXfinityResponseType>(_StandardizeAddressXfinityResponseStandardizeAddressXfinityReturn_QNAME, StandardizeAddressXfinityResponseType.class, StandardizeAddressXfinityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "enabled", scope = SeasonalSuspendType.class)
    public JAXBElement<Boolean> createSeasonalSuspendTypeEnabled(Boolean value) {
        return new JAXBElement<Boolean>(_SeasonalSuspendTypeEnabled_QNAME, Boolean.class, SeasonalSuspendType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "preDateTotalDaysAllowed", scope = SeasonalSuspendType.class)
    public JAXBElement<Long> createSeasonalSuspendTypePreDateTotalDaysAllowed(Long value) {
        return new JAXBElement<Long>(_SeasonalSuspendTypePreDateTotalDaysAllowed_QNAME, Long.class, SeasonalSuspendType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMsagAddressAssociationRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "DeleteMsagAddressAssociation", scope = DeleteMsagAddressAssociation.class)
    public JAXBElement<DeleteMsagAddressAssociationRequestType> createDeleteMsagAddressAssociationDeleteMsagAddressAssociation(DeleteMsagAddressAssociationRequestType value) {
        return new JAXBElement<DeleteMsagAddressAssociationRequestType>(_DeleteMsagAddressAssociationDeleteMsagAddressAssociation_QNAME, DeleteMsagAddressAssociationRequestType.class, DeleteMsagAddressAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLocationGeospatialResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryLocationGeospatialReturn", scope = QueryLocationGeospatialResponse.class)
    public JAXBElement<QueryLocationGeospatialResponseType> createQueryLocationGeospatialResponseQueryLocationGeospatialReturn(QueryLocationGeospatialResponseType value) {
        return new JAXBElement<QueryLocationGeospatialResponseType>(_QueryLocationGeospatialResponseQueryLocationGeospatialReturn_QNAME, QueryLocationGeospatialResponseType.class, QueryLocationGeospatialResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMsagDataResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "getMsagDataReturn", scope = GetMsagDataResponse.class)
    public JAXBElement<GetMsagDataResponseType> createGetMsagDataResponseGetMsagDataReturn(GetMsagDataResponseType value) {
        return new JAXBElement<GetMsagDataResponseType>(_GetMsagDataResponseGetMsagDataReturn_QNAME, GetMsagDataResponseType.class, GetMsagDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "singleViewID", scope = ModifySingleViewAddressAssociationType.class)
    public JAXBElement<String> createModifySingleViewAddressAssociationTypeSingleViewID(String value) {
        return new JAXBElement<String>(_DeleteSingleViewAddressAssociationTypeSingleViewID_QNAME, String.class, ModifySingleViewAddressAssociationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "addressID", scope = ModifySingleViewAddressAssociationType.class)
    public JAXBElement<String> createModifySingleViewAddressAssociationTypeAddressID(String value) {
        return new JAXBElement<String>(_DeleteSingleViewAddressAssociationTypeAddressID_QNAME, String.class, ModifySingleViewAddressAssociationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteE911AddressResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "deleteE911AddressReturn", scope = DeleteE911AddressResponse.class)
    public JAXBElement<DeleteE911AddressResponseType> createDeleteE911AddressResponseDeleteE911AddressReturn(DeleteE911AddressResponseType value) {
        return new JAXBElement<DeleteE911AddressResponseType>(_DeleteE911AddressResponseDeleteE911AddressReturn_QNAME, DeleteE911AddressResponseType.class, DeleteE911AddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLocationInBillingRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "UpdateLocationInBilling", scope = UpdateLocationInBilling.class)
    public JAXBElement<UpdateLocationInBillingRequestType> createUpdateLocationInBillingUpdateLocationInBilling(UpdateLocationInBillingRequestType value) {
        return new JAXBElement<UpdateLocationInBillingRequestType>(_UpdateLocationInBillingUpdateLocationInBilling_QNAME, UpdateLocationInBillingRequestType.class, UpdateLocationInBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMarketResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryMarketReturn", scope = QueryMarketResponse.class)
    public JAXBElement<QueryMarketResponseType> createQueryMarketResponseQueryMarketReturn(QueryMarketResponseType value) {
        return new JAXBElement<QueryMarketResponseType>(_QueryMarketResponseQueryMarketReturn_QNAME, QueryMarketResponseType.class, QueryMarketResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMarketRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "DeleteMarket", scope = DeleteMarket.class)
    public JAXBElement<DeleteMarketRequestType> createDeleteMarketDeleteMarket(DeleteMarketRequestType value) {
        return new JAXBElement<DeleteMarketRequestType>(_DeleteMarketDeleteMarket_QNAME, DeleteMarketRequestType.class, DeleteMarket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "PlaceName", scope = GeographyType.class)
    public JAXBElement<String> createGeographyTypePlaceName(String value) {
        return new JAXBElement<String>(_LocationGeographyTypePlaceName_QNAME, String.class, GeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "MinorCivilDivision", scope = GeographyType.class)
    public JAXBElement<String> createGeographyTypeMinorCivilDivision(String value) {
        return new JAXBElement<String>(_LocationGeographyTypeMinorCivilDivision_QNAME, String.class, GeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "FIPSCode", scope = GeographyType.class)
    public JAXBElement<String> createGeographyTypeFIPSCode(String value) {
        return new JAXBElement<String>(_LocationGeographyTypeFIPSCode_QNAME, String.class, GeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "CountyName", scope = GeographyType.class)
    public JAXBElement<String> createGeographyTypeCountyName(String value) {
        return new JAXBElement<String>(_LocationGeographyTypeCountyName_QNAME, String.class, GeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "VertexCode", scope = GeographyType.class)
    public JAXBElement<String> createGeographyTypeVertexCode(String value) {
        return new JAXBElement<String>(_LocationGeographyTypeVertexCode_QNAME, String.class, GeographyType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLocationFromBillingRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "DeleteLocationFromBilling", scope = DeleteLocationFromBilling.class)
    public JAXBElement<DeleteLocationFromBillingRequestType> createDeleteLocationFromBillingDeleteLocationFromBilling(DeleteLocationFromBillingRequestType value) {
        return new JAXBElement<DeleteLocationFromBillingRequestType>(_DeleteLocationFromBillingDeleteLocationFromBilling_QNAME, DeleteLocationFromBillingRequestType.class, DeleteLocationFromBilling.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "NeedByDate", scope = ModifyLocationQueueRequestItemType.class)
    public JAXBElement<XMLGregorianCalendar> createModifyLocationQueueRequestItemTypeNeedByDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ModifyLocationQueueRequestItemTypeNeedByDate_QNAME, XMLGregorianCalendar.class, ModifyLocationQueueRequestItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "Comments", scope = ModifyLocationQueueRequestItemType.class)
    public JAXBElement<String> createModifyLocationQueueRequestItemTypeComments(String value) {
        return new JAXBElement<String>(_ModifyLocationQueueRequestItemTypeComments_QNAME, String.class, ModifyLocationQueueRequestItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyLocationQueueAddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "LocationQueueAddress", scope = ModifyLocationQueueRequestItemType.class)
    public JAXBElement<ModifyLocationQueueAddressType> createModifyLocationQueueRequestItemTypeLocationQueueAddress(ModifyLocationQueueAddressType value) {
        return new JAXBElement<ModifyLocationQueueAddressType>(_ModifyLocationQueueRequestItemTypeLocationQueueAddress_QNAME, ModifyLocationQueueAddressType.class, ModifyLocationQueueRequestItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "marketID", scope = ModifyLocationQueueRequestItemType.class)
    public JAXBElement<Long> createModifyLocationQueueRequestItemTypeMarketID(Long value) {
        return new JAXBElement<Long>(_NodeReferenceTypeMarketID_QNAME, Long.class, ModifyLocationQueueRequestItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "LeadID", scope = ModifyLocationQueueRequestItemType.class)
    public JAXBElement<String> createModifyLocationQueueRequestItemTypeLeadID(String value) {
        return new JAXBElement<String>(_ModifyLocationQueueRequestItemTypeLeadID_QNAME, String.class, ModifyLocationQueueRequestItemType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessServiceabilityResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "getBusinessServiceabilityReturn", scope = GetBusinessServiceabilityResponse.class)
    public JAXBElement<GetBusinessServiceabilityResponseType> createGetBusinessServiceabilityResponseGetBusinessServiceabilityReturn(GetBusinessServiceabilityResponseType value) {
        return new JAXBElement<GetBusinessServiceabilityResponseType>(_GetBusinessServiceabilityResponseGetBusinessServiceabilityReturn_QNAME, GetBusinessServiceabilityResponseType.class, GetBusinessServiceabilityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyNodeRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "ModifyNode", scope = ModifyNode.class)
    public JAXBElement<ModifyNodeRequestType> createModifyNodeModifyNode(ModifyNodeRequestType value) {
        return new JAXBElement<ModifyNodeRequestType>(_ModifyNodeModifyNode_QNAME, ModifyNodeRequestType.class, ModifyNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "singleViewID", scope = SingleViewAddressDetailsType.class)
    public JAXBElement<ArrayOfString> createSingleViewAddressDetailsTypeSingleViewID(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_DeleteSingleViewAddressAssociationTypeSingleViewID_QNAME, ArrayOfString.class, SingleViewAddressDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSingleViewAddressAssociationType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "DeleteSingleViewAddressAssociation", scope = DeleteSingleViewAddressAssociation.class)
    public JAXBElement<DeleteSingleViewAddressAssociationType> createDeleteSingleViewAddressAssociationDeleteSingleViewAddressAssociation(DeleteSingleViewAddressAssociationType value) {
        return new JAXBElement<DeleteSingleViewAddressAssociationType>(_DeleteSingleViewAddressAssociationDeleteSingleViewAddressAssociation_QNAME, DeleteSingleViewAddressAssociationType.class, DeleteSingleViewAddressAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMsagPriorityRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "UpdateMsagPriority", scope = UpdateMsagPriority.class)
    public JAXBElement<UpdateMsagPriorityRequestType> createUpdateMsagPriorityUpdateMsagPriority(UpdateMsagPriorityRequestType value) {
        return new JAXBElement<UpdateMsagPriorityRequestType>(_UpdateMsagPriorityUpdateMsagPriority_QNAME, UpdateMsagPriorityRequestType.class, UpdateMsagPriority.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStandardizeAddressXfinityAddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "addresses", scope = StandardizeAddressXfinityRequestType.class)
    public JAXBElement<ArrayOfStandardizeAddressXfinityAddressType> createStandardizeAddressXfinityRequestTypeAddresses(ArrayOfStandardizeAddressXfinityAddressType value) {
        return new JAXBElement<ArrayOfStandardizeAddressXfinityAddressType>(_StandardizeAddressXfinityResponseTypeAddresses_QNAME, ArrayOfStandardizeAddressXfinityAddressType.class, StandardizeAddressXfinityRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitTypesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unitTypes", scope = LocationQueueAddressCriteriaType.class)
    public JAXBElement<ArrayOfUnitTypesType> createLocationQueueAddressCriteriaTypeUnitTypes(ArrayOfUnitTypesType value) {
        return new JAXBElement<ArrayOfUnitTypesType>(_LocationQueueAddressTypeUnitTypes_QNAME, ArrayOfUnitTypesType.class, LocationQueueAddressCriteriaType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "latitude", scope = GeographyInfoType.class)
    public JAXBElement<BigDecimal> createGeographyInfoTypeLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GeocodingResultsTypeLatitude_QNAME, BigDecimal.class, GeographyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "longitude", scope = GeographyInfoType.class)
    public JAXBElement<BigDecimal> createGeographyInfoTypeLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GeocodingResultsTypeLongitude_QNAME, BigDecimal.class, GeographyInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMarketHierarchyRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryMarketHierarchy", scope = QueryMarketHierarchy.class)
    public JAXBElement<QueryMarketHierarchyRequestType> createQueryMarketHierarchyQueryMarketHierarchy(QueryMarketHierarchyRequestType value) {
        return new JAXBElement<QueryMarketHierarchyRequestType>(_QueryMarketHierarchyQueryMarketHierarchy_QNAME, QueryMarketHierarchyRequestType.class, QueryMarketHierarchy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationInformationResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "getLocationInformationReturn", scope = GetLocationInformationResponse.class)
    public JAXBElement<GetLocationInformationResponseType> createGetLocationInformationResponseGetLocationInformationReturn(GetLocationInformationResponseType value) {
        return new JAXBElement<GetLocationInformationResponseType>(_GetLocationInformationResponseGetLocationInformationReturn_QNAME, GetLocationInformationResponseType.class, GetLocationInformationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "geography", scope = StandardizeAddressXfinityRequestedResultsType.class)
    public JAXBElement<Boolean> createStandardizeAddressXfinityRequestedResultsTypeGeography(Boolean value) {
        return new JAXBElement<Boolean>(_StandardizedAddressXfinityTypeGeography_QNAME, Boolean.class, StandardizeAddressXfinityRequestedResultsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "telephony", scope = StandardizeAddressXfinityRequestedResultsType.class)
    public JAXBElement<Boolean> createStandardizeAddressXfinityRequestedResultsTypeTelephony(Boolean value) {
        return new JAXBElement<Boolean>(_StandardizedAddressXfinityTypeTelephony_QNAME, Boolean.class, StandardizeAddressXfinityRequestedResultsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "msag", scope = StandardizeAddressXfinityRequestedResultsType.class)
    public JAXBElement<Boolean> createStandardizeAddressXfinityRequestedResultsTypeMsag(Boolean value) {
        return new JAXBElement<Boolean>(_StandardizedAddressXfinityTypeMsag_QNAME, Boolean.class, StandardizeAddressXfinityRequestedResultsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLocationQueueResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "addLocationQueueReturn", scope = AddLocationQueueResponse.class)
    public JAXBElement<AddLocationQueueResponseType> createAddLocationQueueResponseAddLocationQueueReturn(AddLocationQueueResponseType value) {
        return new JAXBElement<AddLocationQueueResponseType>(_AddLocationQueueResponseAddLocationQueueReturn_QNAME, AddLocationQueueResponseType.class, AddLocationQueueResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMsagAddressAssociationResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "deleteMsagAddressAssociationReturn", scope = DeleteMsagAddressAssociationResponse.class)
    public JAXBElement<DeleteMsagAddressAssociationResponseType> createDeleteMsagAddressAssociationResponseDeleteMsagAddressAssociationReturn(DeleteMsagAddressAssociationResponseType value) {
        return new JAXBElement<DeleteMsagAddressAssociationResponseType>(_DeleteMsagAddressAssociationResponseDeleteMsagAddressAssociationReturn_QNAME, DeleteMsagAddressAssociationResponseType.class, DeleteMsagAddressAssociationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unitType", scope = UnitTypesType.class)
    public JAXBElement<String> createUnitTypesTypeUnitType(String value) {
        return new JAXBElement<String>(_UnitTypesTypeUnitType_QNAME, String.class, UnitTypesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unitValue", scope = UnitTypesType.class)
    public JAXBElement<String> createUnitTypesTypeUnitValue(String value) {
        return new JAXBElement<String>(_UnitTypesTypeUnitValue_QNAME, String.class, UnitTypesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "alternateNodeNameValue", scope = AlternateNodeName.class)
    public JAXBElement<String> createAlternateNodeNameAlternateNodeNameValue(String value) {
        return new JAXBElement<String>(_AlternateNodeNameAlternateNodeNameValue_QNAME, String.class, AlternateNodeName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "alternateNodeNameSequence", scope = AlternateNodeName.class)
    public JAXBElement<Integer> createAlternateNodeNameAlternateNodeNameSequence(Integer value) {
        return new JAXBElement<Integer>(_AlternateNodeNameAlternateNodeNameSequence_QNAME, Integer.class, AlternateNodeName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "locationStatus", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeLocationStatus(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeLocationStatus_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "customerType", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeCustomerType(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeCustomerType_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "unincorporatedFlag", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeUnincorporatedFlag(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeUnincorporatedFlag_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dwellingCodeDescr", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeDwellingCodeDescr(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeDwellingCodeDescr_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "poleOwner", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypePoleOwner(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypePoleOwner_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "addressLine2Override", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeAddressLine2Override(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeAddressLine2Override_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "salesArea", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeSalesArea(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeSalesArea_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "lastCallDate", scope = CSGDetailsType.class)
    public JAXBElement<XMLGregorianCalendar> createCSGDetailsTypeLastCallDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LocationLegacyDetailsCSGTypeLastCallDate_QNAME, XMLGregorianCalendar.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "hookupType", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeHookupType(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeHookupType_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "pedestal", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypePedestal(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypePedestal_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGHouseCommentsType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseComments", scope = CSGDetailsType.class)
    public JAXBElement<LocationLegacyDetailsCSGHouseCommentsType> createCSGDetailsTypeHouseComments(LocationLegacyDetailsCSGHouseCommentsType value) {
        return new JAXBElement<LocationLegacyDetailsCSGHouseCommentsType>(_LocationLegacyDetailsCSGTypeHouseComments_QNAME, LocationLegacyDetailsCSGHouseCommentsType.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "cell", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeCell(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeCell_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dropLength", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeDropLength(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeDropLength_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGLineTagsType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "lineTag", scope = CSGDetailsType.class)
    public JAXBElement<LocationLegacyDetailsCSGLineTagsType> createCSGDetailsTypeLineTag(LocationLegacyDetailsCSGLineTagsType value) {
        return new JAXBElement<LocationLegacyDetailsCSGLineTagsType>(_LocationLegacyDetailsCSGTypeLineTag_QNAME, LocationLegacyDetailsCSGLineTagsType.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "powerSupply", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypePowerSupply(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypePowerSupply_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "locationType", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeLocationType(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeLocationType_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "demographicCode", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeDemographicCode(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeDemographicCode_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "hub", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeHub(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeHub_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseMisc", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeHouseMisc(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeHouseMisc_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "rightOfEntryPermission", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeRightOfEntryPermission(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeRightOfEntryPermission_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "houseUsageCode", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeHouseUsageCode(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeHouseUsageCode_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dropType", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeDropType(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeDropType_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "technicianArea", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeTechnicianArea(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeTechnicianArea_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "mapCode", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeMapCode(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeMapCode_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationLegacyDetailsCSGBridgerType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "bridgerAddress", scope = CSGDetailsType.class)
    public JAXBElement<LocationLegacyDetailsCSGBridgerType> createCSGDetailsTypeBridgerAddress(LocationLegacyDetailsCSGBridgerType value) {
        return new JAXBElement<LocationLegacyDetailsCSGBridgerType>(_LocationLegacyDetailsCSGTypeBridgerAddress_QNAME, LocationLegacyDetailsCSGBridgerType.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "poleNumber", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypePoleNumber(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypePoleNumber_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "lastCallStatus", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeLastCallStatus(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeLastCallStatus_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "amplifier", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeAmplifier(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeAmplifier_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "ground", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeGround(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeGround_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "serviceArea", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeServiceArea(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeServiceArea_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dropSite", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeDropSite(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeDropSite_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "timeZone", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeTimeZone(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeTimeZone_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "locationCountyID", scope = CSGDetailsType.class)
    public JAXBElement<String> createCSGDetailsTypeLocationCountyID(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGTypeLocationCountyID_QNAME, String.class, CSGDetailsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNodeResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "addNodeReturn", scope = AddNodeResponse.class)
    public JAXBElement<AddNodeResponseType> createAddNodeResponseAddNodeReturn(AddNodeResponseType value) {
        return new JAXBElement<AddNodeResponseType>(_AddNodeResponseAddNodeReturn_QNAME, AddNodeResponseType.class, AddNodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "tapStatus", scope = LocationLegacyDetailsCSGLineOfBusinessType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGLineOfBusinessTypeTapStatus(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGLineOfBusinessTypeTapStatus_QNAME, String.class, LocationLegacyDetailsCSGLineOfBusinessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "projectServiceDate", scope = LocationLegacyDetailsCSGLineOfBusinessType.class)
    public JAXBElement<XMLGregorianCalendar> createLocationLegacyDetailsCSGLineOfBusinessTypeProjectServiceDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LocationLegacyDetailsCSGLineOfBusinessTypeProjectServiceDate_QNAME, XMLGregorianCalendar.class, LocationLegacyDetailsCSGLineOfBusinessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "lobSwitch", scope = LocationLegacyDetailsCSGLineOfBusinessType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGLineOfBusinessTypeLobSwitch(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGLineOfBusinessTypeLobSwitch_QNAME, String.class, LocationLegacyDetailsCSGLineOfBusinessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "node", scope = LocationLegacyDetailsCSGLineOfBusinessType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGLineOfBusinessTypeNode(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGLineOfBusinessTypeNode_QNAME, String.class, LocationLegacyDetailsCSGLineOfBusinessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "router", scope = LocationLegacyDetailsCSGLineOfBusinessType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGLineOfBusinessTypeRouter(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGLineOfBusinessTypeRouter_QNAME, String.class, LocationLegacyDetailsCSGLineOfBusinessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "networkInterfaceUnit", scope = LocationLegacyDetailsCSGLineOfBusinessType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGLineOfBusinessTypeNetworkInterfaceUnit(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGLineOfBusinessTypeNetworkInterfaceUnit_QNAME, String.class, LocationLegacyDetailsCSGLineOfBusinessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "lobServiceStatus", scope = LocationLegacyDetailsCSGLineOfBusinessType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGLineOfBusinessTypeLobServiceStatus(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGLineOfBusinessTypeLobServiceStatus_QNAME, String.class, LocationLegacyDetailsCSGLineOfBusinessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "installedOutlets", scope = LocationLegacyDetailsCSGLineOfBusinessType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGLineOfBusinessTypeInstalledOutlets(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGLineOfBusinessTypeInstalledOutlets_QNAME, String.class, LocationLegacyDetailsCSGLineOfBusinessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "headend", scope = LocationLegacyDetailsCSGLineOfBusinessType.class)
    public JAXBElement<String> createLocationLegacyDetailsCSGLineOfBusinessTypeHeadend(String value) {
        return new JAXBElement<String>(_LocationLegacyDetailsCSGLineOfBusinessTypeHeadend_QNAME, String.class, LocationLegacyDetailsCSGLineOfBusinessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "disableLOBServiceability", scope = LocationLegacyDetailsCSGLineOfBusinessType.class)
    public JAXBElement<Boolean> createLocationLegacyDetailsCSGLineOfBusinessTypeDisableLOBServiceability(Boolean value) {
        return new JAXBElement<Boolean>(_LocationLegacyDetailsCSGLineOfBusinessTypeDisableLOBServiceability_QNAME, Boolean.class, LocationLegacyDetailsCSGLineOfBusinessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOBTypesType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "lobType", scope = LocationLegacyDetailsCSGLineOfBusinessType.class)
    public JAXBElement<LOBTypesType> createLocationLegacyDetailsCSGLineOfBusinessTypeLobType(LOBTypesType value) {
        return new JAXBElement<LOBTypesType>(_LocationLegacyDetailsCSGLineOfBusinessTypeLobType_QNAME, LOBTypesType.class, LocationLegacyDetailsCSGLineOfBusinessType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardizeAddressResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "standardizeAddressReturn", scope = StandardizeAddressResponse.class)
    public JAXBElement<StandardizeAddressResponseType> createStandardizeAddressResponseStandardizeAddressReturn(StandardizeAddressResponseType value) {
        return new JAXBElement<StandardizeAddressResponseType>(_StandardizeAddressResponseStandardizeAddressReturn_QNAME, StandardizeAddressResponseType.class, StandardizeAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardizeAddressResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "standardizeAddressByRuleReturn", scope = StandardizeAddressByRuleResponse.class)
    public JAXBElement<StandardizeAddressResponseType> createStandardizeAddressByRuleResponseStandardizeAddressByRuleReturn(StandardizeAddressResponseType value) {
        return new JAXBElement<StandardizeAddressResponseType>(_StandardizeAddressByRuleResponseStandardizeAddressByRuleReturn_QNAME, StandardizeAddressResponseType.class, StandardizeAddressByRuleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "StructureType", scope = AddressInfoType.class)
    public JAXBElement<String> createAddressInfoTypeStructureType(String value) {
        return new JAXBElement<String>(_LocationDetailsTypeStructureType_QNAME, String.class, AddressInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "StructureUse", scope = AddressInfoType.class)
    public JAXBElement<String> createAddressInfoTypeStructureUse(String value) {
        return new JAXBElement<String>(_LocationDetailsTypeStructureUse_QNAME, String.class, AddressInfoType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryNodeRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "QueryNode", scope = QueryNode.class)
    public JAXBElement<QueryNodeRequestType> createQueryNodeQueryNode(QueryNodeRequestType value) {
        return new JAXBElement<QueryNodeRequestType>(_QueryNodeQueryNode_QNAME, QueryNodeRequestType.class, QueryNode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMarketHierarchyResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "queryMarketHierarchyReturn", scope = QueryMarketHierarchyResponse.class)
    public JAXBElement<QueryMarketHierarchyResponseType> createQueryMarketHierarchyResponseQueryMarketHierarchyReturn(QueryMarketHierarchyResponseType value) {
        return new JAXBElement<QueryMarketHierarchyResponseType>(_QueryMarketHierarchyResponseQueryMarketHierarchyReturn_QNAME, QueryMarketHierarchyResponseType.class, QueryMarketHierarchyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMsagDataRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "AddMsagData", scope = AddMsagData.class)
    public JAXBElement<AddMsagDataRequestType> createAddMsagDataAddMsagData(AddMsagDataRequestType value) {
        return new JAXBElement<AddMsagDataRequestType>(_AddMsagDataAddMsagData_QNAME, AddMsagDataRequestType.class, AddMsagData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifySingleViewAddressAssociationType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "ModifySingleViewAddressAssociation", scope = ModifySingleViewAddressAssociation.class)
    public JAXBElement<ModifySingleViewAddressAssociationType> createModifySingleViewAddressAssociationModifySingleViewAddressAssociation(ModifySingleViewAddressAssociationType value) {
        return new JAXBElement<ModifySingleViewAddressAssociationType>(_ModifySingleViewAddressAssociationModifySingleViewAddressAssociation_QNAME, ModifySingleViewAddressAssociationType.class, ModifySingleViewAddressAssociation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "fiberNodeName", scope = LocationNetworkConnectivityType.class)
    public JAXBElement<String> createLocationNetworkConnectivityTypeFiberNodeName(String value) {
        return new JAXBElement<String>(_GetLocationInformationResponseTypeFiberNodeName_QNAME, String.class, LocationNetworkConnectivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "headendID", scope = LocationNetworkConnectivityType.class)
    public JAXBElement<String> createLocationNetworkConnectivityTypeHeadendID(String value) {
        return new JAXBElement<String>(_LocationNetworkConnectivityTypeHeadendID_QNAME, String.class, LocationNetworkConnectivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "headendNetworkAddress", scope = LocationNetworkConnectivityType.class)
    public JAXBElement<String> createLocationNetworkConnectivityTypeHeadendNetworkAddress(String value) {
        return new JAXBElement<String>(_LocationNetworkConnectivityTypeHeadendNetworkAddress_QNAME, String.class, LocationNetworkConnectivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DropLocationType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "dropLocation", scope = LocationNetworkConnectivityType.class)
    public JAXBElement<DropLocationType> createLocationNetworkConnectivityTypeDropLocation(DropLocationType value) {
        return new JAXBElement<DropLocationType>(_LocationNetworkConnectivityTypeDropLocation_QNAME, DropLocationType.class, LocationNetworkConnectivityType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteE911AddressRequestType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/services", name = "DeleteE911Address", scope = DeleteE911Address.class)
    public JAXBElement<DeleteE911AddressRequestType> createDeleteE911AddressDeleteE911Address(DeleteE911AddressRequestType value) {
        return new JAXBElement<DeleteE911AddressRequestType>(_DeleteE911AddressDeleteE911Address_QNAME, DeleteE911AddressRequestType.class, DeleteE911Address.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "zip4", scope = ZipCodeType.class)
    public JAXBElement<String> createZipCodeTypeZip4(String value) {
        return new JAXBElement<String>(_ZipCodeTypeZip4_QNAME, String.class, ZipCodeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CSGBillerInformationType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "CSGLocationInformation", scope = BillerInformationType.class)
    public JAXBElement<CSGBillerInformationType> createBillerInformationTypeCSGLocationInformation(CSGBillerInformationType value) {
        return new JAXBElement<CSGBillerInformationType>(_BillerInformationTypeCSGLocationInformation_QNAME, CSGBillerInformationType.class, BillerInformationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DDPBillerInformationType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xml.blackbean.com/location/types", name = "DDPLocationInformation", scope = BillerInformationType.class)
    public JAXBElement<DDPBillerInformationType> createBillerInformationTypeDDPLocationInformation(DDPBillerInformationType value) {
        return new JAXBElement<DDPBillerInformationType>(_BillerInformationTypeDDPLocationInformation_QNAME, DDPBillerInformationType.class, BillerInformationType.class, value);
    }

}
