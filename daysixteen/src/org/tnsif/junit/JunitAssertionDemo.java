package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//program to demonstrate on assertion annotations
class JunitAssertionDemo {

	@Test
	void test() {
		//Fails when expected does not equal actual
		assertEquals(12,12);
	}
	@Test
	void display() {
		//Fails when expression is true
		assertFalse(12==1);
	}
}