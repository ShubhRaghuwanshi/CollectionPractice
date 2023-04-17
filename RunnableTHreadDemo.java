package PracticePrograms;

public class RunnableTHreadDemo implements Runnable {

	public static void main(String[] args) {
		RunnableTHreadDemo RTD=new RunnableTHreadDemo();
		Thread TD=new Thread(RTD);
		TD.start();
		
		System.out.println();
		
		RunnableTHreadDemo RTD1=new RunnableTHreadDemo(); // taken extra thread
		Thread TD1=new Thread(RTD1);
		TD1.start();
		System.out.println();
	}

	public void run() {
		System.out.println("I am inside runnable method via runnable interface");
	}
}
