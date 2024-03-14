package whileTest;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		boolean isTrue =  false;
		
//		while(isTrue) {
//			System.out.println("출력");
//		}
//		
//		do {
//			System.out.println("양효준");
//		} while(isTrue);
		
		// 사용자로부터 숫자를 입력받아서 해당 숫자가 양수인지 검사
		// 입력된 숫자가 양수가 아니면 사용자에게 다시 입력하라는 메시지를 출력
		// 입력된 숫자가 양수일 경우만 양수입니다 출력
		
		// 로직구성
		// 입력 클래스 import
		// 정수형타입 변수 선언
		// 양수를 입력하세요 출력
		// 정수형 타입 변수에 입력 메소드 사용 nextInt()
		// do while문을 사용하여 양수를 입력받으면 "양수입니다" 출력
		// 양수가 아닐경우 "다시 입력하세요" 출력
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		do {
			System.out.print("양수를 입력하세요 : ");
			num1 = sc.nextInt();
			if(num1 < 0) {
				System.out.println("양수가 아닙니다 다시 입력하세요 : ");
				num1 = sc.nextInt();
			}
		} while(num1 <= 0);
		System.out.println(num1 + "는 양수입니다");
	}
}
