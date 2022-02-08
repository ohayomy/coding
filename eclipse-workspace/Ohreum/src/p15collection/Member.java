package p15collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member>{ //인터페이스를 추가해서 해결한다.
	//둘중 무얼 써도 된다. 방식이 살짝 다르다.

	private int memberId;
	private String memberName;
	
	public Member() {}  // Comparator를 쓰기위해서 디폴트생성자함수를 정의해서
						//treeSet 정의할때 괄호안에 넣어줬다....
	
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
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
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
//		return (this.memberId - member.memberId); //양수가 리턴되도록 하면 오름차순
//		return (this.memberId - member.memberId)*(-1); //음수가 리턴되도록 하면 내림차순이다. 좌우항 바꾸거나 *(-1)을 한다.
//	}
	
	public int compareTo(Member member) {
		return (this.memberName.compareTo(member.memberName)); //글자는 기본적으로 compareTo가 정의가 되어있으므로 사용한다.기본적으로 오름차순이다.
//		return (this.memberName.compareTo(member.memberName))*(-1);
	}

	
	
	

	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}
	//??이 코드만으로는 동작하지 않아서 treeSet 정의할때 괄호안에 디폴트생성자를 넣어주었다
	
	
}
