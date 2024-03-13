package input;

import java.util.Scanner;

public class InputTask03 {
	public static void main(String[] args) {
		// 이름과 나이를 입력받아서 000님의 나이는 0살입니다 출력
		
		// 로직구성
		// 1. Scanner 클래스 생성 후 import
		// 2. "이름을 입력하세요 : " print로 출력
		// 3. 문자열 타입 name이라는 변수에 sc.next() 값 입력
		// 4. "나이를 입력하세요 : " print로 출력
		// 5. 문자열 타입 age이라는 변수에 sc.next() 값 입력
		// 6. printf로 "%s님의 나이는 %s살입니다.", name, age 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이을 입력하세요 : ");
		String age = sc.nextLine();
		System.out.printf("%s님의 나이는 %s살입니다.", name, age);		
	}
}
