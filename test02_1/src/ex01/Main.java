package ex01;

public class Main {
	// 양효준
	public static void main(String[] args) {
		// School 객체 생성
		School school = new School();
		System.out.println(school);
		
		// 점수 배열에 값 넣기
		int[] grade1 = {60, 40, 80};
		int[] grade2 = {60, 80, 10};
		int[] grade3 = {20, 40, 90};
		
		// 학생 객체 3개 값 넣기
		Student student1 = new Student("짱구", grade1);
		Student student2 = new Student("철수", grade2);
		Student student3 = new Student("맹구", grade3);
		Student student4 = new Student("맹구", grade3);
		Student student5 = new Student("맹구", grade3);
		Student student6 = new Student("맹구", grade3);
		Student student7 = new Student("맹구", grade3);
		Student student8 = new Student("맹구", grade3);
		Student student9 = new Student("맹구", grade3);
		Student student10 = new Student("맹구", grade3);
		Student student11 = new Student("짱구", grade1);
		Student student12 = new Student("철수", grade2);
		Student student13 = new Student("맹구", grade3);
		Student student14 = new Student("맹구", grade3);
		Student student15 = new Student("맹구", grade3);
		Student student16 = new Student("맹구", grade3);
		Student student17 = new Student("맹구", grade3);
		Student student18 = new Student("맹구", grade3);
		Student student19 = new Student("맹구", grade3);
		Student student20 = new Student("맹구", grade3);
		Student student21 = new Student("짱구", grade1);
		Student student22 = new Student("철수", grade2);
		Student student23 = new Student("맹구", grade3);
		Student student24 = new Student("맹구", grade3);
		Student student25 = new Student("맹구", grade3);
		Student student26 = new Student("맹구", grade3);
		Student student27 = new Student("맹구", grade3);
		Student student28 = new Student("맹구", grade3);
		Student student29 = new Student("맹구", grade3);
		Student student30 = new Student("맹구", grade3);
		Student student31 = new Student("맹구", grade3);
		
		// 학생 객체 메소드 사용하여 등록 메소드 호출
		school.registerStudent(student1);
		school.registerStudent(student2);
		school.registerStudent(student3);
		school.registerStudent(student4);
		school.registerStudent(student5);
		school.registerStudent(student6);
		school.registerStudent(student7);
		school.registerStudent(student8);
		school.registerStudent(student9);
		school.registerStudent(student10);
		school.registerStudent(student11);
		school.registerStudent(student12);
		school.registerStudent(student13);
		school.registerStudent(student14);
		school.registerStudent(student15);
		school.registerStudent(student16);
		school.registerStudent(student17);
		school.registerStudent(student18);
		school.registerStudent(student19);
		school.registerStudent(student20);
		school.registerStudent(student21);
		school.registerStudent(student22);
		school.registerStudent(student23);
		school.registerStudent(student24);
		school.registerStudent(student25);
		school.registerStudent(student26);
		school.registerStudent(student27);
		school.registerStudent(student28);
		school.registerStudent(student29);
		school.registerStudent(student30);
		school.registerStudent(student31);
		
		// 학생 목록 보기 메소드 호출
		school.showStudentList();
		// 학생 성적 평균 보기 메소드 호출
		school.showScoreAvg();
	}
}
