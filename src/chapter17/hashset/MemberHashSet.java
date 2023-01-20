package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member2;

public class MemberHashSet {

	private HashSet<Member2> hashset;

	// 생성자를 통한 Hashset 객체 생성
	public MemberHashSet() {
		hashset = new HashSet<>();
	}

	// add
	public void addMember(Member2 member) {
		hashset.add(member);
	}

	// remove
	public boolean removeMember(int memberId) {
		Iterator<Member2> it = hashset.iterator();
		while (it.hasNext()) {
			Member2 member = it.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				hashset.remove(member);
				return true;
			} else {
					System.out.println(" 회원은 존재하지 않습니다.");
			}
		}
		return false;
	}

	// showAll
	public void showAllMember() {
		for (Member2 m : hashset) {
			System.out.println(m);
		}
		System.out.println();
	}
}
