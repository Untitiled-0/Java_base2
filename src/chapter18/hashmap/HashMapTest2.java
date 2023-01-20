package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// Map 생성 map
		// String Integer
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 팀원 데이터 (성함, 학번)저장
		map.put("허초회", 1);
		map.put("윤영훈", 2);
		map.put("전솔민", 3);
		map.put("김찬희", 4);
		map.put("이재민", 5);
		map.put("정예주", 6);
		
		// 팀원의 인원
		System.out.println("총 인원수 : "+map.size());
		
		// 팀장의 학번을 알아내자
		System.out.println("팀장의 학번 : "+map.get("허초회"));
		// 팀원의 모두의 학번 출력
		
		Set<String> keySet = map.keySet(); // 종복 허용을 받지 않는다.
		
		Iterator<String> keyit = keySet.iterator();
		
		while(keyit.hasNext()) {
			String key =keyit.next();
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
