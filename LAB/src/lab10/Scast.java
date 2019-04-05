package lab10;

interface qwr
{
	public void display(String s);
}
public class Scast {
	
	public static void main(String[] args)
	{
		qwr sp=(s)->{for(int i=0;i<s.length();i++) {System.out.print(s.charAt(i)+" ");}};
		sp.display("Satyam");
	}

}
