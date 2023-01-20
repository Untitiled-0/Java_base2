package chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member;

public class MemberLinkedList {

	private LinkedList<Member> linkedList;

	// 생성자를 통한 LinkedList 객체 생성
	public MemberLinkedList() {
		linkedList = new LinkedList<>();
	}

	// add
	public void addMember(Member member) {
		linkedList.add(member);
	}

	// remove
	public boolean removeMember(int memberId) {
		Iterator<Member> it = linkedList.iterator();
		while (it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemberId();
			if(linkedList.isEmpty()) {
				System.out.println("회원이 존재하지 않습니다.");
			}else {
				
				if (tempId == memberId) {
					linkedList.remove(member);
					return true;
				} else {
					System.out.println(member.getMemberName()+"이라는 회원은 존재하지 않습니다.");
				}
			}
		}
		return false;
	}

	// showAll
	public void showAllMember() {
		for (Member m : linkedList) {
			System.out.println(m);
		}
		System.out.println();
	}
}
