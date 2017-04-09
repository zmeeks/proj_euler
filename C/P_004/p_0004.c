#include <stdio.h>

int num_reverse(int num){
	/*note: this func is not robust--does not work on numbers larger than 999*/
	int h; //hundreds
	int t; //tens
	int d; //decimal
	d = num % 10;
	t = (num % 100)/10;
	h = num/100;
	return d*100 + t*10 + h;
}

int main()
{
	int i;
	int j;
	int k;
	int bool = 0; 
	int number;
	for(j=997; j>0; j--){
		number = j*1000 + num_reverse(j);
		for(i=999; i>=100; i--){
			if(number % i == 0 && (number/i) >= 100 && (number/i) < 1000){
				bool = 1;
				break;
			}
		}
		if(bool == 1)
			break;
	}
	printf("palindrome number = %d, num1 = %d, num2 = %d \n", number, i, number/i);
return 0;
}