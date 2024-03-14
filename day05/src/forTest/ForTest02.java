package forTest;

import java.util.Scanner;

public class ForTest02 {
	public static void main(String[] args) {
		// 1번 양효준
		// 2번 양효준
		// 3번 양효준
		// 4번 양효준
		// 5번 양효준
		//for문 이용해서 출력
		
		//로직구성
		// 이름 입력받을 입력클래스 import
		// 문자열타입의 변수 선언
		// 이름을 입력하세요 출력
		// 문자열타입의 변수에 입력메소드 사용
		// for문 사용하여 정수형타입변수가 5번이 될때까지 반복 출력
		
		Scanner sc = new Scanner(System.in);
//		String name = "";
//		System.out.println("이름을 입력하세요 : ");
//		name = sc.next();
//		for(int i = 1; i < 6; i++) {
//			System.out.println(i + "번 " + name);
//		}
		
		String name2 = "";
		System.out.println("이름을 입력하세요 : ");
		name2 = sc.next();
		for(int i = 10; i >= 1; i--) {
			System.out.println(i + "번 " + name2);
		}
	}
}
