#include<iostream>
using namespace std;
//O(n*sqrt(n))
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

int printprime(int n){
	for(int i=2;i<=n;i++){
		if(isprime(i))
		cout<<i<<" ";
	}
}

int main(){
	cout<<"enter a number "<<endl;
	int a;
	cin>>a;
	printprime(a);
}
