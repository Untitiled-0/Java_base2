package chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();

		list.add("JAVA");
		list.add("ORACLE");
		list.add("SERVLET/JSP");
		list.add(2, "SPRING");
		list.add("PYTHON");
	
		int size=list.size();
	
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
	
		for(String i : list) {
			System.out.println(list.indexOf(i)+" : "+ i+" ");
		}
		System.out.println();
		System.out.println();
		
		for(int i=0;i<size;i++) {
			String str= list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("PYTHON");
		for(String i : list) {
			System.out.print(i+" ");
		}
	}
}
