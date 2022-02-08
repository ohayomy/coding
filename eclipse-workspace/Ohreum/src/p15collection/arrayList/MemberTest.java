package p15collection.arrayList;

import p15collection.Member;

public class MemberTest {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberKang = new Member(103, "������");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		
		memberArrayList.showAll();
		
		memberArrayList.removeMember(memberKim.getMemberId());
		
		memberArrayList.showAll();
	}

}
