package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		Iterator<UserInfo> it;
		up : while (true) {

			UserInfo ui;
			ui = new UserInfo();
			System.out.print("아이디 생성 : ");
			Scanner sc = new Scanner(System.in);
			String u1 = sc.next();
			ui.setId(u1);

			// 아이디 중복 체크
//			for(int i=0; i<arr.size();i++) {
//				if(ui.getId().equals(arr.get(i).getId())) {
//					System.out.println("중복되는 아이디입니다. \n다른 아이디를 입력하세요.");
//					continue up;
//				}
//			}
//			it = arr.iterator();
//			while (it.hasNext()) {
//				if (it.next()==u1) {
//					System.out.println("중복되는 아이디입니다. \n다른 아이디를 입력하세요.");
//				}
//			}
//			
			
			
			System.out.print("비밀번호 입력 : ");
			Scanner sc2 = new Scanner(System.in);
			ui.setPwd(sc.nextInt());
			arr.add(ui);
			
			for(int i=0; i<arr.size();i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
			}
			
			
			
			// 중복된 아이디가 아니라면 pwd입력
//			System.out.println(ui.getPwd());
//			for(int i=0;i<arr.size();i++) {
//				System.out.println(arr.get(i).toString());
//			}
		}

	}

}
