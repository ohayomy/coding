package p15collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member>{ //�������̽��� �߰��ؼ� �ذ��Ѵ�.
	//���� ���� �ᵵ �ȴ�. ����� ��¦ �ٸ���.

	private int memberId;
	private String memberName;
	
	public Member() {}  // Comparator�� �������ؼ� ����Ʈ�������Լ��� �����ؼ�
						//treeSet �����Ҷ� ��ȣ�ȿ� �־����....
	
	public Member(int memberId, String memberName) {
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
	
	public String toString() {
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}
	
	
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}


	@Override
//	public int compareTo(Member member) {
//		return (this.memberId - member.memberId); //����� ���ϵǵ��� �ϸ� ��������
//		return (this.memberId - member.memberId)*(-1); //������ ���ϵǵ��� �ϸ� ���������̴�. �¿��� �ٲٰų� *(-1)�� �Ѵ�.
//	}
	
	public int compareTo(Member member) {
		return (this.memberName.compareTo(member.memberName)); //���ڴ� �⺻������ compareTo�� ���ǰ� �Ǿ������Ƿ� ����Ѵ�.�⺻������ ���������̴�.
//		return (this.memberName.compareTo(member.memberName))*(-1);
	}

	
	
	

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}
	//??�� �ڵ常���δ� �������� �ʾƼ� treeSet �����Ҷ� ��ȣ�ȿ� ����Ʈ�����ڸ� �־��־���
	
	
}
