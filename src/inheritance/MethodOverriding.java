package inheritance;

class parent
{
 int a=3;
 static int b=5;
 public static String spfun()
 {
	 return "I am returning static pfunction";
 }
 
 public String nspfun()
 {
	 return "I am returning non static pfunction";
 }
 
 public String fun()
 {
	 return "I am returning parent fun function";
 }
}

class child extends parent
{
 int a=5;
 static int b=8;
 public static String spfun()
 {
	 return "I am returning static cfunction";
 }
 
 public String nspfun()
 {
	 return "I am returning non static cfunction";
 }
}


public class MethodOverriding {
	
	public static void main(String[] args)
	{
		
		/*
		 * child ch=new child(); System.out.println(ch.a); System.out.println(ch.b);
		 * System.out.println(ch.spfun()); System.out.println(ch.nspfun());
		 */
		 
		
		  parent p=new child(); System.out.println(p.a);
		  System.out.println(p.nspfun()); System.out.println(p.spfun());
		  System.out.println(p.fun());
		 
	}

}
