#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

struct Node{
	int prime;
	Node *next;
};

Node* init_Node(int num){
	Node *node;
	node = new Node;
	node->prime = num;
	node->next = NULL;
	return node;
}

int main()
{	
	clock_t begin = clock();
	Node *tail;
	int tail_prime = 3;
	int count = 5; //starting at 3+=2 and going until 2-million
	int stopper; //to break from loop faster
	Node *head = init_Node(3);
	tail = head;
	Node *iter; //for iterating through linked list
	long long int sum = 0;
	while(count<2000000){
		iter = head;		
		stopper = tail_prime >> 1; //bitwise division
		while(iter->next != NULL){
			if(count % iter->prime == 0 || iter->prime > stopper){ 
				break;
			}
			else
				iter = iter->next;
		}
		if(iter->next == NULL ){
			iter->next = init_Node(count);
			tail_prime = count;
			tail = iter->next;
		}
		else if(iter->prime > stopper){
			iter = tail;
			iter->next = init_Node(count);
			tail_prime = count;
			tail = iter->next;
		}
		count += 2;
	}
	for(iter = head; ; iter = iter->next){
		sum += (long long)iter->prime;
		if(iter->next == NULL) break;
	}
	clock_t end = clock();
	cout<<"total sum = "<<sum+2<<endl;
	cout<<"total time = "<<double(end-begin)/CLOCKS_PER_SEC<<endl;
return 0;
} //note: OS will clean up the heap (OS will take care of deleting linked list)