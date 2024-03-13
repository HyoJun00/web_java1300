package typeCasting;

public class TypeTask {
	public static void main(String[] args) {
		// 1. 올해 년도, 월, 일을 변수로 만들고
		// 올해는 0000년, 0월, 0일 입니다 형태로 출력
		int year = 2024, month = 3, date = 12;
		System.out.printf("올해는 %d년, %d월, %d일 입니다.\n", year, month, date);
		
		// 2. 올해 년도를 문자열로 만든 변수 year2를 선언하고
		//		24라는 값만 출력
		char year2 = "2024".charAt(2);
		char year3 = "2024".charAt(3);
		System.out.printf("%c%c", year2, year3);
		
		// 3. 1번에서 만든 변수들중 월, 일을 문자열로 바꿔서
		//		result 변수에 저장하고 실수(3.12)로 변환하여 출력
		String month1 = month + ".";
	    String date1 = date + "";
	    System.out.println("\n"+month1 + date1);
	    String result1 = month1 + date1;
	    Double result = Double.parseDouble(result1);
	    System.out.println(result);

	}
}
