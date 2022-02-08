package p15collection.arrayList;

import p15collection.Member;

public class MemberTest {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberKang = new Member(103, "강감찬");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(memberKim.getMemberId());
		
		memberArrayList.showAll();
	}

}
