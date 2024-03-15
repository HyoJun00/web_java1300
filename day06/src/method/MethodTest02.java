package method;

public class MethodTest02 {
	// 메소드 정의
	// 매개변수 X 리턴값 X 메소드 정의
	// 이름을 출력하는 기능
	void printName() {
		System.out.println("양효준");
		System.out.println("매개변수와 리턴값이 없는 메소드가 호출되었습니다.");
	}
	
	// 매개변수 O 리턴값 X 메소드 정의
	// 정수 1개를 받아서 출력하는 기능
	void printNum(int num) {
		System.out.println(num + "입니다.");
		System.out.println("매개변수는 있고 리턴값이 없는 메소드가 호출되었습니다.");
	}
	
	// 매개변수 X 리턴값 O 메소드 호출
	// 이름을 반환하는 기능
	String getName() {
		return "양효준";
	}
	
	
	
	public static void main(String[] args) {
		MethodTest02 mt = new MethodTest02();
		
		// 메소드 호출
		// 매개변수 X 리턴값 X 메소드 호출
		mt.printName();
		
		// 매개변수 O 리턴값 X 메소드 호출
		mt.printNum(100);
		
		// 매개변수 X 리턴값 O 메소드 호출
		System.out.println(mt.getName());
		String name = mt.getName();
		System.out.println(name);
	}
}
