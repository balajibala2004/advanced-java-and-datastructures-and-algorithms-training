Write a program to print alternate numbers starting from 0 to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100

public class DisplayEvenNumbers 
{  
public static void main(String args[])   
{  
int number=100;  
System.out.print("List of even numbers from 1 to "+number+": ");  
for (int i=0; i<=number; i++)   
{  
//logic to check if the number is even or not  
//if i%2 is equal to zero, the number is even  
if (i%2==0)   
{  
System.out.print(i + " ");  
}  
}  
}  
}  
