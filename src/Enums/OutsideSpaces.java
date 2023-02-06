package Enums;

public enum OutsideSpaces {
    BACK_GARDEN(29),
    COMMUNAL_GARDEN(30),
    ENCLOSED_GARDEN(31),
    FRONT_GARDEN(32),
    PRIVATE_GARDEN(33),
    REAR_GARDEN(34),
    TERRACE(35),
    PATIO(36);

    private final int selected;

    OutsideSpaces(int value) {selected = value;}

    public int get() {return selected;}
}
