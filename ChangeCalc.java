//ROUNDING PROBLEMS STOPPING BELOW £1 FROM KICKING IN
import java.util.Scanner;

public class ChangeCalc {

    public static void main (String[] args) {
        
        double sum;
        double hunner, fifty, twenty, tenner, fiver, poundcoin, fiftypence,
                twentypence, tenpence, fivepence, twopence, penny;
        
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Please give a pecuniary amount in pounds sterling");
        
        sum = keyboard.nextDouble();
        
        System.out.println("You have entered £" + sum);
        System.out.println("The most efficient way of giving out this amount as"
                + " change is:");
                
        //Scottish £100's
        if (sum >= 100) {
            
            //Chop end off of sum then change to pecuniary amount in £100s
            hunner = ((sum - ((sum % 100))) / 100);
            System.out.println(hunner + " x £100 notes");
            
            //Update sum to reflect remainder to be divided
            sum = sum - (hunner * 100);
        }
        
        //Fiftys
        if (sum >= 50) {
            
            fifty = ((sum - ((sum % 50))) / 50);
            System.out.println(fifty + " x £50 notes");
        
            sum = sum - (fifty * 50);
        }
       
        //Twentys
        if (sum >= 20) {
            
            twenty = ((sum - ((sum % 20))) / 20);
            System.out.println(twenty + " x £20 notes");
        
            sum = sum - (twenty * 20);
        }        

        //Tenners
        if (sum >= 10) {
            
            tenner = ((sum - ((sum % 10))) / 10);
            System.out.println(tenner + " x £10 notes");
        
            sum = sum - (tenner * 10);
        }  

        //Fivers
        if (sum >= 5) {
            
            fiver = ((sum - ((sum % 5))) / 5);
            System.out.println(fiver + " x £5 notes");
        
            sum = sum - (fiver * 5);
        }  
        
        //Pound coins
        if (sum >= 1) {
            
            poundcoin = ((sum - ((sum % 1))) / 1);
            System.out.println(poundcoin + " x £1 coin(s)");
        
            sum = sum - (poundcoin * 1);
        }  
        
        //Fifty pence coins
        if (sum >= 0.5) {
            
            fiftypence = ((sum - ((sum % 0.5))) / 0.5);
            System.out.println(fiftypence+ " x £0.5 coin(s)");
        
            sum = sum - (fiftypence * 0.5);
        }
        
        //Twenty pence coins
        if (sum >= 0.2) {
            
            twentypence = ((sum - ((sum % 0.2))) / 0.2);
            System.out.println(twentypence + " x 20p coin(s)");
        
            sum = sum - (twentypence * 0.2);
        }
        
        //Ten pence coins
        if (sum >= 0.1) {
            
            tenpence = ((sum - ((sum % 0.1))) / 0.1);
            System.out.println(tenpence + " x 10p coin(s)");
        
            sum = sum - (tenpence * 0.1);
        }
                
                
        //Five pence coins
        if (sum >= 0.05) {
            
            fivepence = ((sum - ((sum % 0.05))) / 0.05);
            System.out.println(fivepence + " x 0.05p coin(s)");
        
            sum = sum - (fivepence * 0.05);
        }
        
                
        //Two pence coins
        if (sum >= 0.02) {
            
            twopence = ((sum - ((sum % 0.02))) / 0.02);
            System.out.println(twopence + " x 2p coin(s)");
        
            sum = sum - (twopence * 0.2);
        }
        
        System.out.println(sum);
        
        //Pennys
        if (sum >= 0.01) {
            
            penny = ((sum - ((sum % 0.01))) / 0.01);
            System.out.println(penny + " x 1p coin(s)");
        
            sum = sum - (penny * 0.01);
        }
    }
}
