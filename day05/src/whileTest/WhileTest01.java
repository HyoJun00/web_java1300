package whileTest;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		// 안녕하세요 000님 환영합니다 10번 출력
		// 로직구성
		// 정수형 타입 변수 기본값으로 초기화
		// while문 사용하여 정수형 변수가 10이 될때까지 반복문 실행
		// while문 조건이 참일때 "안녕하세요 " + name + "님 환영합니다" 출력
		
		Scanner sc = new Scanner(System.in);
		// 하나의 이름 10번 출력
//		int num1 = 0;
//		String name = "";
//		
//		System.out.print("이름을 입력하세요 : ");
//		name = sc.next();
//		
//		while(num1 < 10) {
//			num1++;
//			System.out.println("안녕하세요 " + name + "님 환영합니다");
//		}
		
		// 여러사람의 이름 10번 출력
		int num2 = 0;
		String name2 = "";
		
		while(num2 < 10) {
			System.out.print("이름을 입력하세요 : ");
			name2 = sc.next();
			System.out.println("안녕하세요 " + name2 + "님 환영합니다");
			num2++;
		}
		
	}
}
