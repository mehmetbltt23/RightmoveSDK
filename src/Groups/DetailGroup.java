package Groups;

import Enums.*;

import java.util.ArrayList;

public class DetailGroup {
    private int bedrooms;
    private int bathrooms;
    private int receptionRooms;
    private int yearBuilt;
    private int minimum;
    private int maximum;
    private int floors;
    private float internalArea;
    private float landArea;
    private boolean petsAllowed;
    private boolean smokersConsidered;
    private boolean housingBenefitConsidered;
    private boolean sharersConsidered;
    private boolean burglarAlarm;
    private boolean washingMachine;
    private boolean dishwasher;
    private boolean allBillsInc;
    private boolean waterBillInc;
    private boolean gasBillInc;
    private boolean electricityBillInc;
    private boolean oilBillInc;
    private boolean councilTaxInc;
    private boolean tvLicenceInc;
    private boolean satCableTvBillInc;
    private boolean internetBillInc;
    private boolean businessForSale;
    private String summary;
    private String description;
    private String[] features;
    private AreaUnits internalAreaUnit;
    private AreaUnits landAreaUnit;
    private AreaUnits areaUnit;
    private EntranceFloors entranceFloor;
    private Conditions condition;
    private Accessibilites accessibility;
    private Furnishings furnishedType;
    private ArrayList<Parkings> parking;
    private ArrayList<OutsideSpaces> outsideSpace;
    private ArrayList<Heatings> heating;
    private ArrayList<CommercialUseClasses> commUseClass;
    private ArrayList<RoomGroup> rooms;

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setReceptionRooms(int receptionRooms) {
        this.receptionRooms = receptionRooms;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setInternalArea(float internalArea) {
        this.internalArea = internalArea;
    }

    public void setLandArea(float landArea) {
        this.landArea = landArea;
    }

    public void setPetsAllowed(boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
    }

    public void setSmokersConsidered(boolean smokersConsidered) {
        this.smokersConsidered = smokersConsidered;
    }

    public void setHousingBenefitConsidered(boolean housingBenefitConsidered) {
        this.housingBenefitConsidered = housingBenefitConsidered;
    }

    public void setSharersConsidered(boolean sharersConsidered) {
        this.sharersConsidered = sharersConsidered;
    }

    public void setBurglarAlarm(boolean burglarAlarm) {
        this.burglarAlarm = burglarAlarm;
    }

    public void setWashingMachine(boolean washingMachine) {
        this.washingMachine = washingMachine;
    }

    public void setDishwasher(boolean dishwasher) {
        this.dishwasher = dishwasher;
    }

    public void setAllBillsInc(boolean allBillsInc) {
        this.allBillsInc = allBillsInc;
    }

    public void setWaterBillInc(boolean waterBillInc) {
        this.waterBillInc = waterBillInc;
    }

    public void setGasBillInc(boolean gasBillInc) {
        this.gasBillInc = gasBillInc;
    }

    public void setElectricityBillInc(boolean electricityBillInc) {
        this.electricityBillInc = electricityBillInc;
    }

    public void setOilBillInc(boolean oilBillInc) {
        this.oilBillInc = oilBillInc;
    }

    public void setCouncilTaxInc(boolean councilTaxInc) {
        this.councilTaxInc = councilTaxInc;
    }

    public void setTvLicenceInc(boolean tvLicenceInc) {
        this.tvLicenceInc = tvLicenceInc;
    }

    public void setSatCableTvBillInc(boolean satCableTvBillInc) {
        this.satCableTvBillInc = satCableTvBillInc;
    }

    public void setInternetBillInc(boolean internetBillInc) {
        this.internetBillInc = internetBillInc;
    }

    public void setBusinessForSale(boolean businessForSale) {
        this.businessForSale = businessForSale;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }

    public void setInternalAreaUnit(AreaUnits internalAreaUnit) {
        this.internalAreaUnit = internalAreaUnit;
    }

    public void setLandAreaUnit(AreaUnits landAreaUnit) {
        this.landAreaUnit = landAreaUnit;
    }

    public void setAreaUnit(AreaUnits areaUnit) {
        this.areaUnit = areaUnit;
    }

    public void setEntranceFloor(EntranceFloors entranceFloor) {
        this.entranceFloor = entranceFloor;
    }

    public void setCondition(Conditions condition) {
        this.condition = condition;
    }

    public void setAccessibility(Accessibilites accessibility) {
        this.accessibility = accessibility;
    }

    public void setFurnishedType(Furnishings furnishedType) {
        this.furnishedType = furnishedType;
    }

    public void setParking(ArrayList<Parkings> parking) {
        this.parking = parking;
    }

    public void setOutsideSpace(ArrayList<OutsideSpaces> outsideSpace) {
        this.outsideSpace = outsideSpace;
    }

    public void setHeating(ArrayList<Heatings> heating) {
        this.heating = heating;
    }

    public void setCommUseClass(ArrayList<CommercialUseClasses> commUseClass) {
        this.commUseClass = commUseClass;
    }

    public void setRooms(ArrayList<RoomGroup> rooms) {
        this.rooms = rooms;
    }
}
