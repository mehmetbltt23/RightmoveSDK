package Enums;

public enum LetTypes {
    LONG_TERM(1),
	SHORT_TERM(2),
	COMMERCIAL(4),
	NOT_SPECIFIED(0);

	private final int selected;

	LetTypes(int value) {
		selected = value;
	}

	public int get() {
		return selected;
	}
}
