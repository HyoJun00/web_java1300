package input;

import java.util.Scanner;

public class InputTask01 {
	public static void main(String[] args) {
		// 이름을 입력하세요 : 000
		// 000님 안녕하세요 출력
		
		// 로직 구성
		// 1. Scanner 클래스 생성
		// 2. Scanner 클래스 import
		// 3. "이름을 입력하세요 : " 출력
		// 4. 문자열타입 name이라는 변수에 sc.next() 값 담기
		// 5. name + "님 안녕하세요." 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println(name + "님 안녕하세요.");
	}
}
