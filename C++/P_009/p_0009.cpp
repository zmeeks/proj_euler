#include <iostream>
#include <cstdlib>
#include <cmath>

using namespace std;

int main()
{
	int hypotnuse;
	int lhs;
	int array[501];
	for(int i=0; i <= 500; i++)
		array[i] = i*i;		
	for(int i=2; i<=500; i++)
		for(int j=1; j<i; j++){
			lhs = array[i] + array[j];	//lhs = left hand side
			hypotnuse = (int)sqrt(lhs);
			lhs % hypotnuse == 0 ? hypotnuse : hypotnuse = 0;
			if(i + j + hypotnuse == 1000){
				cout<<"the product of "<<i<<", "<<j<<", and "<<hypotnuse<<" is: "<<i*j*hypotnuse<<endl;
				return 0;
			}
		}
return 0;
}