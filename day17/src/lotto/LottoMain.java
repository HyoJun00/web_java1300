package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LottoMain {
//	로또 번호 생성 프로그램
//	1. 1 ~ 45까지의 숫자 중 6개의 서로 다른 숫자를 무작위로 선택하여 로또 번호 생성
//	2. 출력될 때 오름차순으로 정렬
//	3. 사용자로부터 몇회차의 로또번호를 생성할지 입력받고 각 회차별로 생성된 로또 번호를 출력
	
//	로직구성
//	서로다른 숫자 					-> 중복 안됨(HashSet<Integer>사용)
//	무작위 						-> random(nextInt(45) + 1 사용)
//	오름차순으로 출력 				-> Collections sort()
//	사용자로부터 입력 				-> Scanner클래스(nextInt() 사용)
//	회차별로 생성된 로또 번호 출력		-> ArrayList<Integer>에 저장 후 순서대로 불러오기
	public static void main(String[] args) {
		// HashSet import
		HashSet<Integer> lotto = new HashSet<>();
		
		// Random import
		Random r = new Random();
		
		// 회차 입력받을 변수 선언
		int lottoNum = 0;
		
		// 6개의 숫자를 생성할 반복문 실행
		while(lotto.size() < 6) {
	         lottoNum = r.nextInt(45) + 1;
	         if(!lotto.contains(lottoNum)) {
	            lotto.add(lottoNum);
	         }
	      }
		// 로또 번호를 담을 ArrayList import
		ArrayList<Integer> result = new ArrayList<>(lotto);
		
		Collections.sort(result);
		System.out.println(result);
		
//		result.add(lotto);
		
		// 입력 클래스 import
		Scanner sc = new Scanner(System.in);
//		System.out.print("원하는 회차 번호를 입력하세요 : ");
//		int num = sc.nextInt();
		
//		for(int i = 0; i < num; i++) {
//			Collections.sort(result);
//			System.out.println(result);
//		}
	}
}
