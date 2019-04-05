package lab5;

public class Fib {
	public boolean fibonocii(int a)
	{
		int temp=1;
		int temp1=1;
		int f;
		for(int i=0;i<=a;i++)
		{
			if(a==temp)
			{
				return true;
			}
			else
			{
				f=temp+temp1;
				temp=temp1;
				temp1=f;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		Fib Fib=new Fib();
		System.out.println(Fib.fibonocii(25));
	}
}

