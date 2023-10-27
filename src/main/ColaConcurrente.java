package main;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ColaConcurrente implements Runnable {

	private static Queue <Integer> cola = new ConcurrentLinkedDeque<Integer>();
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
		{
			new Thread(new ColaConcurrente()).start();
		}

	}

	@Override
	public void run() {
		cola.add(10);
		for(Integer i : cola)
		{
			System.out.println(i + ":");
		}

		System.out.println("Tamaño de la cola: " + cola.size());
	}

}
