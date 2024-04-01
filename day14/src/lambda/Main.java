package lambda;

public class Main {
	public static void main(String[] args) {
		// 익명 클래스
		FunctionalInter1 fi1 = new FunctionalInter1() {
			
			@Override
			public int add10(int number) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		// 람다식
		FunctionalInter1 fii = number -> 0;
		
	}
}
