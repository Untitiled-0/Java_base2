package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetNumber {

	public static void main(String[] args) {
		

		// 정렬안됨(순서가 없음), 중복 안됨 Iterator을 사용해야함
		HashSet<Integer> hs = new HashSet<>();
		
		while(true) {
			
			int v = (int)(Math.random()*45+1);
			
			int v1 = new Random().nextInt(45)+1;
			
			hs.add(v);
			
			if(hs.size()>=6) {
				break;
			}
		}
		System.out.println(hs);
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			
		}
	}
}
