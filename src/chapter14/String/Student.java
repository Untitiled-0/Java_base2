package chapter14.String;

public class Student {

	int studentID;
	String studentName;

	public Student(int studentID, String studentName) {

		this.studentID = studentID;
		this.studentName = studentName;
	}

	// toString 재정의
	@Override
	public String toString() {

		return studentID + ", " + studentName;
	}

	// 물리적인 주소 (메모리)
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentID;
	}

	//논리적 비교문 ( 내용을 비교 )
	@Override
	public boolean equals(Object obj) { // 흡수를 못하는 것이 하나도 없다.

		if (obj instanceof Student) { // 부모가 obj 아닐 수가 없다. 상속받은 다른 것이 들어오게 된다면 거짓이 될 수가 있다.
			Student std = (Student) obj; // 다운캐스팅
			if (studentID == std.studentID) { // 비교판단
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
