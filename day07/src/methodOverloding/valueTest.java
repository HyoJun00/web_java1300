package methodOverloding;

public class valueTest {
	public static void main(String[] args) {
		valueTest vt = new valueTest();
		
		int num = 1;
		int[] arr = {1};
		
		// 변수 자체를 보냄(call by value)
		vt.add_value(num);
		System.out.println(num);
		
		// 배열 자체를 보냄(call by reference)
		vt.add_reference(arr);
		System.out.println(arr[0]);
		
	}
	
	void add_value(int num) {
		num += 100; 
		System.out.println(num);
	}
	
	void add_reference(int[] arNum) {
		arNum[0] += 100;
		System.out.println(arNum);
	}
	
}
