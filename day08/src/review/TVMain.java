package review;

public class TVMain {
	public static void main(String[] args) {
		// 객체화작업(인스턴스화)
		TV sTV = new TV();
		System.out.println(sTV);
		System.out.println(sTV.power);
		sTV.power = true;
		System.out.println(sTV.power);
		System.out.println(sTV.ch);
		sTV.ch = 22;
		System.out.println(sTV.ch);
		// chUp() 매개변수 X, 리턴값 X -> 객체명.메소드명();
		sTV.chUp();
		
		// sTV2 객체 매개변수 4개 있는 생성자로 만들기
		TV sTV2 = new TV(22, 10, true, "black");
		System.out.println(sTV2);
		System.out.println(sTV2.ch);
		
	}
}
