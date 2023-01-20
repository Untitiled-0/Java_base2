package chapter18.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable {

	public static void main(String[] args) {
		// 동기화 : Hashtable
		Map<String, String> map = new Hashtable<>();
		
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String id,pwd;
			System.out.print("아이디 : ");
			id = scan.next();
			if(map.containsKey(id)) {				
				System.out.print("비밀번호 : ");
				pwd = scan.next();
				if(map.get(id).equals(pwd)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
			System.out.println();
		}
	}
}
