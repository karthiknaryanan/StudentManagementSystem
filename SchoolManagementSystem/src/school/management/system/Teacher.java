package school.management.system;

public class Teacher {
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalaryEarned() {
		return salaryEarned;
	}

	public void setSalaryEarned(int salary) {
		this.salaryEarned = salaryEarned+salary;
		School.updateMoneySpent(salary);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private int id;
	private int salary;
	private int salaryEarned;
	private String name;

	public Teacher(int id, int salary, String name) {
		this.id=id;
		this.salary=salary;
		this.name=name;
		salaryEarned=0;
	}
	
}
