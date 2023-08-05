package interfaceexample;

class B implements A {

	@Override
	public void demo() {
		System.out.println("demo method");
		
	}

	@Override
	public void fun() {
		System.out.println("fun method");
		
	}
	
	public static void main(String[] args)
	{
		B ob=new B();
		ob.demo();
		ob.fun();
		System.out.println(ob.a);
		A.smethod();
		
	}

	
}
