package control;

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		// if ~ else 조건식
		if (num % 2 == 0) {
			System.out.println(num + "은/는 짝수 입니다.");
		} else {
			System.out.println(num + "은/는 홀수 입니다.");
		}
		
		System.out.println("프로그램 종료");
	}
}
