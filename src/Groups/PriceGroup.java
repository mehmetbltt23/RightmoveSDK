package Groups;

import Enums.PriceQualifiers;
import Enums.RentFrequencies;
import Enums.TenureTypes;

public class PriceGroup {
    private int tenureUnexpiredYears;
    private double price;
    private double deposit;
    private double pricePerUnitArea;
    private double pricePerUnitPerAnnum;
    private boolean auction;
    private String administrationFee;
    private PriceQualifiers priceQualifier;
    private RentFrequencies rentRrequency;
    private TenureTypes tenureType;

    public void setTenureUnexpiredYears(int tenureUnexpiredYears) {
        this.tenureUnexpiredYears = tenureUnexpiredYears;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setPricePerUnitArea(double pricePerUnitArea) {
        this.pricePerUnitArea = pricePerUnitArea;
    }

    public void setPricePerUnitPerAnnum(double pricePerUnitPerAnnum) {
        this.pricePerUnitPerAnnum = pricePerUnitPerAnnum;
    }

    public void setAuction(boolean auction) {
        this.auction = auction;
    }

    public void setAdministrationFee(String administrationFee) {
        this.administrationFee = administrationFee;
    }

    public void setPriceQualifier(PriceQualifiers priceQualifier) {
        this.priceQualifier = priceQualifier;
    }

    public void setRentRrequency(RentFrequencies rentRrequency) {
        this.rentRrequency = rentRrequency;
    }

    public void setTenureType(TenureTypes tenureType) {
        this.tenureType = tenureType;
    }
}
