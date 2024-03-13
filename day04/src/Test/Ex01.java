package Test;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 사용자로부터 두 개의 정수를 입력받아, 두 수가 같은지 다른지를 판별하여 출력하세요.(삼항연산자, 조건문 각각 사용하기)
		
		// 로직구성
		// 입력클래스 import
		// int타입의 변수 num1과 num2 선언
		// String타입의 변수 msg "정수를 입력하세요 : "
		// msg 출력
		// num1에 입력 메소드로 정수값 입력받기(nextInt())
		// 삼항연산자 사용하여 같은지 다른지 출력
		// if ~ else문 사용하여 같은지 다른지 출력
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String msg = "정수를 입력하세요 : ";
		System.out.print(msg);
		num1 = sc.nextInt();
		System.out.print(msg);
		num2 = sc.nextInt();
		
		// 삼항연산자 사용
		System.out.println(num1 == num2 ? "num1과 num2는 같은 값입니다." : "num1과 num2는 다른 값입니다." );
		
		// if ~ else문 사용
		if (num1 == num2) {
			System.out.println("num1과 num2는 같은 값입니다.");
		} else {
			System.out.println("num1과 num2는 다른 값입니다.");
		}
		
	}
}
