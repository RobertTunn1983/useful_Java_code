import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character and you will be given ASCII "
                + "value:");

        //Note code used to catch first character of string, further chars
        //are disregarded 
        char ch = sc.next().charAt(0);
        int ascii = ch;
        
        
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}