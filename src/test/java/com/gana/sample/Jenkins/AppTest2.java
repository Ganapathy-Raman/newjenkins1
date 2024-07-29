package com.gana.sample.Jenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest2 {

	@Test
	void testCompare() {
		assertEquals(true,add.Compare("Gana","Gana"));
	}
	
	@Test
	void testCompare1() {
		assertEquals(false,add.Compare("GANA","Gana"));
	}

}
