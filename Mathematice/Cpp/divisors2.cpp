#include<iostream>
using namespace std;
//O(sqrt(n))
//sorted divisors
int divisor(int x){
	int i;
	for(i=1;i*i<x;i++){
		if(x%i == 0)
		{
			cout<<i<<" ";
		}
	}
	i--;
	for(;i>=1;i--){
		if(x%i==0)
		cout<<x/i<<" ";
	}
}
int main(){
	cout<<"enter a numbers "<<endl;
	int x;
	cin>>x;
	divisor(x);
}
