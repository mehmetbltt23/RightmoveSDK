package Enums;

public enum CommercialUseClasses {
    A1(1),
    A2(4),
    A3(7),
    A4(10),
    A5(13),
    B1(16),
    B2(19),
    B8(22),
    C1(25),
    C2(28),
    C2A(31),
    C3(34),
    D1(37),
    D2(40),
    SUI_GENERIS_1(43),
    SUI_GENERIS_2(46);

    private final int selected;

    CommercialUseClasses(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
