package p2classAndObject;

public class P5ConstructorFunction {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	

	public P5ConstructorFunction() {}
//	1���� ����Ʈ�� �������Լ�
	
	public P5ConstructorFunction(int id, String name) {
		studentID = id;
		studentName = name;
//  2��° �������Լ�
	

		P5ConstructorFunction studentLee = new P5ConstructorFunction();
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "����";
		
//		P5ConstructorFunction studentLee = new P5ConstructorFunction(100, "�̼���");
//		studentLee.address = "����";
}
}
//�ڹ� �����Ϸ��� �⺻������ Ŭ�����̸��� �� ������ �Լ��� �����. �̴� ����ڰ� �ƹ��� ������ �Լ��� �������� �ʾ��� ��  ����� ����Ʈ�������̸�, �Ű������� ���� �����ڵ嵵 ����.
//2���� ������ �Լ��� ������µ�, �Ʒ����� �Ű������� �ִ�. 2��°�� �ƿ� �������� �ʾҴٸ� �����Ϸ����� �⺻������ 1��°ó�� ����Ʈ�����ڸ� ���������, 2��°�� �����Ѵٸ� 1��°�� �������. ���� �Ʒ� ǥ���Ŀ����� �Ű������� �� �־��༭ ������ �� ���̴�.
//�� �Ʒ� �ּ�ó�� �Ű������� �־��ִ���, �Ű������� ��� �Ǵ� ����Ʈ�� �������Լ��� ���Ѵٸ� �Ѵ� �Է����ָ� �ȴ�. �� ��, �ʿ信 ���� ������ �߰��ϴ� ��� �������� �����ڰ� �ϳ��� Ŭ������ �ְ� �Ǵµ� �̸� ������ �����ε��� �θ���.

