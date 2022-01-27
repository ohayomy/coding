package p14generic2;
import java.util.*;

class Product {}
class Tv extends Product{}
class Audio extends Product {}

public class GenericTest {
	
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv>		tvList = new ArrayList<Tv>();
//		ArrayList<Product>	tvList = new ArrayList<Tv>(); // ����
//		List<Tv>			tvList = new ArrayList<Tv>(); // OK. ������
		
		productList.add(new Tv());  //public boolean add(Product e) { ���ȴ�.
		productList.add(new Audio());
		
		tvList.add(new Tv()); //public boolean add(Tv e) {
		tvList.add(new Tv());
//		tvList.add(new Audio()); //����
		
		printAll(productList);
//		printAll(tvList); //������ ������ �߻��Ѵ�.
		
	}

	private static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
		
	}
}
