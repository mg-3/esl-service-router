package com.blackbean.cable.esl.router.mapper;

import com.blackbean.cable.esl.router.model.jaxb14_08.*;
import com.blackbean.cable.esl.router.model.rest.location.detail.*;
import com.google.common.collect.Lists;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MappingContext;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;
import java.util.function.Function;

/**
 * @author Mike Garcia
 *         Date: 12/3/2015
 *         esl-service-router
 */
@Component
public class GetLocationXfinityToDetailMapper<
        A extends GetLocationXfinityResponseType,
        B extends LocationDetailResponse>
        extends CustomMapper<A, B> {

    @Override
    public void mapAtoB(A src, B dest, MappingContext context) {
        super.mapAtoB(src, dest, context);

        Location location = new Location();
        AltAddress altAddress = new AltAddress();
        location.setAltAddress(altAddress);
        List<String> capabilities = Lists.newArrayList();
        location.setCapabilities(capabilities);

        Location_ geoCoords = new Location_();
        location.setLocation(geoCoords);

        AddressInfoType addressInfo = src.getAddressInfo();
        BillingDetailsInfoType billingDetailsType = src.getBillingDetailsInfo();
        MarketReferenceType marketInfoType = src.getMarketInfo();
        location.setBillerInfo(mapBillingAndMarket(billingDetailsType, marketInfoType));
        LocationCapabilitiesInfoType locationCapabilitiesType = src.getCapabilityInfo();

        GeographyInfoType geogInfoType = src.getGeographyInfo();
        if (!geogInfoType.getLatitude().isNil()) {
            double lat = geogInfoType.getLatitude().getValue().doubleValue();
            geoCoords.setLatitude(lat);
        }
        if (!geogInfoType.getLongitude().isNil()) {
            double lon = geogInfoType.getLongitude().getValue().doubleValue();
            geoCoords.setLongitude(lon);
        }
        String status = addressInfo.getLocationStatus().value();
        location.setLocationStatus(status);
        String fraud = addressInfo.getFraudIndicator();
        location.setFraudInd(fraud);
        if (!addressInfo.getStructureType().isNil()) {
            String structuretype = addressInfo.getStructureType().getValue();

        }
        TimeZoneType tztype = addressInfo.getTimezone();

        if (tztype != null) {
            location.setTimeZone(new TimeZone()
                            .withName(tztype.getName())
                            .withDst(tztype.getDST())
                            .withUtcOffset(String.valueOf(tztype.getUTCOffset()))
            );
        }

        PostalAddressType postalAddress = addressInfo.getPostalAddress();

        String city = postalAddress.getCity();
        if (!postalAddress.getCountry().isNil()) {
            String country = postalAddress.getCountry().getValue().value();
            location.setCountry(country);
        }
        location.setCity(city);
        String state = postalAddress.getState();
        location.setState(state);
        String streetName = postalAddress.getStreetName();
        location.setStreetName(streetName);
        ZipCodeType zipCodeType = postalAddress.getZipCode();
        String zip5 = zipCodeType.getZip5();
        location.setZip5(zip5);
        if (!zipCodeType.getZip4().isNil()) {
            String zip4 = zipCodeType.getZip4().getValue();
            location.setZip4(zip4);
        }

        if (!postalAddress.getHouseNumber().isNil()) {
            String houseNum = postalAddress.getHouseNumber().getValue();
            location.setHouseNumber(houseNum);
        }
        if (!postalAddress.getHouseNumberPrefix().isNil()) {
            String houseNumPrefix = postalAddress.getHouseNumberPrefix().getValue();
            location.setHouseNumPrefix(houseNumPrefix);
        }
        if (!postalAddress.getHouseNumberSuffix().isNil()) {
            String houseNumSuffix = postalAddress.getHouseNumberSuffix().getValue();
            location.setHouseNumSuffix(houseNumSuffix);
        }
        if (!postalAddress.getStreetPostDirection().isNil()) {
            String streetPostDirection = postalAddress.getStreetPostDirection().getValue();
            location.setStreetPostdir(streetPostDirection);
        }
        if (!postalAddress.getStreetPreDirection().isNil()) {
            String streetPreDirection = postalAddress.getStreetPreDirection().getValue();
            location.setStreetPredir(streetPreDirection);
        }
        if (!postalAddress.getStreetSuffix().isNil()) {
            String streetSuffix = postalAddress.getStreetSuffix().getValue();
            location.setStreetSuffix(streetSuffix);
        }
        if (!postalAddress.getUnitTypes().isNil()) {
            ArrayOfUnitTypesType unitTypes = postalAddress.getUnitTypes().getValue();
            if (unitTypes != null) {
                List<UnitTypesType> units = unitTypes.getUnitTypesType();
                units.forEach(ut -> {
                    if (!ut.getUnitType().isNil()) {
                        String unitType = ut.getUnitType().getValue();
                        location.setUnitType1(unitType);
                    }
                    if (!ut.getUnitValue().isNil()) {
                        String unitVal = ut.getUnitValue().getValue();
                        location.setUnitValue1(unitVal);
                    }
                });
            }
        }

        /*
         * Handle alternate address here
         */
        ArrayOfAlternatePostalAddressType arrayOfAlternatePostalAddressType = addressInfo.getAlternateAddress();
        if (arrayOfAlternatePostalAddressType != null) {
            List<AlternatePostalAddressType> alternatePostalAddresses = arrayOfAlternatePostalAddressType.getAlternatePostalAddressType();

            if (alternatePostalAddresses != null && alternatePostalAddresses.size() > 0) {
                /*
                 * Per Jiju Dec. 9, 2015 - one to one mapping for alternate address
                 */

                PostalAddressType altPostalAddressType = alternatePostalAddresses.get(0).getPostalAddress();
                String altCity = altPostalAddressType.getCity();
                altAddress.setCity(altCity);
                String altState = altPostalAddressType.getState();
                altAddress.setState(altState);
                String altStreetName = altPostalAddressType.getStreetName();
                altAddress.setStreetName(altStreetName);
                ZipCodeType altZipCodeType = altPostalAddressType.getZipCode();
                String altZip5 = altZipCodeType.getZip5();
                altAddress.setZip5(altZip5);
                if (!zipCodeType.getZip4().isNil()) {
                    String altZip4 = zipCodeType.getZip4().getValue();
                    altAddress.setZip4(altZip4);
                }

                if (!altPostalAddressType.getHouseNumber().isNil()) {
                    String altHouseNum = altPostalAddressType.getHouseNumber().getValue();
                    altAddress.setHouseNumber(altHouseNum);
                }
                if (!altPostalAddressType.getHouseNumberPrefix().isNil()) {
                    String altHouseNumPrefix = altPostalAddressType.getHouseNumberPrefix().getValue();
                    altAddress.setHouseNumPrefix(altHouseNumPrefix);
                }
                if (!altPostalAddressType.getHouseNumberSuffix().isNil()) {
                    String altHouseNumSuffix = altPostalAddressType.getHouseNumberSuffix().getValue();
                    altAddress.setHouseNumSuffix(altHouseNumSuffix);
                }
                if (!altPostalAddressType.getStreetPostDirection().isNil()) {
                    String altStreetPostDirection = altPostalAddressType.getStreetPostDirection().getValue();
                    altAddress.setStreetPostdir(altStreetPostDirection);
                }
                if (!altPostalAddressType.getStreetPreDirection().isNil()) {
                    String altStreetPreDirection = altPostalAddressType.getStreetPreDirection().getValue();
                    altAddress.setStreetPredir(altStreetPreDirection);
                }
                if (!altPostalAddressType.getStreetSuffix().isNil()) {
                    String altStreetSuffix = altPostalAddressType.getStreetSuffix().getValue();
                    altAddress.setStreetSuffix(altStreetSuffix);
                }
                if (!altPostalAddressType.getUnitTypes().isNil()) {
                    ArrayOfUnitTypesType unitTypes = altPostalAddressType.getUnitTypes().getValue();
                    if (unitTypes != null) {
                        List<UnitTypesType> units = unitTypes.getUnitTypesType();
                        units.forEach(ut -> {
                            if (!ut.getUnitType().isNil()) {
                                String unitType = ut.getUnitType().getValue();
                                altAddress.setUnitType1(unitType);
                            }
                            if (!ut.getUnitValue().isNil()) {
                                String unitVal = ut.getUnitValue().getValue();
                                altAddress.setUnitValue1(unitVal);
                            }
                        });
                    }
                }

            }
        }
        dest.setLocation(location);
    }

    private BillerInfo mapBillingAndMarket(BillingDetailsInfoType billingDetailsType, MarketReferenceType marketInfoType) {

        final String unk = "HAVE TO FIND";
        BillerInfo bi = new BillerInfo();
        List<CsgLegacyDetail> csgBillerList = Lists.newArrayList();
        bi.setCsgLegacyDetails(csgBillerList);

        String glcode = marketInfoType.getGlCode();
        String mkttype = marketInfoType.getLegacyMarketType();
        String mktsource = "";
        String agent = "";
        String system = "";
        String principle = "";
        long mktid = marketInfoType.getMarketID();

        if (!marketInfoType.getLegacyMarketID().isNil()) {
            LegacyMarketIDType lmiObj = marketInfoType.getLegacyMarketID()
                    .getValue();
            mktsource = lmiObj.getLegacyMarketIDSource().value();
            bi.setBillerType(mktsource);


            if (!lmiObj.getCSGMarketID().isNil()) {
                CSGLegacyMarketType csgmktObj = lmiObj.getCSGMarketID().getValue();
                agent = csgmktObj.getAgent();
                system = csgmktObj.getCSGSystem();
                principle = csgmktObj.getPrinciple();
            }
        }
        ArrayOfCSGDetailsType arrayOfCsgDetails = billingDetailsType.getCsgDetails();

        if (arrayOfCsgDetails != null) {
            List<CSGDetailsType> csgDetails = arrayOfCsgDetails.getCSGDetailsType();

            if (csgDetails.size() > 0) {
                CSGDetailsType csgDetailType = csgDetails.get(0);
                CsgLegacyDetail cld = new CsgLegacyDetail();
                cld.setHouseKey(csgDetailType.getHouseKey());
                cld.setLocationType(gleen(csgDetailType.getLocationType()));
                cld.setSystem(system);
                cld.setAgent(agent);
                cld.setPrinciple(principle);
                cld.setDwellCodeDesc(gleen(csgDetailType.getDwellingCodeDescr()));
                cld.setHub(gleen(csgDetailType.getHub()));
                cld.setRightOfEntryPermission(gleen(csgDetailType.getRightOfEntryPermission()));
                cld.setTechnicianArea(gleen(csgDetailType.getTechnicianArea()));
                cld.setLocationStatus(gleen(csgDetailType.getLocationStatus()));
                cld.setMapCode(gleen(csgDetailType.getMapCode()));
                cld.setSuppressCSGAddrStandardization(csgDetailType.isSuppressCSGAddrStandardization() ? "Y" : "N");

                if (!csgDetailType.getLineTag().isNil()) {
                    LocationLegacyDetailsCSGLineTagsType lineTagsType = csgDetailType.getLineTag().getValue();
                    ArrayOfLocationLegacyDetailsCSGLineTagType arrayOfLineTags = lineTagsType.getLineTag();
                    if (arrayOfLineTags != null) {
                        List<LineTag> lineTags = Lists.newArrayList();
                        List<LocationLegacyDetailsCSGLineTagType> csgLineTagTypes = arrayOfLineTags.getLocationLegacyDetailsCSGLineTagType();
                        csgLineTagTypes.forEach(lineTagType -> {
                            LineTag lt = new LineTag();
                            lt.setIndex(lineTagType.getIndex());
                            lt.setValue(lineTagType.getValue());
                            lineTags.add(lt);
                        });
                        cld.setLineTags(lineTags);
                    }
                }
                cld.setCell(gleen(csgDetailType.getCell()));
                cld.setLastCallDate(hasDate.apply(csgDetailType.getLastCallDate()));
                cld.setHouseMisc(gleen(csgDetailType.getHouseMisc()));

                if (!csgDetailType.getHouseComments().isNil()) {
                    LocationLegacyDetailsCSGHouseCommentsType locationHouseCommentsType = csgDetailType.getHouseComments().getValue();
                    ArrayOfLocationLegacyDetailsCSGHouseCommentType arrayOfHouseComments = locationHouseCommentsType.getHouseComment();
                    if (arrayOfHouseComments != null) {
                        List<HouseComment> houseComments = Lists.newArrayList();
                        List<LocationLegacyDetailsCSGHouseCommentType> houseCommentTypes = arrayOfHouseComments.getLocationLegacyDetailsCSGHouseCommentType();
                        houseCommentTypes.forEach(houseCommentType -> {
                            HouseComment hc = new HouseComment();
                            hc.setIndex(houseCommentType.getIndex());
                            hc.setValue(houseCommentType.getValue());
                            houseComments.add(hc);
                        });
                        arrayOfHouseComments.getLocationLegacyDetailsCSGHouseCommentType();
                        cld.setHouseComments(houseComments);
                    }
                }
                cld.setCustomerType(csgDetailType.getCustomerType().getValue());
                cld.setDropLength(gleen(csgDetailType.getDropLength()));
                cld.setAmplifier(gleen(csgDetailType.getAmplifier()));
                cld.setUnincorporatedFlag(gleen(csgDetailType.getUnincorporatedFlag()));
                cld.setDemographicCode(gleen(csgDetailType.getDemographicCode()));
                cld.setLocationCountyID(gleen(csgDetailType.getLocationCountyID()));
                cld.setDropType(gleen(csgDetailType.getDropType()));

                if (!csgDetailType.getBridgerAddress().isNil()) {
                    BridgerAddress ba = new BridgerAddress();
                    LocationLegacyDetailsCSGBridgerType brAdd = csgDetailType.getBridgerAddress().getValue();
                    ba.setBridgerPrivate(brAdd.getBridgerPrivate().getValue());
                    ba.setBridgerBidirectional(brAdd.getBridgerBidirectional().getValue());
                    ba.setBridgerGateControl(brAdd.getBridgerGateControl().getValue());
                    cld.setBridgerAddress(ba);
                }
                cld.setDropSite(gleen(csgDetailType.getDropSite()));
                cld.setPowerSupply(gleen(csgDetailType.getPowerSupply()));
                cld.setTimezone(gleen(csgDetailType.getTimeZone()));
                cld.setLastCallStatus(gleen(csgDetailType.getLastCallStatus()));
                cld.setHookupType(gleen(csgDetailType.getHookupType()));
                cld.setGround(gleen(csgDetailType.getGround()));
                cld.setPedestal(gleen(csgDetailType.getPedestal()));
                cld.setServiceArea(gleen(csgDetailType.getServiceArea()));
                cld.setSalesArea(gleen(csgDetailType.getSalesArea()));
                cld.setPoleOwner(gleen(csgDetailType.getPoleOwner()));
                cld.setPoleNumber(gleen(csgDetailType.getPoleNumber()));

                List<Lob> lobs = Lists.newArrayList();
                ArrayOfLocationLegacyDetailsCSGLineOfBusinessType arrayOfCsgLobType = csgDetailType.getLineOfBusiness();
                List<LocationLegacyDetailsCSGLineOfBusinessType> csgLobTypes = arrayOfCsgLobType.getLocationLegacyDetailsCSGLineOfBusinessType();
                csgLobTypes.forEach(lobType -> {
                    Lob lob = new Lob();
                    if (!lobType.getLobType().isNil()) {
                        String lt = lobType.getLobType().getValue().value();
                        lob.setLobType(lt);
                        if (!lobType.getHeadend().isNil()) {
                            lobType.getHeadend().getValue();
                        }

                        lob.setHeadend(gleen(lobType.getHeadend()));
                        lob.setServiceStatus(gleen(lobType.getLobServiceStatus()));
                        lob.setTapStatus(gleen(lobType.getTapStatus()));
                        lob.setDisableServiceStatus(gleen(lobType.getDisableLOBServiceability()));
                        lobs.add(lob);
                    }
                });
                cld.setLobs(lobs);
                csgBillerList.add(cld);
            }
        }
        /* TODO complete ddp mappings */
        ArrayOfDDPDetailsType ddpDetailsType = billingDetailsType.getDdpDetails();
        return bi;
    }

    /**
     * Generic method to pull value from ANY-typed JAXBElement
     *
     * @param jaxbElement
     * @param <T>
     * @return
     */
    private <T> T gleen(JAXBElement<T> jaxbElement) {
        Function<JAXBElement<T>, T> f = je -> {
            if (!je.isNil()) {
                return je.getValue();
            } else {
                return null;
            }
        };
        return f.apply(jaxbElement);
    }


    private Function<JAXBElement<XMLGregorianCalendar>, String> hasDate = jaxbElement -> {
        if (!jaxbElement.isNil()) {
            return jaxbElement.getValue().toString();
        } else {
            return null;
        }
    };

}
