package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher hindiTeacher = new Teacher(101, 30000, "Fariha Anjum");
		Teacher historyTeacher = new Teacher(102, 40000, "Ameena Taj");
		Teacher MathsTeacher = new Teacher(103, 50000, "Rasik");

		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(hindiTeacher);
		teacherList.add(historyTeacher);
		teacherList.add(MathsTeacher);

		Student karthi = new Student(1, "karthi", 12);
		Student mani = new Student(2, "Mani", 10);
		Student dinesh = new Student(3, "Dinesh", 11);
		List<Student> studentsList = new ArrayList<>();
		studentsList.add(karthi);
		studentsList.add(mani);
		studentsList.add(dinesh);

		School ghs = new School(teacherList, studentsList);

		System.out.println("Total Money Received by the School: " + ghs.getTotalMoneyReceived());
		
		karthi.setFeesPaid(1000);
		mani.setFeesPaid(2000);
		System.out.println("Total Money Received by the School: " + ghs.getTotalMoneyReceived());
		
		System.out.println("---------------Making School pay Salary---------------");
		hindiTeacher.setSalaryEarned(hindiTeacher.getSalary());
		System.out.println("---------------Making School pay Salary---------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
