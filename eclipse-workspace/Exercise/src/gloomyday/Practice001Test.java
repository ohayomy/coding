package gloomyday;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Practice001Test {

	@Test
	void numberPlaceTest() {
		assertEquals(1, Practice001.numberPlace(4));
		assertEquals(2, Practice001.numberPlace(44));
		assertEquals(3, Practice001.numberPlace(477));
		assertEquals(4, Practice001.numberPlace(9994));
		assertEquals(5, Practice001.numberPlace(12344));
		assertEquals(10, Practice001.numberPlace(2147483647));	//큰 수도 테스트 해줘야한다.
	}
	
	@Test
	void changeTenTest() {
		assertEquals(10, Practice001.changeTen(1));
		assertEquals(100, Practice001.changeTen(2));
		assertEquals(1000, Practice001.changeTen(3));
		assertEquals(10000, Practice001.changeTen(4));
		assertEquals(100000, Practice001.changeTen(5));
		assertEquals(1000000000, Practice001.changeTen(9));
	}
	
	@Test
	void countTargetTest() {
		assertEquals(1, Practice001.countTarget(4,4));
		assertEquals(6, Practice001.countTarget(444444, 4));
		assertEquals(3, Practice001.countTarget(477774, 77));
		assertEquals(3, Practice001.countTarget(949494,94));
		assertEquals(2, Practice001.countTarget(1231231,123));
	}
	
	@Test
	void countTest() {
		assertEquals(31, Practice001.count(77770,77780,77));
	}

}
