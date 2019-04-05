package lab6;

import java.util.Scanner;

class Job
{
	private StringBuffer userName;

	public StringBuffer getUserName() {
		return userName;
	}

	public boolean setUserName(StringBuffer userName) {
		
		if(userName.length()>8)
		{
			userName.append("_job");
			this.userName=userName;
			return true;
		}
		else
		{
			System.out.println("The username is less than 8 characters");
			return false;
		}
		
	}

	public Job(StringBuffer userName) {
		setUserName(userName);
	}

	public Job() {
		super();
	}
	
}
public class JobSeeker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job js=new Job();
		String str;
		System.out.println("username:");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(js.setUserName(sb));
		
	}

}
