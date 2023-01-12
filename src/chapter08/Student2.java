package chapter08;

public class Student2 {

	public static int serialNum=9999;
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		this.studentID=serialNum;
	}
	public static int getSerialNum() {
		return serialNum;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public void Disp() {
		
	}
	
}
