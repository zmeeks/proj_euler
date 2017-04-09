#include <stdio.h>

int main()
{
	int x_1 = 1;
	int x_2 = 2;
	int x_t;
	int i;
	int count = 0;
	while(x_2 < 4000000){
		count += x_2;
		for(i=0; i<3; i++){
			x_t = x_1;
			x_1 = x_2;
			x_2 = x_t + x_2;
		}
	}
	printf("the sum is = %d \n", count);
return 0;
}