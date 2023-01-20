package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생정보, 점수 
		Map<Student, Integer> map = new HashMap<>(); 
		
		// 중복 X
		map.put(new Student(1, "홍길동"), 91);
		map.put(new Student(2, "하동길"), 92);
		map.put(new Student(3, "김유신"), 93);
		map.put(new Student(4, "김민즈"), 94);
		map.put(new Student(5, "서주희"), 95);
	
		// 하나씩 처리하는 방법
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			Student key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+ " : " + value);
			
			
		}
		
		
		// 저장된 총 Entry 수 출력
		System.out.println("총 저장된 Entry 수 : "+map.size());
		Student std;
		String name;
		int input;
		int score;
		while(true) {
			System.out.print("학생 번호를 입력하세요 : ");
			input = scan.nextInt();
			System.out.print("학생 이름을 입력하세요 : ");
			name = scan.next();
			
			std = new Student(input, name);
	

		}
	
	}
}
