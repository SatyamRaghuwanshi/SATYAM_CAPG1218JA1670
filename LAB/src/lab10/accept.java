package lab10;



import java.util.Scanner;

interface Ipredicate
{
	int accept(int num);
}
class Number
{
	public int accept(int num)
	{
		if(num==0)
			return 1;
		else
			return (num*accept(num-1));
	}
}
public class accept {

	private static Scanner s;

	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int pr=s.nextInt();
		Ipredicate p=new Number()::accept;
		System.out.println("accept of"+pr+":"+p.accept(pr));
	}
}
