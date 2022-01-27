package p14generic;

public class PrinterTest {
	
	public static void main(String[] args) {
		
		Printer<Powder> printer = new Printer<Powder>();
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
//		Powder powder = (Powder)printer.getMaterial(); ���׸��� �������� �̷��� �ٲ�����Ѵ�.
		System.out.println(printer);
		//���׸�Ŭ������ �����ʰ� �Ŀ���� �ö�ƽ ��� ��밡���� Ŭ������ �����Ϸ���,
		//���� �ִ������� ������Ʈ�ۿ� �����Ƿ� ������Ʈ�� ���� Printer�� �ۼ��ؾ�������,
		//�ٽ� ����Ҷ��� �տ� (Powder)�� �ٿ��� �ٿ�ĳ���� �ؾ��Ѵ�.
		//���׸��� ���� �̿� ���� ���ŷο� ������ �����ȴ�.
		
		Printer<Plastic> printer2 = new Printer<Plastic>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		System.out.println(printer2);
		
		
//		Printer<Water> printer3 = new Printer<Water>();
//		printer3.setMaterial(new Water());
//		Water water = printer3.getMaterial();
//		System.out.println(printer3);
		
		//��ó�� Water�� ������ �ʴ� �Է°��ε� ���͵� ������ ������ ���� �ʴ´�.
		//���� �̸� �����ϱ� ���� ���ϴ� �Է°��鿡 ������ �� �� �ִ�.
		//���ϴ� �Է°��� �Ŀ��Ŭ������ �ö�ƽ Ŭ������ ����Ŭ���� MaterialŬ������ �����ϰ�
		//PrinterŬ������ �̸� ��ӹ޴� Ŭ�����鸸 ���� �� �ִٴ� �ǹ��� extends�� �߰��Ѵ�.
		//���׸��� extends�� �Ϲ����� extends�� �ٸ���.
		//������, ����Ŭ������ �����ϴ� �ͻӸ� �ƴ϶� �����������̽��� ����ص� �Ǵµ�,
		// �� ���� implements�� ����ϴ°��� �ƴ϶� extends�� ����ϱ� �����̴�.
		
		
		
	}
}
