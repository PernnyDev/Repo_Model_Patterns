package ilp037.behavioural.command;

public class Consumer {

	public static void main(String[] args) {
		Thread t = new Thread(new InvokerWorker());
		t.start();
		
	}

}
