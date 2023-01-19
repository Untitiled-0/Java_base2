package chapter17.list;

import java.util.ArrayList;

public class ArrayEx2 {

	
	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("강감찬");
		list.add("을지문덕");
		list.add("김유신");
		
		System.out.println(list);
		
		for(String i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("list[0] : " + list.get(0));
		
		
		
		
	}
}
