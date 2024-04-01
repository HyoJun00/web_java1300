package castingTest4;

// 슈퍼클래스 Shape를 상속받은 서브클래스 Circle
public class Circle extends Shape {

	// 메소드 오버라이딩
	@Override
	void draw() {
		System.out.println("원을 그립니다.");
	}
	
	void cirArea(double radius) {
		System.out.println("원의 넓이 : " + radius * radius * Math.PI);
	}
}
