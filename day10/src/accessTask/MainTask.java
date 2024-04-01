package accessTask;

public class MainTask {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		
		animal.name = "고양이";
		cat.name = "얌쟝";
		
		cat.setColor("흰색");
		
		animal.eat();
		cat.eat();
		cat.scratch();
		cat.play();
	}
}
