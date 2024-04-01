package casting;

public class Main {
	public static void main(String[] args) {
		// 자료형 변수명 = 값;
		// 클래스타입 참조변수명 = 참조값;
		Tv tv = new Tv();
		SmartTv sTv = new SmartTv();
		
		// tv 슈퍼클래스의 객체 -> 필드 3개, 메소드 3개 접근 가능
		// stv 서브클래스의 객체 -> 필드 3개, 메소드 4개 접근 가능
		
		// Up Casting -> 자식의 참조값을 부모 타입의 참조변수
		Tv tv2 = new SmartTv();
//		System.out.println(tv2);
		
		
		
		
	}
}
