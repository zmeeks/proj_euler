#include <stdio.h>

int main()
{
	int array[1000];
	int i; 
	int count = 0;
	for(i=0; i<1000; i++)
		array[i] = 0;
	for(i=0; i<1000; i+=3)
		array[i] = 1;
	for(i=0; i<1000; i+=5)
		array[i] = 1;
	for(i=1; i<1000; i++)
		if(array[i] == 1)
			count += i;
	printf("the sum = %d \n", count);
return 0;
}
		
	