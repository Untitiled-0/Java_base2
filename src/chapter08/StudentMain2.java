package chapter08;

public class StudentMain2 {

	
	public static void main(String[] args) {

		
		Student2 studentLee = new Student2();
		
		studentLee.setStudentName("이재민");
		studentLee.studentID=studentLee.serialNum;
		System.out.println("이름 : " + studentLee.StudentName + "\n아이디 : " + studentLee.studentID);
		System.out.println();
		
		
		
		Student2 studentKim = new Student2();
		studentKim.setStudentName("김창우");
		studentKim.studentID=studentKim.serialNum;
		System.out.println("이름 : " + studentKim.StudentName + "\n아이디 : " + studentKim.studentID);
		Student2.serialNum++;
		System.out.println();
		
		Student2 studentPark = new Student2();
		studentPark.setStudentName("박장훈");
		studentPark.studentID=studentPark.serialNum;
		System.out.println("이름 : " + studentPark.StudentName + "\n아이디 : " + studentPark.studentID);
		
	
	
	
	
	}
}
