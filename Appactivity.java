package GItHub;
import java.util.Scanner;

public class Appactivity {
	public static void main(String[]args) {
		System.out.println("choose an option");
		System.out.println("1,2 or 3.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input==1) {
			int num1=scanner.nextInt();
			int num2=scanner.nextInt();
			System.out.println("addition"+addInt(num1+num2));
			}if (input==2) {
					int num1=scanner.nextInt();
					int num2=scanner.nextInt();
					System.out.println("multiplication"+multiplyInt(num1+num2));
					}if(input==3) {
						System.out.println("Exit");
			}else {
				System.out.println("invalid input");
			}
				
		
		
		
	}
	public static int addInt(int num1,int num2) {

	}
	public static int multiplyInt(int num1,int num2) {
	
	}
}
