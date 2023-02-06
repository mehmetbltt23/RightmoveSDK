package Enums;

public enum FeaturedPropertyTypes {
    SUBSCRIPTION(1),
    FEATURED_PROPERTY_OF_THE_WEEK(2);

    private final int selected;

    FeaturedPropertyTypes(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
