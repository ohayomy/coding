package practice;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Practice001Test {
	@Test
	void testPlus() {
		assertEquals(8, Practice001.plus(2,3));
		assertEquals(16, Practice001.plus(2,4));
		assertEquals(32, Practice001.plus(2,5));
	}
}
