package castingTest4;

public class Rectangle extends Shape {

	// 메소드 오버라이딩
	@Override
	void draw() {
		System.out.println("사각형을 그립니다.");
	}
	
	// 사각형 넓이 구하는 메소드
	void rectArea(int width, int height) {
		System.out.println("사각형 넓이 : " + width * height);
	}
	
	
}
