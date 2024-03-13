package print;

public class PrintTest02 {
	public static void main(String[] args) {
		System.out.println("printf()메소드 연습.");
		System.out.println("내 java 점수는 100점 입니다.");
		System.out.printf("내 java 점수는 %d점 입니다.", 100);
		System.out.printf("내 평균점수는 %.1f점 입니다.", 99.55);
//		System.out.printf();
		System.out.printf("\n내 학점은 %c 입니다.", 'A');
		
		// 제 이름은 000이고, 나이는 0살이고, 취미는 00입니다.
		System.out.printf("제 이름은 \"%s\"이고, 나이는 \"%d\"이고, 취미는 \"%s\"입니다.", "양효준", 25, "운동");
		
		
	}
}
