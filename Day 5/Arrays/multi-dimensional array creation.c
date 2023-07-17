//multi-dimensional array creation

// C program to print elements of Three-Dimensional Array

#include <stdio.h>

int main(void)
{
	// initializing the 3-dimensional array
	int x[2][3][2] = { { { 0, 1 }, { 2, 3 }, { 4, 5 } },
					{ { 6, 7 }, { 8, 9 }, { 10, 11 } } };
					
		// output each element's value
	printf("\nprinting x\n");
	for (int i = 0; i < 2; ++i) {
		for (int j = 0; j < 3; ++j) {
			for (int k = 0; k < 2; ++k) {
				printf("Element at x[%i][%i][%i] = %d\n", i,
					j, k, x[i][j][k]);
			}
		}
	}
	
					
	int arr[2][3][4] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
                 11, 12, 13, 14, 15, 16, 17, 18, 19,
                 20, 21, 22, 23};

	// output each element's value
	printf("\nprinting arr\n");
	for (int i = 0; i < 2; ++i) {
		for (int j = 0; j < 3; ++j) {
			for (int k = 0; k < 2; ++k) {
				printf("Element at arr[%i][%i][%i] = %d\n", i,
					j, k, arr[i][j][k]);
			}
		}
	}
	
	
	int arr2[2][3][4];

    for (int i=0; i<2; i++) {
        for (int j=0; j<3; j++) {
            for (int k=0; k<4; k++) {
                arr2[i][j][k] = i+j+k ;
            }
        }
    }
    
    	// output each element's value
    printf("\nprinting arr2\n");
	for (int i = 0; i < 2; ++i) {
		for (int j = 0; j < 3; ++j) {
			for (int k = 0; k < 2; ++k) {
				printf("Element at x[%i][%i][%i] = %d\n", i,
					j, k, arr2[i][j][k]);
			}
		}
	}
	
	return (0);
}
