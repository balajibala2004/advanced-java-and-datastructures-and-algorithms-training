// Java Program to add elements in a pre-allocated Array  
import java.util.Arrays;  
public class myclass {  
        public static void main(String[] args) {  
            String[] sa = new String[7]; // Creating a new Array of Size 7  
            sa[0] = "B"; // Adding Array elements  
            sa[1] = "A";  
            sa[2] = "L";  
            sa[3] = "A";  
            sa[4] = "J";  
            System.out.println("Original Array Elements:" + Arrays.toString(sa));  
            int numberOfItems = 5;  
            String newItem = "I"; // Expanding Array Elements Later  
            String newItem2 ="v";  
            sa[numberOfItems++] = newItem;  
            sa[numberOfItems++] = newItem2;  
            System.out.println("Array after adding two elements:" +    
                      Arrays.toString(sa));  
        }  
    } 
