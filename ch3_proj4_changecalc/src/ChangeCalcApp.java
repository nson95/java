import java.util.Scanner;


public class ChangeCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter number of cents (0-99):  ");
		int cent = sc.nextInt();
		
		
		int q = 0;
		int d = 0;
		int n = 0;
		int p = 0;
		
		
		
		if (cent-25>=0) {
			cent = cent-25;
			q = q+1;
		} else if (cent-10>=0) {
			cent = cent-10;
			d = d+1;
		} else if (cent-5>=0) {
			cent = cent-5;
			n = n+1;
		} else if (cent-1>=0) {
			cent = cent-1;
			p = p+1;
		} else 
		
			
		
			
		
		
			System.out.println();
		sc.close();
		System.out.println("goodbye!");
			
				
		}
 		
}
		
		
		
		
		
		



