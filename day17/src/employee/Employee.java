package employee;

public class Employee {
	// 필드
	private String name;
	private int age;
	private String department;
	
	// 생성자
	public Employee(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}

	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}
}
