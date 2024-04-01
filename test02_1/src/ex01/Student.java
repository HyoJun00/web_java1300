package ex01;

import java.util.Arrays;

public class Student {
	// 양효준
	
	// 필드
	int studentNumber;
	String studentName;
	int[] grades;
	
	// 생성자
	public Student(String studentName, int[] grades) {
		super();
		this.studentName = studentName;
		this.grades = grades;
	}
	
	// 메소드
	
	// 성적 정보 보기 메소드
	// 로직구성
	// 매개변수와 리턴타입 없는 메소드 생성 후 각 필드 정보 출력(성적은 배열 인덱스 활용)
	void showGradeInfo() {
		System.out.println("=== 성적 정보 ===");
		System.out.println("학생이름 : " + this.studentName);
		System.out.println("학생번호 : " + this.studentNumber);
		System.out.println("국어 성적 : " + this.grades[0]);
		System.out.println("영어 성적 : " + this.grades[1]);
		System.out.println("수학 성적 : " + this.grades[2]);
		System.out.println("=============");
	}
	
	// 평균 성적 계산 메소드
	// 로직구성
	// 반환타입이 실수 타입인 메소드 생성
	// 점수들의 합을 담을 변수 초기화
	// 조건문을 사용하여 배열안에 있는 점수들 합 구하는 조건식 선언
	// 점수들의 합과 배열의 길이를 활용하여 평균점수 반환
	double scoreAvg() {
		int sum = 0;
		for(int grade : grades) {
			sum += grade;
		}
		return (double)sum / grades.length;
	}

	// toString 재정의
	// alt + shift + s + v 단축키를 활용
	// Object클래스에있는 toString() 메소드 재정의
	// 학생 정보를 반환(배열이 들어간 학생 점수는 Arrays.toSting() 사용)
	@Override
	public String toString() {
		System.out.println("=== 학생 정보 ===");
		return "학생 이름 : " + this.studentName
				+ "\n학생 번호 : " + this.studentNumber
				+ "\n학생 점수 : " + Arrays.toString(grades);
	}
}
