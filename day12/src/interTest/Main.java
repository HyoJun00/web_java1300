package interTest;

public class Main {
	public static void main(String[] args) {
//		Inter inter = new Inter();
		ClassA ca = new ClassA();
		ca.method1();
		ca.method2();
//		ca.VAR1 = 100;
		System.out.println(ca.VAR1);
		System.out.println(ca.VAR2);
	}
}
