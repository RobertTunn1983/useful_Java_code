import java.util.Scanner;

public class BMI_Calc {
    
    public static void main (String[] args) 
    {
        double mass, height, BMI;
        
        Scanner keyboard = new Scanner(System.in); 
         
        System.out.println("Please enter your weight in kilogrammes");
        
        mass = keyboard.nextDouble();
        
        System.out.println("Please enter your height in metres");
        
        height = keyboard.nextDouble();
        
        BMI = mass / (height * height);
        
        System.out.println("Your calculated BMI is: " + BMI);
    }
}
