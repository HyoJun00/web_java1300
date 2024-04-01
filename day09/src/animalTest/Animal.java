package animalTest;

public class Animal {
	// 동물 클래스
	// 필드
	// 이름 / 나이 / 종(species)
	String name;
	int age;
	String species;
	
	// 생성자
	// 기본생성자 / 이름과 종을 받는 생성자 / 이름과 나이와 종을 받는 생성자
	// this() 반드시 사용
	public Animal() {
		
	}

	public Animal(String name, String species) {
		this();
		this.name = name;
		this.species = species;
	}

	public Animal(String name, String species, int age) {
		this(name, species);
		this.age = age;
	}
	
	
	
	
	// 메소드
	// printAnimal(매개변수 리턴값 X) 
	// 정보 출력 메소드 : 이름, 나이, 종 출력
	void printAnimal() {
		System.out.println("이름 : " + this.name + "\n나이 : " + this.age + "\n종 : " + this.species);
	}
	
	// eat(매개변수 O 리턴값 O -> 종과 먹이)
	// 동물이름이 먹이를 먹습니다 출력
	String eat(String food) {
		System.out.println(this.name + " 이/가 " + food + "를 먹습니다."); 
		String result = "종 : " + this.species + " 먹이 : " + food;
		return result;
	}
	
	// sleep(매개변수 X 리턴값 O -> 종)
	// 동물이름이 잠을 잡니다
	String sleep() {
		System.out.println(this.name + " 이/가 잠을 잡니다.");
		return this.species;
	}
	
	// 먹을 수 있다 / 울음소리 / 달릴 수 있다 / 날 수 있다
}
