package chapter17.linkedlist;

import chapter17.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		
		Member member1 = new Member(1000,"윤영훈"); 
		
//		memberLinkedList.showAllMember();
		memberLinkedList.addMember(member1);
		
		
		memberLinkedList.removeMember(10001);
		memberLinkedList.showAllMember();
		
		
	}
}
