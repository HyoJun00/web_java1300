package input;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
		// 두 정수를 입력받고 합을 출력하기
		// next() 메소드만 사용
		
		//로직구성(나)
		// 1. Scanner 클래스 생성
		// 2. Scanner 클래스 import
		// 3. "정수1 입력" 호출
		// 4. 문자열 타입 변수에 sc.next() 값 초기화
		// 5. "정수2 입력" 호출
		// 6. 문자열 타입 변수에 sc.next() 값 초기화
		// 7. 정수1 과 정수2 의 합산한 값 출력
		// 8. 실행
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		String num1 = sc.next();
		System.out.print("정수2 입력 : ");
		String num2 = sc.next();
		System.out.println(num1 + num2);
		// # 문자열 타입을 정수형으로 형변환을 하지않음.
		
		//로직구성(강사님)
		// 1. 변수 3개를 선언(String 2개, int 1개)
		// 2. 입력 클래스 import
		// 3. 메세지를 출력 "정수1 입력"
		// 4. 입력메소드를 사용해서 정수1 변수에 저장
		// 5. 메세지를 출력 "정수2 입력"
		// 6. 입력메소드를 사용해서 정수2 변수에 저장
		// 7. int 변수 = Integer.parseInt(정수1) + Integer.parseInt(정수2)
		String num3 = "", num4 = "";
		int result = 0;
		System.out.print("정수1 입력 : ");
		num3 = sc.next();
		System.out.print("정수2 입력 : ");
		num4 = sc.next();
		result = Integer.parseInt(num3) + Integer.parseInt(num4);
		System.out.printf("두 정수의 합은 %d입니다\n", result);
	}
}
