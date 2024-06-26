package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int number = 10;
		
		// boxing
		Integer numInt = new Integer(number); // boxing 예전 방법
		System.out.println(numInt);
		Integer numInt2 = Integer.valueOf(number);
		System.out.println(numInt2);
		
		Double numDouble = new Double(1.1);
		Double numDouble2 = Double.valueOf(1.1);
		System.out.println(numDouble);
		System.out.println(numDouble2);
		
		// unboxing
		int num1 = numInt2.intValue();
		double num2 = numDouble2.doubleValue();
		System.out.println(num1);
		System.out.println(num2);
		
		// auto boxing
		Integer numInt3 = 3;
		// auto unboxing
		int num3 = numInt3;
		
		System.out.println(numInt3);
		System.out.println(num3);
		
	}
}
