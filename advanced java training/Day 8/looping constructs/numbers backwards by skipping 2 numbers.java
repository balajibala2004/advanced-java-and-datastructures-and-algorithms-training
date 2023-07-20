• Write a program to print numbers backwards from 100 to 1 by skipping 2 numbers i.e. 100 97 94 91 88 85
82 79. . . 22 19 16 13 10 7 4 1

import java.util.*;
 
class ABC{
 
// Recursive function to print from N to 1
static void PrintReverseOrder(int N)
{
 
    for (int i = N; i >= 0; i=i-2){
        System.out.print( +i + " ");
}
}
 
// Driver code
public static void main(String[] args)
{
    int N = 100;
 
    PrintReverseOrder(N);
}
}
 
