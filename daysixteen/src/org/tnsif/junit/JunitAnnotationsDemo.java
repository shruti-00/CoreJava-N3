package org.tnsif.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)

class JunitAnnotationsDemo {

	@Test
	@DisplayName("SimpleJunitTestingMethod")
	void test() {
		System.out.println("First Junit test case");
	}
	@Test
	@BeforeAll
	/*if we make this method as static then we will not get
	 * method name in testing
	 * to overcome this we must have to use "@TestInstance(Lifecycle.PER_CLASS)
	 */
	void display() {
		System.out.println("Welcome to Junit5 testing");
	}
	@Test
	@AfterEach
	@Disabled
	void accept()
	{
		System.out.println("After Each method demo");
	}
}
