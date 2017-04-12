#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
	int sum_of_sqrs=0;
	int sqr_of_sum=0;
	int dif;
	for(int i=1; i<=100; i++){
		sum_of_sqrs += i*i;
		sqr_of_sum += i;
	}
	sqr_of_sum *= sqr_of_sum;
	dif = sum_of_sqrs - sqr_of_sum;
	dif < 0 ? dif*=-1 : dif;
	cout<<"the difference is: "<<dif<<endl;
return 0;
}