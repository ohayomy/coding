package p15collection.hashMap;

import p15collection.Member;

public class MemberTest {
	
	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(102, "�̼���");
		Member memberKim = new Member(101, "������");
		Member memberKang = new Member(103, "������");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(102);
		
		memberHashMap.showAllMember();
		
		
	}
}
