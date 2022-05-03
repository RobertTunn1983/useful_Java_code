import java.util.Scanner;

public class AverageCalculator {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many values do you wish to take the average"
                + " of?");
        
        int noOfValues = sc.nextInt();                
        int i,j;

        for (i = 0; i < 1; i ++) {
            
            float total = 0;

            for (j = 1; j <= noOfValues; j ++) {
                
                System.out.println("Please enter next value:");
                
                float nextValue = sc.nextInt();
                
                total = total + nextValue;
            }

            System.out.println("The average of the " + noOfValues + 
                    " values that you inputted is: " + (total/noOfValues));
        }
    }
}
