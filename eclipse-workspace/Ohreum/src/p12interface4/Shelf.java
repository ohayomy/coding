package p12interface4;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; //protected를 주기 위해 따로선언한 것 같다.
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
}
