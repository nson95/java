import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;


public class TestScoreApp {

    public static void main(String[] args) {
        // display operational messages
        System.out.println("Enter test scores that range from 0 to 100.");
        System.out.println("To end the program, enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 100;
        
        // get a series of test scores from the user
        while (testScore != 999)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();
            

            // accumulate score count and score total
            if (testScore <= 100)
            {
                scoreCount ++;
                scoreTotal += testScore;
                min = Math.min(testScore, min);
                max = Math.max(testScore, max);
            }
            else if (testScore != 999) 
                System.out.println("Invalid entry, not counted");
        }

        // display the score count, score total, and average score
        //double averageScore = (double) scoreTotal / scoreCount;
        //double averageScore = (double) Math.round((scoreTotal / scoreCount)*10) /10;
        BigDecimal st = new BigDecimal(scoreTotal);
        BigDecimal scc = new BigDecimal(scoreCount);
        BigDecimal averageScoreBD = st.divide(scc).setScale(2, RoundingMode.HALF_EVEN);
        double averageScore = averageScoreBD.doubleValue();
        		
        
        String message = "\n"
                + "Score count:   " + scoreCount + "\n"
                + "Score total:   " + scoreTotal + "\n"
                + "Average score: " + averageScore + "\n"
        	    + "Max score: " + max + "\n"
        	    + "Min score: " + min +"\n";
        	    
        System.out.println(message);
    }
}