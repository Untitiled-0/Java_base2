package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {
		ArrayList<Person> personArr = new ArrayList<Person>();
		int select;
		Person p;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1 . 회원추가 ");
			System.out.println("2 . 회원삭제 ");
			System.out.println("3 . 회원정보 ");
			System.out.println("4 . 종료 ");
			System.out.print("항목선택 : ");
			Iterator<Person> it;
			select = scan.nextInt();

			switch (select) {
			case 1:
				p = new Person();
				System.out.println("-----정보추가-----");
				System.out.print("이름 : ");
				p.setName(scan.next());
				System.out.print("나이 : ");
				p.setAge(scan.nextInt());
				System.out.print("전화 : ");
				p.setTel(scan.next());
				personArr.add(p);
				System.out.println("정보가 저장되었습니다.");
				break;
			case 2:
				it = personArr.iterator();
				System.out.println("-----정보삭제-----");
				System.out.print("이름 : ");
				String name = scan.next();
				int beforeSize = personArr.size();
				while (it.hasNext()) {
					Person person = it.next();
					if (person.getName().equals(name)) {
						it.remove();
						System.out.println(name + "회원이 탈퇴하였습니다.");
					}
					if (beforeSize == personArr.size()) {
						System.out.println(name + "이라는 회원이 존재하지 않습니다.");
					}
				}
				break;
			case 3:
				it = personArr.iterator();
				System.out.println("-----회원정보-----");
				if (it.hasNext() == false) {
					System.out.println("회원정보가 없습니다. \n회원 정보를 입력해주세요.");
				}
				while (it.hasNext()) {
					Person person = it.next();
					System.out.println("이름 : " + person.getName());
					System.out.println("나이 : " + person.getAge());
					System.out.println("번호 : " + person.getTel());
				}
				break;
			case 4:
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("잘못된 선택입니다.");
				break;
			}

		}

	}

}
