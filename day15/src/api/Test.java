package api;

public class Test {
	public static void main(String[] args) {
		ApiTest2 at = new ApiTest2();
		System.out.println(at);
		
		try {
			at.div(10, 0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
