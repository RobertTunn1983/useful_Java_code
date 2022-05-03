import java.util.Scanner;

public class AsterixTriangle {

    public static void main (String[] args) {
        
        String stars = "";

        byte i = 0;     
        
        //Increasing triangle
        for (i = 0; i < 4; i ++) {
            
            stars += "*";
        
            System.out.println(stars);
        }    
        
        //Separate with a blank line 
        System.out.println("");
        
        
        //Commence decreasing triangle
        String asterix = "";       
        byte j = 7;
        byte k = 7;
        
        //Decreasing triangle
        for (j = 7; j > 0; j --) {
            
            asterix += "*";
            
            for (k = 7; k > 0; k --) {
                
            System.out.println(asterix);    
                
            }
            
            
            
            asterix = "";
        }
    }
}
