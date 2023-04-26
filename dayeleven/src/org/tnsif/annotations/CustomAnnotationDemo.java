package org.tnsif.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//custom annotation with multi-value annotation
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface Custom{
	//abstract method
	String print() default "Dhanashri";
	int speed() default 80;
	float salary() default 75000.50f;
}
class CustomAnnotationClass{
	@Custom(print="Hello Guys",speed=50,salary=45000f)
	public void display()
	{
		System.out.println("Hurrah!Its Sunday and its Funnnnnnn day");
	}
}
public class CustomAnnotationDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		CustomAnnotationClass c=new CustomAnnotationClass();
		c.display();
		Method m=c.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.salary());
		System.out.println(obj.speed());
	}

}