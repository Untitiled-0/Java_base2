package chapter17.hashset;

import java.util.HashSet;
import java.util.Set;

import chapter17.Member2;

public class MemberHashSetMain {

	public static void main(String[] args) {
		
		Set<Member2> set = new HashSet<Member2>();
		
		set.add(new Member2(30,"홍길동"));
		set.add(new Member2(30,"홍길동"));
		set.add(new Member2(30,"홍길동"));
		
		System.out.println("총 객체수 : " +set.size());
		
	}

}
