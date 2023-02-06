package Enums;

public enum RentFrequencies {
    YEARLY(1),
	QUARTERLY(4),
	MONTHLY(12),
	WEEKLY(52),
	DAILY(365);

	private final int selected;

	RentFrequencies(int value) {selected = value;}

	public int get() {return selected;}
}
