package chapter17.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{ // 내림차순
	
	@Override
	public int compare(String s1, String s2) {
		
		return (s1.compareTo(s2))* -1; // 
	}
}
public class ComparatorTest2 {

	public static void main(String[] args) {
		
		// 오름차순
		Set<String>	set = new TreeSet<String>();
		
		
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		set.add("cab");
		
		System.out.println(set);
		
		//내림차순 
//		Set<String>	set1 = new TreeSet<String>(new MyCompare());
//
//		set1.add("aaa");
//		set1.add("ccc");
//		set1.add("bbb");
//		set1.add("cab");
//		
//		System.out.println(set1);

		
	}
}
