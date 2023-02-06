package Enums;

public enum DimensionUnits {
    METRES(5),
    CENTIMETRES(6),
    MILLIMETRES(7),
    FEET(8),
    INCHES(9);

    private final int selected;

    DimensionUnits(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
