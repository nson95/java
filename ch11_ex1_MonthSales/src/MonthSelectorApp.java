import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays


        // get currency formatting
        
        
        
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
        	String months[] = new String[12];
        	months[0] = "January";
        	months[1] = "February";
        	months[2] = "March";
        	months[3] = "April";
        	months[4] = "May";
        	months[5] = "June";
        	months[6] = "July";
        	months[7] = "August";
        	months[8] = "September";
        	months[9] = "October";
        	months[10] = "November";
        	months[11] = "December";
        	double monthSales[] = {191.88, 72398.2, 72930.2, 63294.2, 382422.2, 247193.7, 
        			46238.4, 93472.3, 3802938.4, 829381.7, 724934.75, 82461.24};
        	int monthNumber = Console.getInt("Enter month number: ");
        	for (int i = 0; i < months.length; i++) {
        		
        		NumberFormat currency = NumberFormat.getCurrencyInstance();
        		
        		
        		
        		System.out.println("Sales for " +months[monthNumber-1] +": " +currency.format(monthSales[monthNumber-1]));
        		
        		
        	
        		
        		
        		
            
        		choice = Console.getString("Continue? (y/n): ");
        		Console.displayLine();
        	
            
            
            // validate input
         if (monthNumber < 1 || monthNumber > months.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales            


            // check if the user wants to continue
        }
        
        // display the total sales for the year
        
        
        Console.displayLine();
    }    

    }
    
}
