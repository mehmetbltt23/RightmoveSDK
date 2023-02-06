package Enums;

public enum Parkings {
    ALLOCATED(13),
    COMMUNAL(14),
    COVERED(15),
    GARAGE(16),
    DRIVEWAY(17),
    GATED(18),
    OFF_STREET(19),
    ON_STREET(20),
    REAR(21),
    PERMIT(22),
    PRIVATE_PARKING(23),
    RESIDENTS(24);

    private final int selected;

    Parkings(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
