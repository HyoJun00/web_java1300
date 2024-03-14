package arrayTest;

public class ArrayTest01 {
	public static void main(String[] args) {
		// 정수형 배열명 number1 선언하고 크기가 5인 배열 생성
		int[] number1 = new int[5];
		System.out.println(number1);
		System.out.println(number1[0]);
		System.out.println(number1[1]);
		
		// 문자열 배열명 cities 초기값 서울, 부산, 강원, 경기, 제주
		String[] cities = {"서울", "부산", "강원", "경기", "제주"};
		System.out.println(cities);
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		
		// 실수형 배열명 number2 크기가 3인 배열명 생성하면서 초기값 1.1, 2.2, 3.3 할당
		double[] number2;
		number2 = new double[] {1.1, 2.2, 3.3};
		System.out.println(number2);
		
		// 몇칸인지도 모르고 어떤값이 들어갈지도 모를때
		char[] data = null;
		data = new char[2];
	}
}
