package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {
	public static void main(String[] args) {
		// 카페 메뉴
		// 아메리카노 2000원
		// 카페라떼 2500원
		// 바닐라라떼 4000원
		// 초코라떼 4000원
		
		// HashMap에 저장하기
		// 출력과 입력
		// 1. 아메리카노
		// 2. 카페라떼
		// 3. 바닐라라떼
		// 4. 초코라떼
		// 번호를 선택하세요 : 2
		// 카페라떼의 가격은 2500원 입니다
		
		// 로직구성
		// 입력 클래스 import
		// 정수형 타입 변수 선언
		// HashMap import
		// .put() 메소드 사용하여 key와 value값 넣기
		// 메뉴 출력 후 메뉴를 선택하세요 출력
		// (switch case문 사용)번호 선택시 해당 메뉴 가격 출력
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> cafe = new HashMap<>();
		cafe.put("아메리카노", 2000);
		cafe.put("카페라떼", 2500);
		cafe.put("바닐라라떼", 4000);
		cafe.put("초코라떼", 4000);
		System.out.println("[메뉴]");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 바닐라라떼");
		System.out.println("4. 초코라떼");
		System.out.print("메뉴를 선택하세요");
		int menu = sc.nextInt();
		switch(menu){
			case 1 :
				System.out.println();
			case 2 :
				System.out.println();
			case 3 :
				System.out.println();
			case 4 :
				System.out.println();
		}
	}
}
