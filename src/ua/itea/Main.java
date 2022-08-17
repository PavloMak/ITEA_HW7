package ua.itea;

public class Main {

	public static void main(String[] args) {
		Mine mine1 = new Mine();
		new Baraque(mine1);
		new Worker("Worker 1", mine1);
		new Worker("Worker 2", mine1);
		new Worker("Worker 3", mine1);

	}

}
