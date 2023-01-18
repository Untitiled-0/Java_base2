package chapter14.String;

public class EqualTest {

	public static void main(String[] args) {
		
		String str1 = new String("test"); // 데이터가 같으면 자동으로 재정의가 된다.
		String str2 = new String("test");
		
		Student studentLee = new Student(100,"이상우");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100,"이상우");
		
	
		// 동일한 주소의 두 인스턴스 비교()
		System.out.println("----동일한 주소의 두 인스턴스 비교----");
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2의 동일합니다.");
		} else {
			System.out.println("studentLee와 studentLee2의 동일하지않습니다.");
		}
		
		System.out.println("----물리적 주소 ==는 다르지만 논리식 값이 동일 ---");
		if(studentLee == studentSang) {
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentSang)) {
			System.out.println("studentLee와 studentSang의 동일합니다.");
		} else {
			System.out.println("studentLee와 studentSang의 동일하지않습니다.");
		}
		
		
		
		System.out.println("----데이터 값 출력 ----");
		System.out.println("studentLee의 hashCode : "+studentLee.hashCode());
		System.out.println("studentSang의 hashCode : "+studentSang.hashCode());
		System.out.println();
		
		
		System.out.println("----데이터 값으나 hash값이 다르므로 재정의가 필요 ----");
		System.out.println("studentLee의 hashCode : "+System.identityHashCode(studentLee));
		System.out.println("studentSang의 hashCode : "+System.identityHashCode(studentSang));
		System.out.println();
		
		
		// HashCode가 재정의 되어 있음
		System.out.println("----String클래스의 실제값 출력----");
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		
		
		
		
	}
}
