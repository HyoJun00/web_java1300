package InnerTest;

public class Outer {
	// 외부 클래스 필드
	int var1;
	String var2;
	
	// 외부 클래스 메소드
	void method() {
		System.out.println("외부 클래스의 메소드 호출");
	}
	
	class Inner{
		// 내부 클래스 생성자
		public Inner() {
			super();
		}
	}
}
