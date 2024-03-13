package variable;

public class Variable01 {
	public static void main(String[] args) {
		int num; // 변수 선언
		num = 10; // 변수 초기화

		int num2 = 20; // 변수의 선언과 초기화를 동시에

		System.out.println(num);
		System.out.println(num2);

//		int num, num1, num2; 같은 범위 안에서 같은 이름으로 선언 불가
//		int number1, number2, number3;
//		System.out.println(number1); 초기화를 하지않고 출력 불가
		int number1 = 0, number2 = 100, number3 = 200; // 같은 타입의 변수를 동시에 선언과 초기화
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
	}
}
