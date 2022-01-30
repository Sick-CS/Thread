
class Thread2 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread2 is running....");

	}

}

class Thread3 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread3 is running....");

	}
}

public class Thread1 {
	public static void main(String[] args) {

		Thread2 thread2 = new Thread2();
		thread2.start();

		Thread3 thread3 = new Thread3();
		Thread thread = new Thread(thread3);
		thread.start();

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());

	}
}
