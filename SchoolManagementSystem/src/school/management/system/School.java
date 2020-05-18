package school.management.system;

import java.util.List;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyReceived;
	private static int totalMoneySpent;

	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyReceived = 0;
		totalMoneySpent = 0;

	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public List<Student> getStudents() {
		return students;
	}

	public  int getTotalMoneyReceived() {
		return totalMoneyReceived;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}

	public void addStudents(Student student) {
		students.add(student);
	}

	public static void updateMoneyReceived(int MoneyReceived) {
		totalMoneyReceived = totalMoneyReceived + MoneyReceived;
	}

	public static void updateMoneySpent(int MoneySpent) {
		totalMoneySpent = totalMoneyReceived - MoneySpent;
		System.out.println("");
	}

}
