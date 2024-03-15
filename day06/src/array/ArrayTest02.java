package array;

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
		// 3명의 학생 java점수를 입력받아 배열에 저장하고 평균점수 출력
		// 로직구성
		// 입력 클래스 import
		// 실수형 타입의 변수 배열생성 double[] stu = new double[3];
		// for문 사용하여 stu[i] = sc.nextDouble
		// 평균점수 출력
//		Scanner sc = new Scanner(System.in);
//		double[] stu = new double[3];
//		double total = 0;
//		for(int i = 0; i < 3; i++) {
//			System.out.print("점수를 입력하세요 : ");
//			stu[i] = sc.nextDouble();
//			total += stu[i];
//		}
//		System.out.println(total / 3);
		
		// 0, 1, 2, 3, 4, 0, 1, 2, 3, 4, 배열에 담고 출력
		// 단, 칸수를 이용해서 배열생성
		// 로직구성
		// 정수형 타입 배열 생성 int[] num = new int[10];
		// for문 사용해서 반복문 생성
		// 출력
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = i % 5;
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
		// 3. A~F까지 중 c만 제외하고 배열에 담고 출력하기
		System.out.println();
		 char[] ar2 = new char[5];
	      int temp = 0;
	      for(int i = 0; i < ar2.length; i++) {
//	         System.out.println(i);
	         temp = i;
	         if(temp > 1) {
	            temp++;
	         }
	         ar2[i] = (char)(temp+65);
	      }
	      for(int i = 0; i<ar2.length; i++) {
	         System.out.println(ar2[i]);
	      }

	      
	    //5칸의 정수배열을 만들고 입력받아 최대값과 최소값 출력하기
	      
	}
}
