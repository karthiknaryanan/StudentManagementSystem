package school.management.system;

public class Student {
	private int id;
	private String name;
	private int feesTotal;
	private int feesPaid;
	private int grade;

	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		feesPaid = 0;
		feesTotal = 30000;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int fees) {
		this.feesPaid = feesPaid+fees;
		School.updateMoneyReceived(fees);
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	
	
	
}
