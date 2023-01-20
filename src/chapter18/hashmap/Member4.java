package chapter18.hashmap;

import java.util.Comparator;

public class Member4 implements Comparator<Member4> {
	
	private int memberId;
	private String memberName;

	public Member4(String memberName, int memberId) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int compare(Member4 o1, Member4 o2) {
		
		return 0;
	}
	
//	@Override
//	public int compare(Member4 member1, Member4 member2) {
//		// TODO Auto-generated method stub
//		return (member1.memberId - member2.memberId);
//	}
	
	// 방법1 이름과 아이디 일치
	// 물리적 값
//	@Override
//	public int hashCode() {
//		
//		// memberName.hashCode() : String이므로 10진수
//		// return super.hashCode(); // 10진수 메모리주소
//		
//		return memberName.hashCode()+memberId;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Member2) {
//			Member2 member = (Member2) obj;
//			return member.memberName.equals(memberName) && (member.memberId==memberId);
//		}else {
//		return false;
//		}
//	}



	// 방법 2 아이디만 일치
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member4) {
			Member4 member = (Member4) obj;
			if (this.memberId == member.memberId)
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}


//	@Override
	// 오름차순
//	public int compareTo(Member3 member) {
//		// TODO Auto-generated method stub
//		return (this.memberId-member.memberId);
//	}
	// 내림차순
//	public int compareTo(Member3 member) {
//		// TODO Auto-generated method stub
//		return (this.memberId - member.memberId) * -1;
//	}

}
