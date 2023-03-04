package org.tnsif.streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//program to demonstrate on reduce function
public class ReduceDemo {

	public static void main(String[] args) {
		System.out.println("The addition is :");
		List<Integer>obj=Arrays.asList(12,4,87,113);
		Optional<Integer>obj1=obj.stream().reduce((a,b)->(a+b));
		if(obj1.isPresent())
		{
			System.out.println(obj1.get());
		}
	}
}

/*OUTPUT
The addition is :
216
*/