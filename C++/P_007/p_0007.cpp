#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
	int number = 5;
	int array[10001];
	bool is_prime = 1; 	//default value
	int count = 2;		//note: using array[count] to place next prime
	array[0] = 2;
	array[1] = 3;
	while(count < 10001){
		for(int i= 1; i<count; i++){
			if(number % array[i] == 0){
				is_prime = 0;
				break;
			}
		}
		if(is_prime == 1){
			array[count] = number;
			count++;
		}
		else
			is_prime = 1; //setting back to default value
		number += 2;
	}
	cout<<"the 10001'th prime number is: "<<array[10000]<<endl;
return 0;
}