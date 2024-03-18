package classTest02;

public class MarvelHero {
	// 필드
	String name;
	String superpower;
	int age;
	
	//메소드
	void heroInfo() {
		System.out.println("마블 히어로 이름 : " + name);
		System.out.println("슈퍼 파워 : " + superpower);
		System.out.println("나이 : " + age);
	}
	
	// 히어로 액션 메소드
	void performAction() {
		System.out.println(name + "이/가 슈퍼 파워를 사용합니다");
	}
	
	// 생성자
	public MarvelHero() {
		
	}

	public MarvelHero(String name, String superpower, int age) {
		this.name = name;
		this.superpower = superpower;
		this.age = age;
	}
	
	
}
