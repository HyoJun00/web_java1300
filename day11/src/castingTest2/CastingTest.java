package castingTest2;

public class CastingTest {
	public static void main(String[] args) {
		// 객체화 작업(인스턴스화)
		Person p1 = new Person("짱구", 5, "유치원생");
		Student p2 = new Student("양효준", 25, "대학생", "코리아 학교");
		Employee p3 = new Employee("홍길동", 40, "개발자", "코리아 회사");
		
		// 메소드 오버라이딩된 것으로 호출됨을 확인
//		p1.eat();
//		p2.eat();
//		p3.eat();
		
		System.out.println(p2);
		
		printWalk(p1);
		printWalk(p2);
		printWalk(p3);
		
	}
	
	// 매개변수 부모 클래스 타입의 매개변수(들어오면서 자동 업캐스팅)
	static void printWalk(Person person) {
		if(person instanceof Student) {
			((Student)person).walk();
		} else if(person instanceof Employee) {
			((Employee)person).walk();
		} else {
			System.out.println("걷기싫어");
		}
		
	}
	
}
