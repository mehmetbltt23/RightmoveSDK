package Enums;

public enum Furnishings {
    FURNISHED(0),
    PART_FURNISHED(1),
    UNFURNISHED(2),
    FURNISHED_UNFURNISHED(4);

    private final int selected;

    Furnishings(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
