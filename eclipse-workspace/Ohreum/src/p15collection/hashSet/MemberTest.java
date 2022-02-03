package p15Collection.hashSet;

import p15Collection.Member;

public class MemberTest {
	
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberKang = new Member(103, "강감찬");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		memberHashSet.showAll();
		
		memberHashSet.removeMember(memberKim.getMemberId());
		
		memberHashSet.showAll();
		
		Member memberLee2 = new Member(101, "이몽룡"); //아이디가 같은데도 데이터가 입력된다.이러면 안되므로, 저번에 했던 재정의를 통해서
		memberHashSet.addMember(memberLee2);        //equals와 hashCode를 재정의해서 아이디가 같으면 같은 데이터 취급을 하도록 해주겠다.
		memberHashSet.showAll();
		
	}
}
