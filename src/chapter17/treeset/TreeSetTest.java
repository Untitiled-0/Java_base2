package chapter17.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		treeSet.add(new String("윤"));
		treeSet.add(new String("영"));
		treeSet.add(new String("훈"));
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		TreeSet<Integer> treeSet1 = new TreeSet<>();
		
		treeSet1.add(3);
		treeSet1.add(2);
		treeSet1.add(1); 
		
		for(Integer str : treeSet1) {
			System.out.println(str);
		}
		
	}
}
