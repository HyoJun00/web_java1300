package interMethod;

public class InterFaceMain {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
		// static 메소드 호출 -> 클래명.메소드명() or 인터페이스명.메소드명()
		// static 메소드는 구현되어있기 때문에 구현되어있는 곳에서 호출해야함
		MyInterface.staticMethod();
		
		mc.defaultMethod();
		mc.abstractMethod();
	}
}
