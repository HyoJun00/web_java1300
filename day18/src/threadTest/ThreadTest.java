package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		// MyThread의 객체 t1, t2 생성
		MyThread t1 = new MyThread("#");
		MyThread t2 = new MyThread("*");
		
//		t1.run();
//		t2.run();
		t1.start();
		t2.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
