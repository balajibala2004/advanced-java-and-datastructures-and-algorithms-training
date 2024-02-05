// String Reversal in c
#include <stdio.h>
#include <string.h>


int main() {
    // Write C code here
    char inp[100];
    fgets(inp , sizeof(inp) , stdin);
    int start = 0;
    int length = strlen(inp);
    int end = length-1;
    
    while(start < end)
    {
        char temp = inp[start];
        inp[start] = inp[end];
        inp[end] = temp;
        start ++;
        end --;
    }
    printf("reversed string : %s\n" , inp) ;
    return 0;
}
