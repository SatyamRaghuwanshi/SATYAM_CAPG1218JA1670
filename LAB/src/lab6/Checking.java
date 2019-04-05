package lab6;

public class Checking {
	public boolean acceptString(String str)
	{
		str=str.toUpperCase();
		char c[]=str.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Checking check=new Checking();
		//System.out.println(check.acceptString("ANT"));
		if(check.acceptString("SaTyaM"))
				{
			System.out.println("The String is a Positive String");
				}
		else
		{
			System.out.println("The String is a Negative String");
		}
			
	}
}
