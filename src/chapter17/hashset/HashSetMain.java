package chapter17.hashset;

import java.util.HashSet;

public class HashSetMain {

	public static void main(String[] args) {
		
		// equals와 hashcode가 override된 String Type
		// 순서도 랜덤 중복을 지원하지 않습니다.
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add(new String("임정희"));
		hashSet.add(new String("박현정"));		
		hashSet.add(new String("홍연희"));
		hashSet.add(new String("강감찬"));

		System.out.println(hashSet);
		hashSet.add(new String("강감찬"));
		System.out.println(hashSet);
		
		
		
		
	}

}
