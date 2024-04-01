package accessModifier2;

import accessModifier.A;

public class Child extends A {
	// 필드
	public int var1 = 1;
	int var2 = 2; //(default) 
	protected int var3 = 3;
	
	// 메소드
	void method() {
		var1 = 100; // var1은 접근제한자가 public이기 때문에 모든 곳에서 사용가능
//		var2 = 200; var2는 접근제한자가 default이기 때문에 다른 패키지에서 사용불가
		var3 = 15; 	// var3는 접근제한자가 protected이기 때문에 다른 패키지에서 사용불가
				   	// 상속관계에 있는 자식 클래스이기 때문에 사용가능
	}
	
	public void publicMethod() {
		System.out.println("public 메소드 호출");
	}
	
	void defaultMethod() {
		System.out.println("default 메소드 호출");
	}
	
	protected void proMethod() {
		System.out.println("protected 메소드 호출");
	}
	
}
