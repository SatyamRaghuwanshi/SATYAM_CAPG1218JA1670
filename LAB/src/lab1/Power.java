package classes;

public class Power {

	int n,b;
	boolean flag=false;
	boolean checknumber(int n)
	{
		for(int i=0;i<=100;i++) {
			if(n==(int)Math.pow(2, i)) {
				flag=true;
				break;
			}
		}
			
		return flag;
		
	}
	public static void main(String ar[]) {
		Power p=new Power();
		System.out.println(p.checknumber(16));
}}
