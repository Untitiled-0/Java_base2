package chapter17.list;

import java.util.ArrayList; // 
import java.util.List;

public class ListTest {

	
	public static void main(String[] args) {

		// 리스트구조를 갖는 ArrayList클래스의 객체생성
		// vector 동기화때문에 사용함
		// 배열 : String[] ls1 = {};
		List<String> ls = new ArrayList<String>();
		// 리스트에 데이터 추가
		ls.add("hi");
		ls.add("happy");
		ls.add("nice");
		// length의 개념으로 볼 수 없다. 
		// 
		for(int i=0; i<ls.size();i++) {
			System.out.println(i+" : "+ls.get(i).toString());
		}
		System.out.println();
		System.out.println("-------데이터 추가후------");
		ls.add(3, "GOOD");
		for(int i=0; i<ls.size();i++) {
			System.out.println(i+" : "+ls.get(i).toString());
		}
		
		System.out.println();
		System.out.println("-------데이터 삭제 후------");
		ls.remove(0);
		for(int i=0; i<ls.size();i++) {
			System.out.println(i+" : "+ls.get(i).toString());
		}
		
		
		
	}
}
