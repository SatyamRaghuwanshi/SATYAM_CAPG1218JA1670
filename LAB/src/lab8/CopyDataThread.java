package lab8;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopyDataThread implements Runnable{
	
	private String  F1;
	private String F2;

	public CopyDataThread(String F1,String F2) {
		this.F1=F1;
		this.F2=F2;
	}
	public void run() {
		FileReader F;
		FileWriter F3;
		try{
			F=new FileReader(F1);
			F3=new FileWriter(F2,true);
			int value=0;
			int count=0;
			System.out.println("copy start");
			while((value=F.read())!=-1)
			{
				if(count<10) {
					count++;
					F3.write((char)value);
					F3.flush();
				}
				else {
					//F3.flush();
					count=0;
					System.out.println("copied");
					Thread.sleep(5000);
				}
																								
				}
			System.out.println("COMPLETED");
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
	
	
	

	

	
	
	