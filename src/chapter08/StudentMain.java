package chapter08;

public class StudentMain {

	public static void main(String[] args) {

		Student1 studentLee = new Student1();
		studentLee.setStudentName("이재민");
		studentLee.studentID=studentLee.serialNum;
		System.out.println(studentLee.StudentName);
//		System.out.println(studentLee.getStudentName());
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++;
		System.out.println();
		
		
		
		Student1 studentKim = new Student1();
		studentKim.setStudentName("김창우");
		System.out.println(studentKim.StudentName);
//		System.out.println(studentKim.getStudentName());
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++;
		System.out.println();
		
		Student1 studentPark = new Student1();
		studentPark.setStudentName("박장훈");
		System.out.println(studentPark.StudentName);
//		System.out.println(studentKim.getStudentName());
		System.out.println(Student1.getSerialNum());
		
	
	
	
	
	}
}
