package castingTest4;

public class ShapeTest {
	public static void main(String[] args) {
		Shape r = new Rectangle();
		System.out.println(r);
		
		polymorphism(new Circle());
		polymorphism(new Triangle());
		
		downcasting(r);
	}
	
	// 참조변수의 다형성 기능을 할 메소드
	static void polymorphism(Shape shape) {
		// 업캐스팅 된 메소드 호출
		shape.draw();
	}
	
	// 다운캐스팅 기능을 할 메소드
	// instanceof 연산자를 사용하여 객체의 실제 타입을 확인
	// 넓이 구하는 메소드 호출
	static void downcasting(Shape shape) {
		if(shape instanceof Circle) {
			((Circle)shape).cirArea(30);
		} else if(shape instanceof Rectangle) {
			((Rectangle)shape).rectArea(10, 30);
		} else if(shape instanceof Triangle) {
			((Triangle)shape).triArea(50, 30);
		}
	}
	
}
