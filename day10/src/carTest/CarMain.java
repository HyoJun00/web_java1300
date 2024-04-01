package carTest;

public class CarMain {
	public static void main(String[] args) {
		// 부모 클래스의 객체
		Car c1 = new Car();
		Car c2 = new Car("기아", "black", 4000);
		// 자식 클래스의 객체
		SuperCar sc1 = new SuperCar(true);
		SuperCar sc2 = new SuperCar("포르쉐", "red", 8000, true);
		
//		System.out.println(sc1.booster);
		System.out.println(c2);
		System.out.println(sc2);
		c2.enginStart();
		sc2.enginStart();
	}
}
