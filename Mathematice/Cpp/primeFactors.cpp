#include<iostream>
using namespace std;
//O(n^2*log(n))

bool isprime(int n)
	{
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

int primefactors(int x){
	
	for(int i=2;i<=x;i++){
		if (isprime(i)){
			int j=i;
			while(x%j == 0){
				cout<<i<<" ";
				j=j*i;
			}
		}
	}
}

int main(){
	cout<<"enter a numbers "<<endl;
	int x;
	cin>>x;
	primefactors(x);
} 
