package Enums;

public enum RemovalReasons {
    SOLD_BY_US(7),
	SOLD_BY_ANOTHER_AGENT(8),
	WITHDRAWN_FROM_MARKET(9),
	LOST_INSTRUCTION(10),
	REMOVED(11),
	LET_BY_US(12);

	private final int selected;

	RemovalReasons(int value) {selected = value;}

	public int get() {return selected;}
}
