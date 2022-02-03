package p15Collection.hashSet;

import p15Collection.Member;

public class MemberTest {
	
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberKang = new Member(103, "������");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		memberHashSet.showAll();
		
		memberHashSet.removeMember(memberKim.getMemberId());
		
		memberHashSet.showAll();
		
		Member memberLee2 = new Member(101, "�̸���"); //���̵� �������� �����Ͱ� �Էµȴ�.�̷��� �ȵǹǷ�, ������ �ߴ� �����Ǹ� ���ؼ�
		memberHashSet.addMember(memberLee2);        //equals�� hashCode�� �������ؼ� ���̵� ������ ���� ������ ����� �ϵ��� ���ְڴ�.
		memberHashSet.showAll();
		
	}
}
