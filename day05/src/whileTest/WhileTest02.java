package whileTest;

public class WhileTest02 {
	public static void main(String[] args) {
		// 1부터 100까지 짝수의 합 출력(while)
		
		//로직구성
		// 정수형 타입 변수 선언 후 기본값 초기화
		// while문 조건식에 num1이 100보다 작을때까지 정수 출력
		// while문 안에 if문 활용하여 짝수만 출력 후 총합
		
		int num1 = 0;
		int num2 = 0;
		while(num1 < 100) {
			num1++;
			if(num1 % 2 == 0) {
				num2 += num1;
			}
		}
		System.out.println(num2);
	}
}
