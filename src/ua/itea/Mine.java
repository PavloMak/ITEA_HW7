package ua.itea;

public class Mine {
	private int gold = 1000;

	public synchronized int extractGold() {
		int goldToGet = 3;
		gold = gold - goldToGet;
		return (gold < 0) ? goldToGet + gold : goldToGet;
	}

	public int getGold() {
		return gold;
	}

}
