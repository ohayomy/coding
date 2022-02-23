package gloomyday;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Practice008Test {

	@Test
	void testNumberWithSign() {
		assertEquals(-16, Practice008.numberWithSign(16));
		assertEquals(24, Practice008.numberWithSign(24));
		assertEquals(17, Practice008.numberWithSign(17));
		assertEquals(-100, Practice008.numberWithSign(100));
	}

	@Test
	void testSum() {
		assertEquals(43, Practice008.sum(13, 17));
		assertEquals(52, Practice008.sum(24, 27));
	}

}
