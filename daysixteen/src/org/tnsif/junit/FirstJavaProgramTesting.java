package org.tnsif.junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//program to demonstrate on first JUnit5 testing
class FirstJavaProgramTesting {

	@Test
	@DisplayName("SimpleJUnitTestingMethod")
	void test() {
		//fail("Not yet implemented");
		System.out.println("First JUnit Test case");
	}
	@Test
	void display() {
		//fail("Not yet implemented");
		System.out.println("Welcome to JUnit5 test");
	}


}