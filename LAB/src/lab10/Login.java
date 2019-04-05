package lab10;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

interface hell
{
	public boolean check(String u_name,String pass);
}
public class Login {

	private static Scanner s;

	public static void main(String[] args)
	{
		Map<String,String> m= new LinkedHashMap<String,String>();
		m.put("Satyam", "0031");
		m.put("Singh", "147");
		s = new Scanner(System.in);
		System.out.println("Username");
		String u_name=s.next();
		System.out.println("Password");
		String pass=s.next();
		hell ac=(a,b)->{if(m.containsKey(a)==true && m.containsValue(b)==true) {return true;}
		else {return false;}};
		System.out.println("Details are:"+" "+ac.check(u_name, pass));
	}
		
}


