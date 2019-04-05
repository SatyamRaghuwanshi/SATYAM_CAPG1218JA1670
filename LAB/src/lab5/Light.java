package lab5;

import java.util.Scanner;
class Light{
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		
		System.out.println("Please Enter your choice :");

		String choice =  scan.nextLine();

		switch(choice){
			case "red":
			System.out.println("stop");
			break;
			case "yellow":
			System.out.println("ready");
			break;
			case "green":
			System.out.println("go");
			break;
			default:
			System.out.println("No Match Found");
		}
	}
}