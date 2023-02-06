package Enums;

public enum AreaUnits {
    SQ_FT(1),
    SQ_M(2),
    ACRE(3),
    HECTARES(4);

    private final int selected;

    AreaUnits(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
