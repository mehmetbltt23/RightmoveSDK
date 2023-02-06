package Enums;

public enum Statuses {
    AVAILABLE(1),
	SSTC(2),
	SSTCM(3),
	UNDER_OFFER(4),
	RESERVED(5),
	LET_AGREED(6);

	private final int selected;

	Statuses(int value) {selected = value;}

	public int get() {return selected;}
}
