package oper;

import java.util.Scanner;

public class OperTask01 {
	public static void main(String[] args) {
		// 정수 2개를 입력받아서 큰 수 출력
		
		// 로직구성
		// 1. 입력 클래스 import
		// 2. 정수1 입력 : 출력
		// 3. num1이라는 변수에 nextInt() 메소드 초기화
		// 4. 정수2 입력 : 출력
		// 5. num2이라는 변수에 nextInt() 메소드 초기화
		// 6. 삼항연산자를 사용해 num1 <= num2 ? num2 : num1 출력
		
		// 내 코드
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.println(num1 <= num2 ? num2 : num1);
		
		// 강사님 코드
		int num3 = 0, num4 = 0;
		String result = "", msg = "정수 입력 : ";
		
		System.out.println(msg);
	      num1 = sc.nextInt();
	      System.out.println(msg);
	      num2 = sc.nextInt();
//	      result = num1 > num2 ? "큰 수:" + num1 : "큰 수 : " + num2;
	      System.out.println(result = num1 > num2 ? "큰 수:" + num1 : num1 == num2?
	            "같습니다" : "큰 수 : " + num2);
	      
//	      System.out.println(result);

		
	}
}
