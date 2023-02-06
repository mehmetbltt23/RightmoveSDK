package Enums;

public enum EntranceFloors {
    BASEMENT(1),
    GROUND_FLOOR(2),
    FIRST_FLOOR(3),
    SECOND_FLOOR(4),
    HIGHER_THAN_2ND_FLOOR_NO_LIFT(5),
    HIGHER_THAN_2ND_FLOOR_WITH_LIFT(6);

    private final int selected;

    EntranceFloors(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
