package Enums;

public enum TenureTypes {
    FREE_HOLD(1),
    LEASE_HOLD(2),
    FEUDAL(3),
    COMMON_HOLD(4),
    SHARE_OF_FREEHOLD(5);

    private final int selected;

    TenureTypes(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
