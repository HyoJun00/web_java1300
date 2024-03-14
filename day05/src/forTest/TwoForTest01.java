package forTest;

public class TwoForTest01 {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n", j, i, j*i);
			}
		}
	}
}
