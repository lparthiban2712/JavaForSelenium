package java_programs;

public class ConstructorOverloading {

	ConstructorOverloading(){
		System.out.println("default constructor");
	}
	
	ConstructorOverloading(int a){
		System.out.println("constructor with parameter a");
	}
	
	ConstructorOverloading(int a, int b){
		System.out.println("constructor with parameter a and b");
	}
	
	public static void main(String[] args)
	{
		ConstructorOverloading co=new ConstructorOverloading();
		ConstructorOverloading co2=new ConstructorOverloading(2);
		
	}
}
