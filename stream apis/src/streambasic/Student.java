package streambasic;

public class Student
{
	private int studentId;
	private String name;
	private double percent;
	private String branch;
	
	public Student(int studentId, String name, double d, String branch) {
		this.studentId = studentId;
		this.name = name;
		this.percent = d;
		this.branch = branch;
	}

	



	public void Student1(int studentId2, String name2, double d, String branch2) {
		this.studentId = studentId2;
		this.name = name2;
		this.percent = d;
		this.branch = branch2;
		
	}





	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", percent=" + percent + ", branch=" + branch
				+ "]";
	}
	

}


