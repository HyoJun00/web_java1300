package castingTest4;

public class Triangle extends Shape {

	// 메소드 오버라이딩
	@Override
	void draw() {
		System.out.println("삼각형을 그립니다.");
	}
	
	// 삼각형 넓이 구하는 메소드
	void triArea(int base, int height) {
		System.out.println("삼각형 넓이 : " + 0.5 * base * height);
	}
	
}
