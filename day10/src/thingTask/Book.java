package thingTask;

public class Book extends Things {
	// Things 클래스를 상속받는 Book클래스
	// 필드	저자(String author)
	// 생성자 매개변수2
	// 메소드 오버라이딩
	// 책 이름 : 000출력
	// 저자 : 000출력
	
	// 필드
	String author;

	// 생성자
	public Book(String name, String author) {
		super(name);
		this.author = author;
	}

	// 메소드 오버라이딩
	@Override
	void printInfo() {
		System.out.println("책 이름은 " + this.name + " 저자는 " + this.author);
	}
	
	
	
	
}
