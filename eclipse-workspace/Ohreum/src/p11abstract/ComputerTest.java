package p11abstract;

public class ComputerTest {
	public static void main(String[] args) {
		
//		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();
		Computer c4 = new YourNoteBook();
		
		//추상클래스는 불가.
		Computer c5 =  new YourNoteBook();
		NoteBook c6 =  new YourNoteBook();
		
		c6.aaa();
		c2.display();
		c4.display();
		
		
	}
}
