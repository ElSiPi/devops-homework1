package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoxTest {
	
	Box box = new Box("Large", "Yellow", 1300, 12.99);
	Box emptyBox = new Box("", "", -27, -6.99);	
	
	@Test
	void testPositiveParams() {

		assertEquals("Large", box.getSize());
		assertEquals("Yellow", box.getColour());
		assertEquals(1300, box.getVolume());
		assertEquals(12.99, box.getPrice());
	}

	@Test
	void testEmptyParams() {

		assertNotEquals("", emptyBox.getSize());
		assertEquals("Unknown", emptyBox.getSize());
		assertNotEquals("", emptyBox.getColour());
		assertEquals("Unknown", emptyBox.getColour());
	}

	@Test
	void testNegativeParams() {

		assertNotEquals(-27, emptyBox.getVolume());
		assertEquals(0, emptyBox.getVolume());
		assertNotEquals(-6.99, emptyBox.getPrice());
		assertEquals(0, emptyBox.getPrice());
	}

	@Test
	void testCompereVolumes() {

		assertTrue(box.compareVolumes(500));
		assertFalse(box.compareVolumes(1500));
	}

}
