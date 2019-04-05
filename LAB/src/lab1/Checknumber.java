package classes;

import java.util.Scanner;

public class Checknumber {

	public static void main(String ar[]) {
		  int num;
	       boolean flag = false;
	        
	       
	       Scanner scanner = new Scanner(System.in);
	        
	       
	       System.out.println("Enter a number : ");
	       num = scanner.nextInt();
	        
	       
	       int checknumber = num % 10;
	       num = num/10;
	        
	       
	       while(num>0){
	          
	           if(checknumber <= num % 10){
	               flag = true;
	               break;
	           }
	           checknumber = num % 10;
	           num = num/10;
	       }
	        
	      
	       if(flag){
	           System.out.println(" not in increasing order.");
	       }else{
	
	    	   System.out.println("increasing");
	       }
	}
	
}
