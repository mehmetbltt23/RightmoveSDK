package Enums;

public enum Heatings {
    AIR_CONDITIONING(1),
    CENTRAL(2),
    DOUBLE_GLAZING(3),
    ECO_FRIENDLY(4),
    ELECTRIC(5),
    GAS(6),
    GAS_CENTRAL(7),
    NIGHT_STORAGE(8),
    OIL(9),
    SOLAR(10),
    SOLAR_WATER(11),
    UNDER_FLOOR(12);

    private final int selected;

    Heatings(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
