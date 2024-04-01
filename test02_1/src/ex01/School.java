package ex01;

public class School {
	// 양효준
	
	// 필드
	Student[] students;
	int studentCount;
	
	// 생성자
	public School() {
		super();
		this.students = new Student[30];
		this.studentCount = 0;
	}
	
	// 메소드
	
	// 학생 등록 메소드
	// 로직구성
	// 논리형 타입을 반환하고 매개변수로 Student타입의 student 받는 메소드 생성
	// 조건문을 사용하여 학생 수 가 30명이 넘으면 학생 수가 초과하여 등록할수 없다는 메시지 출력
	// false 반환
	// 위 조건이 아닐 시 학생 배열에 학생번호 부여
	// 학생을 등록했다는 메시지 출력
	// true 반환
	boolean registerStudent(Student student) {
		if(this.studentCount >= 30) {
			System.out.println("최대 학생 수를 초과하여 등록할 수 없습니다.");
			return false;
		}
		students[studentCount++] = student;
	    student.studentNumber = studentCount;
		System.out.println("학생을 등록했습니다.");
		return true;
	}
	
	// 학생 목록 보기 메소드
	// 로직구성
	// 반환값 없고 매개변수 없는 메소드 생성
	// 반복문 활용하여 학생 배열 인덱스 번호를 1씩 증가
	// 학생 배열 출력
	void showStudentList() {
		System.out.println("=== 학생 목록 ===");
		for(int i = 0; i < studentCount; i++) {
			System.out.println(students[i]);
		}
		System.out.println("=============");
	}
	
	// 성적 평균 보기 메소드
	// 로직구성
	// 반복문을 사용하여 학생 배열 객체의 인덱스 번호 1씩 증가
	// 평균 구하는 메소드 avg 변수에 저장
	// 학생이름과 평균성적 출력
	void showScoreAvg() {
		System.out.println("=== 성적 평균 ===");
		for(int i = 0; i < studentCount; i++) {
			Student student = students[i];
			double avg = student.scoreAvg();
			System.out.println("학생이름 : " + student.studentName);
			System.out.println("평균 성적 : " + avg);
		}
		System.out.println("=============");
	}
	
	
}
