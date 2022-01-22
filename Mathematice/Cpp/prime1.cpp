#include<iostream>
using namespace std;

//efficient method 
//~O(1/3 of sqrt(n)) 

bool isprime(int n){
	if(n==1)
	return false;
	else if(n==2 || n==3)
	return true;
	else if(n%2==0 || n%3==0)
	return false;
	for(int i=5;i*i<=n;i=i+6){
		if(n%i==0 || n%(i+2)==0)
		return false;
	}
	return true;
} 

int main(){
	cout<<"1 --> prime number"<<endl;
	cout<<"0 --> non-prime number"<<endl;
	cout<<"enter a numbers "<<endl;
	int x;
	cin>>x;
	cout<<isprime(x);
} 
