package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter17.Member;

public class MemberArrayList {

	// ArrayList 선언 (arrayList)
	private ArrayList<Member> arrayList;
	public MemberArrayList() {
		
		// heap생성
		arrayList = new ArrayList<>();
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> it=arrayList.iterator();
//		it = arrayList.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
