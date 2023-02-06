package Enums;

public enum Accessibilites {
    NOT_SUITABLE_FOR_WHEEL_CHAIR_USERS(42),
    LEVEL_ACCESS(37),
    LIFT_ACCESS(38),
    RAMPED_ACCESS(39),
    WET_ROOM(40),
    WIDE_DOOR_WAYS(41);

    private final int selected;

    Accessibilites(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
