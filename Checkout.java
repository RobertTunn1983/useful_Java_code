import java.util.*;

public class Checkout {
    
    public static void main (String args[]) {
        
        //Program for checkout which weighs different items
        double total = 0;
        double subT = 0;
        //Use string techniques on list array
        String[] list = new String[0];
                
        //Prompt for bag
        System.out.println("Welcome to ASDA. Do you require a bag? y/n");
        Scanner sc = new Scanner(System.in);
        String yninput = sc.nextLine();
        
        if (yninput.equals("y")) {
            System.out.println("That costs 10p");
            subT(subT, 0.1);
        }
        else if (yninput.equals("n")) {
            System.out.println("Good for you");
            subT(subT, 0);
        }
        else {
            System.out.println("Invalid response. Go back to beginning");
        }

        //Create short menu for weighing items
        boolean flag = true;
        int choice;
        double ppkg = 0;
        double weight = 0;
        String[] categories = {"(1) Fruit", "(2) Vegetables", "(3) Pick n Mix", 
            "(4) Go Back"};
        String[] fruit = {"(1) Bananas", "(2) Apples", "(3) Pears", 
            "(4) Go Back"};
        String[] veg = {"(1) Potatoes", "(2) Brussel Sprouts", "(3) Broccoli", 
            "(4) Go Back"};
        String[] pickNMix = {"(1) Sports Mix", "(2) Soor Plooms", 
            "(3) Millions", "(4) Go Back"};

        do {
        
        //Determine name of item
        System.out.println("Please choose a category: ");
        prArrStr(categories);
        
        System.out.println();
        int choice1 = sc.nextInt();
        
        //FRUIT
        if (choice1 == 1) {
            prArrStr(fruit);
            System.out.println("What type of Fruit?");
            int choice2 = sc.nextInt();
            //BANANAS
            if (choice2 == 1) {
                ppkg = 1.51;
                weight = genW();
                subT(ppkg,weight);
            }
            //APPLES
            else if (choice2 == 1) {
                ppkg = 2.53;
                weight = genW();
                subT(ppkg,weight);
            }
            //PEARS
            else if (choice2 == 1) {
                ppkg = 2.63;
                weight = genW();
                subT(ppkg,weight);
            }
            //GO BACK
            else if (choice2 == 4) {
                System.out.println("Your subtotal is: " + subT);
                flag = false;
            }
        }
        else if (choice1 == 2) {
            prArrStr(veg);
            System.out.println("What type of Vegetable?");
            int choice2 = sc.nextInt();
            //POTATOES
            if (choice2 == 1) {
                ppkg = 1.20;
                weight = genW();
                subT(ppkg,weight);
            }
            //BRUSSEL SPROUTS
            else if (choice2 == 1) {
                ppkg = 2.40;
                weight = genW();
                subT(ppkg,weight);
            }
            //BROCOLLI
            else if (choice2 == 1) {
                ppkg = 3.20;
                weight = genW();
                subT(ppkg,weight);
            }
            //GO BACK
            else if (choice2 == 4) {
                System.out.println("Your subtotal is: " + subT);
            flag = false;
            }
        }
        else if (choice1 == 3) {
            prArrStr(pickNMix);
            System.out.println("What type of Pick n Mix?");
            int choice2 = sc.nextInt();
            //SPORTS
            if (choice2 == 1) {
                ppkg = 1.20;
                weight = genW();
                subT(ppkg,weight);
            }
            //SOOR PLOOMS
            else if (choice2 == 1) {
                ppkg = 2.40;
                weight = genW();
                subT(ppkg,weight);
            }
            //MILLIONS
            else if (choice2 == 1) {
                ppkg = 3.20;
                weight = genW();
                subT(ppkg,weight);
            }
            //GO BACK
            else if (choice2 == 4) {
                System.out.println("Your subtotal is: " + subT);
            flag = false;
            }
        }
        else if (choice1 != 1 && choice1 != 2 && choice1 != 3) {
            System.out.println("Invalid choice, do you wish to continue?");
        }
        
        System.out.println("Please place next item on scale otherwise go to "
                + "payment");
        System.out.println("Pay now (0)");
        System.out.println("Next item (1)");
                
        int dec = sc.nextInt();
        
        if (dec == 0) {
            break;
        }
        
        
        
        } while (flag = true);
        
        
    }
    
    //Calculate subtotal
    public static double subT (double subt, double price) {
        
        double newSubt = subt + price;
        
        System.out.println();
        System.out.println("Your subtotal is : £" + newSubt);
        System.out.println();                
        
        return newSubt;
    }
    
    //Print an array of strings
    public static void prArrStr (String[] input) {
        
        System.out.println("Please choose from the following:");
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
        
    }
    
    //Generate random weight between 0.5kg and 3kg
    public static double genW () {
        
        double output = Math.random()*3;
        
        return output;
    }
}
