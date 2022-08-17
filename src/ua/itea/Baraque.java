package ua.itea;

public class Baraque extends Thread {

	private Mine plaseOfWork;

	public Baraque(Mine mine) {
		super();
		plaseOfWork = mine;
		start();
	}

	@Override
	public void run() {
		int i = 4;
		while (plaseOfWork.getGold() > 0) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			new Worker("Worker " + i, plaseOfWork);
			i++;		
		}
	}
}
