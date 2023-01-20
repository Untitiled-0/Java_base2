package chapter18.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import chapter17.treeset.Member3;

public class MemberTreeMap {

	private TreeMap<Integer, String> treeMap;

	public MemberTreeMap() {
		treeMap = new TreeMap<>();
	}

	public void addMember(Member3 member) {
		treeMap.put(member.getMemberId(), member.getMemberName());
	}

	public boolean removeMember(int memberId) {
		
		while (treeMap.containsKey(memberId)) {
			
			treeMap.remove(memberId);
				return true;
		} 
			System.out.println(" 회원은 존재하지 않습니다.");
			return false;
	}	
	public void showAllMember() {
		Iterator<Integer> it = treeMap.keySet().iterator();
		while(it.hasNext()) {
			int key =it.next();
			String member= treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
			
}
