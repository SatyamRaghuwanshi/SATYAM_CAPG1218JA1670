package lab8;
import java.io.File;
public class FileProgramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyDataThread cp=new CopyDataThread("E:\\hell.txt","E:\\how.txt");
				Thread t1=new Thread(cp,"1st");
				t1.start();
	}

}
