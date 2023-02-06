package Enums;

public enum MediaTypes {
    IMAGE(1),
    FLOOR_PLAN(2),
    BROCHURE(3),
    VIRTUAL_TOUR(4),
    AUDIO_TOUR(5),
    EPC(6),
    EPC_GRAPH(7);

    private final int selected;

    MediaTypes(int value) {
        selected = value;
    }

    public int get() {
        return selected;
    }
}
