import java.util.Scanner;

public class ArithmeticSequence {
        
    public static void main (String[] args) {
        
        //Variables in calculation
        short value, increase, output;
        //Counter
        short i = 0;
        //Variable for the nth term
        short n;
        
        //Gather user defined variables
        //The starting value
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the staring value of the arithmetic"
                + " sequence");
        value = keyboard.nextShort();
        
        //The increase per step of sequence
        System.out.println("Please enter the increase per step of the"
                + " arithmetic sequence");
        increase = keyboard.nextShort();

        //The nth term
        System.out.println("Please enter the desired nth term of the arithmetic"
                + " sequence");
        n = keyboard.nextShort();
        
        //System.out.println();
        //System.out.println(value);
        
        for (i = 0; i < n; i ++) {
            
            output = value;
        
            output += increase;
           
            //System.out.println(output);
            
            value = output;
        }
    
        System.out.println();
        System.out.print("Term number " + n + " of the arithmetic sequence is: "
               + value);
    }
}