package forTest;

public class ForTest03 {
	public static void main(String[] args) {
		// 1 ~ 100 짝수만 출력 tab키 적용
		
		// for문으로 정수형타입 변수 1 ~ 100까지 출력
		// if문 사용하여 짝수 조건식 입력
		// if문이 true일때 print 사용하여 i + "\t" 출력
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0 && i != 0) {
				System.out.print(i + "\t");
			}
		}
		
		System.out.println("");
		// A ~ F 출력
		for(int i = 0; i < 6; i++) {
			System.out.print((char)(i + 65) + "\t");
		}
		
		System.out.println("");
		//aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
		for(int i = 0; i < 26; i++) {
//			if(i % 2 == 0) {
//				System.out.print((char)(i + 97));
//			} else {
//				System.out.print((char)(i + 65));
//			}
			//삼항연산자
			System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
		}
	}
}
