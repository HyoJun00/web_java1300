package input;

import java.util.Scanner;

public class InputTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());
		// Enter를 소모하지않는다
		
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		// Enter를 소모한다
		
	}
}
