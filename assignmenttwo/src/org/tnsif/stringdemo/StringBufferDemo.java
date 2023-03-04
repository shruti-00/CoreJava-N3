package org.tnsif.stringdemo;
//program to demonstrate on string buffer
public class StringBufferDemo {
	public static void main(String args[])
	{
		//length vs capacity
		StringBuffer sb = new StringBuffer("Shruti");
		System.out.println(sb);
		//16 b y default +length of the string(6)=22
		System.out.println(sb.capacity());//if we are not passing any string so by default its 16
		System.out.println(sb.length());
		
		String str;
		int a =34;
		sb=new StringBuffer(40);
		str=sb.append(a).toString();
		System.out.println(str);
		System.out.println(sb);
		System.out.println(sb.reverse());	
	}
}

/*OUTPUT
22
6
34
34
43
*/
