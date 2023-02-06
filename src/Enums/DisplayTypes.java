package Enums;

public enum DisplayTypes {
    ONE_LARGE_TWO_SMALL(1),
    ONE_LARGE_IMAGE(2);

    private final int selected;

    DisplayTypes(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
