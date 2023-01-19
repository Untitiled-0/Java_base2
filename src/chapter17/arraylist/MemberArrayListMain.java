package chapter17.arraylist;


import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// 팀원들의 정보
		Member memberHCH = new Member(1000,"허초회");
		Member memberKCH = new Member(1001,"김찬희");
		Member memberJSM = new Member(1002,"전솔민");
		Member memberJYJ = new Member(1003,"정예주");
		Member memberLJM = new Member(1004,"이재민");
		Member memberYYH = new Member(1005,"윤영훈");
		
		// 외원가입
		memberArrayList.addMember(memberHCH);
		memberArrayList.addMember(memberKCH);
		memberArrayList.addMember(memberJSM);
		memberArrayList.addMember(memberJYJ);
		memberArrayList.addMember(memberLJM);
		memberArrayList.addMember(memberYYH);
		
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberLJM.getMemberId());
		memberArrayList.showAllMember();
		
	}
	
}
