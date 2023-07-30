package threads;

class cl extends Thread {
	public void run() { // here we have to use method name as RUN
		// for exicution of start method we have to made run method in thread
		int i;

		for (i = 0; i < 5; i++) {
			System.out.println("Hi");
			try { 
				Thread.sleep(500);
			} catch (Exception e) {
			} // here sleep is stop run procces for 0.5 sec
		}
	}
}

class cll extends Thread {
	public void run() {
		int i;

		for (i = 0; i < 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
public class Extend_Thread {

	public static void main(String[] args) {
		cl h = new cl();
		cll h1 = new cll();

		h.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		} // here we are put some time duration because we have to put some time between
			// this two statment]
		h1.start();
	}
}



