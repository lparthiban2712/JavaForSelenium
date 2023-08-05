package frequently_asked_java_programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ElementFindArray {
	
	public static void main(String[] args)
	{
	
	List<String>elements=Arrays.asList("Apple","Mango","orange");
	boolean flag=false;
	
//	for(String element:elements)
//	{
//		if(element.equals("Lemon"))
//		{
//			flag=true;
//			break;
//		}
//	}
//	
//	if(flag==true)
//	{
//		System.out.println("Element is found");
//	}
//	else
//	{
//		System.out.println("Element is not found");
//	}
	
	Predicate<String>pr=e->e.equalsIgnoreCase("Orange");
	
	for(String element:elements)
	{
		if(pr.test(element))
		{
			flag=true;
			break;
		}
	}
	
	if(flag==true)
	{
		System.out.println("Element is found");
	}
	else
	{
		System.out.println("Element is not found");
	}

}
}
