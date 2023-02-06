package Enums;

public enum Conditions {
    GOOD(1),
    SOME_WORK_NEEDED(2),
    WORK_REQUIRED_THROUGHOUT(3),
    MAJOR_RENOVATION_REQUIRED(4);

    private final int selected;

    Conditions(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
