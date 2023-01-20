package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김치", 85);
		map.put("홍길동", 90);
		map.put("박수", 98);
		map.put("동장군", 75);
		
		System.out.println("총 Entry 수 : " +map.size());

		
		//객체찾기
		System.out.println("\t홍길동 : " +map.get("홍길동"));
		
		// 객체 키 모두 받기
		Set<String> keySet = map.keySet(); // 종복 허용을 받지 않는다.
		
		Iterator<String> keyit = keySet.iterator();
		
		while(keyit.hasNext()) {
			String key =keyit.next();
			Integer value = map.get(key);
			System.out.println("\t" +key+":"+value);
		}
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " +map.size());
		
		System.out.println("-----Entry total------");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> enrtyIterator= entrySet.iterator();
		
		while(enrtyIterator.hasNext()) {
			Map.Entry<String, Integer> entry =enrtyIterator.next();
//			System.out.println("\t" +entry);
			String key = entry.getKey();
			Integer value=entry.getValue();
			System.out.println("\t" +key+":"+value);
		}
		System.out.println();
		
		
		
	}
}
