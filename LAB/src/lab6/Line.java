package lab6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Line {
	public static void main(String args[])
	{
		File f=new File("E:\\hell.java");
		try {
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String str="";
			int count=1;
			while((str=br.readLine())!=null)
					{
						System.out.println(count+" "+str);
						count++;
					}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
