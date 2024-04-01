package staticTest;

public class StaticTest {
	public static void main(String[] args) {
		
	}
	
	void iMethod1() {
		System.out.println("인스턴스 메소드1 실행");
	}
	
	void iMethod2() {
		System.out.println("인스턴스 메소드2 실행");
	}
	
	static void sMethod1() {
		System.out.println("스태틱 메소드1 실행");
	}
	
	static void sMethod2() {
		System.out.println("스태틱 메소드2 실행");
	}
}
