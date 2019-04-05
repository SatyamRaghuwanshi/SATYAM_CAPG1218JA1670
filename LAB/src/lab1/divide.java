package classes;

public class divide {
	static int sum=0;
	int calculatesum(int n) {
		for(int i=1;i<=n;i++) {
			if((i%3==0)||(i%5==0)) {
				sum=sum+i;
			}
	}
		return sum;
	}
	
	public static void main(String[] args) {
		
		divide a=new divide();
		System.out.println(a.calculatesum(15));
		
			
	}
}

