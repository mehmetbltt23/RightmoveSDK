package Enums;

public enum Channels {
    SALES(1), LETTINGS(2);

    private final int selected;

    Channels(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
