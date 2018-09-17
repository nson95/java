

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        

        while (choice.equalsIgnoreCase("y")) {
        System.out.print("Enter first, middle and last name: ");
        String name = sc.nextLine();
        name=name.trim();
        int fn = name.indexOf(" ");
        if (fn==-1) {
        	System.out.println("Invalid, please enter a full name.");
        } else {
        	int mn = name.indexOf(" ", fn+1);
        	if (mn==-1) {
        		String firstName =name.substring(0, fn);
        		String lastName =name.substring(fn+1, mn);
        		System.out.println("First name: " +firstName);
        		System.out.println("Last name: " +lastName);
        	} else {
        		int ln = name.indexOf(" ", mn+1);
        		if (ln==-1) {
        		String firstName = name.substring(0, fn);
        		String middleName = name.substring(fn+1, mn);
        		String lastName = name.substring(mn+1, name.length());
        		System.out.println("First name: " +firstName);
        		System.out.println("Middle name: " +middleName);
        		System.out.println("Last name: " +lastName);
        		} else {
        			System.out.println("Invalid Entry, please retry.");
        		}
        	}
        	
        	} System.out.println("continue? (y/n) ");
        	choice = sc.next();
        		
        	}
        } 
        	
    }
    
