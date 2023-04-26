package org.tnsif.junit;

import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestDemo {

	//@Test
	@RepeatedTest(5)
	void test() {
		System.out.println("Repeated Test annotation");
	}

}