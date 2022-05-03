public class ArraySorter {
    
    public static void main (String[] args) {
        
        int firstArray [] = {0,1,2,3,4};
        
        //Cannot just print out an array to console, must specify the elements
        //and use a loop
        
        int i;
        for (i = 0; i < firstArray.length; i++) {
        
            System.out.print(firstArray[i]);
        }
        
        //Print blank line as spacer
        System.out.println();
        
        //Create empty array of length 5
        int [] secondArray = new int [5];
        
        secondArray[0] = firstArray[4];
        secondArray[1] = firstArray[3];
        secondArray[2] = firstArray[2];
        secondArray[3] = firstArray[1];
        secondArray[4] = firstArray[0];
        
        int j;
        for (j = 0; j < secondArray.length; j++) {
        
            System.out.print(secondArray[j]);
        }
    }  
}
