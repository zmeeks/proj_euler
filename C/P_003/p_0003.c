#include <stdio.h>

int main()
{
	long long int num = 600851475143;
	long long int count = 1;
	long long int new_num;
	int bool = 0;
	while(count +=2){
		if(num % count == 0){
			num = num / count;
			printf("num = %lld, count = %lld \n", num, count);
		}
		if(count > num)
			break;
	}
return 0;
}