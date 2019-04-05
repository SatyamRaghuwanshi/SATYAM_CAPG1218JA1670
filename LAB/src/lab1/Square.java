package classes;

public class Square {

	int a,sum=0,sum1=0,sum2=0;
	 int calculatedifference(int n) {
		for(int i=0;i<=n;i++) {
			sum=sum+(i*i);
			sum1=sum1+i;
			sum2=sum1*sum1;
		}
	
	return (sum-sum2);
	 }
	public static void main(String ar[]) {
		Square b=new Square();
		System.out.println(b.calculatedifference(2));
	}
}
