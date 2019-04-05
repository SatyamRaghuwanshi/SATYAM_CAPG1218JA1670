package lab5;

import java.util.Scanner;
public class Prompt {
	public void prime(int n)
	{
		int count=0;
		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count<=1)
			{
				System.out.println(i+" ");
			}
			count=0;
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		Prompt Prompt=new Prompt();
		Prompt.prime(no);
	}
}

