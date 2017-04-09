#include <stdio.h>

int main()
{
	int array[21]; //where I will not be making use of array[0]
	int i;
	int j;
	int sum=1;
	for(i=0; i<=20; i++)
		array[i] = i;
	for(i=2; i<=20; i++)
		for(j=1; j<i; j++)
			if(array[i] % array[j] == 0)
				array[i] = array[i] / array[j];
	for(i=1;i<=20;i++){		
		sum*=array[i];
		printf("array[%d] = %d \n", i, array[i]);
	}
	printf("total sum = %d \n", sum);
return 0;
}