package variable;

public class Task01 {
	public static void main(String[] args) {
		// 이름과 나이와 취미를 변수에 저장하고 아래 형시대로 출력하기
		// 제 이름은 000이고, 나이는 0살입니다.
		// 제 이름은 000이고,
		// 취미는 000입니다.
		// 제 이름은 "000"이고,		나이는 '0'살입니다.
		// 취미는 "000"입니다.
		
		String name = "양효준";
		int age = 25;
		String hobby = "운동";
		
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
		
		System.out.println("제 이름은 " + name + "이고,\n취미는 " + hobby + "입니다.");
		
		System.out.println("제 이름은 \"" + name + "\"이고\t,나이는 \'" + age 
							+ "\'살 입니다.\n취미는 \"" + hobby + "\"입니다.");
		
		System.out.println("내년에 제 나이는 " + age + "살 입니다.");
	}
}
