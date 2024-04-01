package ex02;

import java.util.Scanner;

public class Main {
	// 양효준
	public static void main(String[] args) {
		// 로직구성
		// 입력 클래스 import
		// 나누어질 숫자를 입력받을 변수 2개 나눈 결과 값을 저장할 변수 1개
		// 총 3개의 정수형 변수 선언
		// 나누어질 숫자를 입력받을 변수에 입력 메소드 초기화
		// 입력받을 값이 어떤 것인지 메시지를 출력하고 입력 메소드를 사용하여 입력받기
		// 0 또는 음수를 입력했을 시 "0또는 음수는 나눌 수 없습니다" 출력
		// 문자를 입력했을 시 예외처리 사용하여 오류가 발생했다는 메시지 출력 후 오류 내용 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나누어질 숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("나눌 숫자를 입력하세요");
		int num2 = sc.nextInt();
		int result = 0;
		
	}
}
