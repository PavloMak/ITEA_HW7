package ua.itea;

public class Worker extends Thread {

	private Mine plaseOfWork;
	private String name;
	private int beg;

	public Worker(String name, Mine mine) {
		super();
		this.name = name;
		plaseOfWork = mine;
		start();
	}

	void printBeg() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(": ");
		sb.append(beg);
		System.out.println(sb);

	}

	@Override
	public void run() {
		while (plaseOfWork.getGold() > 0) {
			beg += plaseOfWork.extractGold();
			printBeg();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
