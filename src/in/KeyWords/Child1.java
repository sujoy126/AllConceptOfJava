package in.KeyWords;

public class Child1 extends Parents{
	@Override
	public void m2(int num)
	{
		System.out.println("This is overiride m2 method. "+num);
	}
	public void m3()
	{
		System.out.println("This is Child class method.");
	}
}
