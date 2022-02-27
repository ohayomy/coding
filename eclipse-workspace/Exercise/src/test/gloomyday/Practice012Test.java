package gloomyday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Practice012Test {

	@Test
	void testNumPlace() {
		assertEquals(1, Practice012.numPlace(1));
		assertEquals(3, Practice012.numPlace(232));
		assertEquals(5, Practice012.numPlace(13451));
		assertEquals(8, Practice012.numPlace(12353453));
		assertEquals(10, Practice012.numPlace(2000000000));
	}

	@Test
	void testChangeTen() {
		assertEquals(10, Practice012.changeTen(1));
		assertEquals(1000, Practice012.changeTen(3));
		assertEquals(10000000, Practice012.changeTen(7));
		assertEquals(1000000000, Practice012.changeTen(9));
	}

	@Test
	void testCountTarget() {
		assertEquals(3, Practice012.countTarget(77770, 77));
		assertEquals(3, Practice012.countTarget(1212123, 12));
		assertEquals(8, Practice012.countTarget(11111111, 1));
		assertEquals(2, Practice012.countTarget(456456, 456));
		assertEquals(4, Practice012.countTarget(1010101010, 101));
	}

	@Test
	void testCount() {
		assertEquals(31, Practice012.count(77770, 77780, 77));
		assertEquals(3118, Practice012.count(0, 77780, 77));
		assertEquals(4000, Practice012.count(100, 10000000, 1000));
	}

}
