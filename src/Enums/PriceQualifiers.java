package Enums;

public enum PriceQualifiers {
    DEFAULTS(0),
    POA(1),
    GUIDE_PRICE(2),
    FIXED_PRICE(3),
    OFFERS_IN_EXCESS_OF(4),
    OIRO(5),
    SALE_BY_TENDER(6),
    FROM(7),
    SHARED_OWNERSHIP(9),
    OFFERS_OVER(10),
    PART_BUY_RENT(11),
    SHARED_EQUITY(12),
    COMING_SOON(16);

    private final int selected;

    PriceQualifiers(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
