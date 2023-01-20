package chapter17.hashset;

import chapter17.Member2;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member2 member1 = new Member2(1000,"윤영훈"); 
		Member2 member2 = new Member2(1001,"영훈"); 
		Member2 member3 = new Member2(1002,"윤훈"); 
		Member2 member4 = new Member2(1003,"윤"); 
		
//		memberLinkedList.showAllMember();
		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		memberHashSet.addMember(member4);
		
		
		memberHashSet.showAllMember();
		// 방법1
		Member2 member5 = new Member2(1003,"윤"); 
		memberHashSet.addMember(member5);
		memberHashSet.showAllMember();
		
		//방법 2
		Member2 member6 = new Member2(1004,"윤"); 
		memberHashSet.addMember(member6);
		memberHashSet.showAllMember();
		
	}
}
