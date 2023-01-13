package myThreadTask;

public class ThreadTask {
	public static void main(String[] args) {
		
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(500);} catch (InterruptedException e) {;}
			}
		};
		
		
		Thread t1 = new Thread(target, "�߿�");
		Thread t2 = new Thread(target, "�ܲ�");
		Thread t3 = new Thread(target, "�۸�");
		
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
	}
}
