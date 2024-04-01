package wrapperTest;

public class WrapperTask {
	public static void main(String[] args) {
		// 아래 값들을 하나의 배열에 담기, 단 String[] 사용 금지
		// 1, 3.14, 'a', "Cat", true
		// 배열명 : ar
		
		Object[] ar = {1, 3.14, 'a', "Cat", true};
		System.out.println(ar);
		
		for(Object value : ar) {
			System.out.println(value);
		}
		
		
	}
}
