package thingTask;

public class Main {
	public static void main(String[] args) {
		// Main 클래스
		// main 메소드
		// 부모클래스 객체 thing
		// 자식클래스 객체 book
		// 각 객체마다 메소드 호출
		Things th = new Things("물건");
		Book bk = new Book("java", "개발자");
		
		th.printInfo();
		bk.printInfo();
	}
}
