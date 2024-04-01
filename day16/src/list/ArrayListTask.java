package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListTask {
	public static void main(String[] args) {
		// 1부터 20까지의 난수를 만들어서 ArrayList에 5개만 저장한다
		// nextInt(20) -> 0부터 19까지의 값
		// nextInt(20) + 1 -> 0부터 20까지의 값
		
		// 1. 중복되는 값은 없다
		// 2. 정렬
//		Random random = new Random();
//		ArrayList<Integer> list = new ArrayList<>();
//		for(int i = 0; i < 5; i++) {
//			int num = random.nextInt(20) + 1;
//			if(!list.contains(num)) {
//				list.add(num);
//				continue;
//			}
//			i--;
//		}
//		System.out.println(list);
//	    Collections.sort(list);
//	    System.out.println(list);
	    
	    
	    // while문으로 만들기
		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		while(i < 5) {
			i++;
			int num = random.nextInt(20) + 1;
			if(!list.contains(num)) {
				list.add(num);
				continue;
			}
			i--;
		}
	    Collections.sort(list);
	    System.out.println(list);
	}
}
