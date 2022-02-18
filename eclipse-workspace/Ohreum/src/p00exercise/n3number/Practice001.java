package p00exercise.n3number;

public class Practice001 {
	
	public int numberPlace(int num) {
		int place = 0;
		while(num != 0) {
			num /= 10;
			place++;
		}
		return place;
	}
	
	public void countTarget(int startPlace, int endPlace, int target) {
		 
	}
	
}
