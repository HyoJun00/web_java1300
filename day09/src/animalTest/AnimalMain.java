package animalTest;

public class AnimalMain {
	public static void main(String[] args) {
		// 객체 2개 생성하고 메소드 호출
		Animal a1 = new Animal("얌장", "고양이", 5);
		Animal a2 = new Animal("율무", "강아지", 3);
		
		a1.printAnimal();
		a2.printAnimal();
		
		System.out.println();
		
		System.out.println(a1.eat("츄르"));
		System.out.println(a2.eat("개껌"));
		
		System.out.println();
		
		System.out.println(a1.sleep());
		System.out.println(a2.sleep());
	}
}
