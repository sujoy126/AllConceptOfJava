package in.Heiarical;


abstract class A{
	public abstract void m1();
}
class B extends A{
	@Override
	public void m1()
	{
		System.out.println("m1 completed in B class ");
	}
}
class C extends A{
	@Override
	public void m1()
	{
		System.out.println("m1 completed in C class");
	}
}
class Main_class3 {
	public static void main(String[]args) {
	B b1= new B();
	C c2= new C();
	b1.m1();
	c2.m1();
	}
}
