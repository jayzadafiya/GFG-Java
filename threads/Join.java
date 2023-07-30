package threads;

public class Join {

 public static void main(String[] args) throws InterruptedException {

		Runnable h = new hii(); // here we can use runnable because thread hi is now in runnable class
		Runnable h1 = new he(); // here we made runnable object using thread class


		Thread t1 = new Thread(h); // here in new thread we have to give aa runnable object
		Thread t2 = new Thread(h1);
		

		t1.start(); // while working with threads always call start and it is automatically cal run
					// method
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}

		t2.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}

		
		t1.join();   //here thread is terminated
		t2.join();
		
		System.out.println(t1.isAlive());
		//this statement execute only after join all thread as given above 
		System.out.println("bye");
	}
}

class hii implements Runnable {
	public void run() {
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

class he implements Runnable {
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



