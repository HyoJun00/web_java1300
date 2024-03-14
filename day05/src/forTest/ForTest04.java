package forTest;

import java.util.Scanner;

public class ForTest04 {
	public static void main(String[] args) {
		// 3단 구구단 3 x 1 = 3
		// ...
		// 3 x 9 = 27
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 : ");
		int j = sc.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", j, i, j*i);
		}
	}
}
