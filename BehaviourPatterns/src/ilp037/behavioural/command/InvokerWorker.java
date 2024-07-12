package ilp037.behavioural.command;

public class InvokerWorker implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.printf("[%s] Checking queue for new commands\n", Thread.currentThread().getName());
			int size = InvokerQueue.size();
			if (size > 0) {
				InvokerQueue.poll().execute();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
}
