#include<iostream>
using namespace std;
//O(sqrt(n))
//unsorted divisors
int divisor(int x){
	for(int i=1;i*i<=x;i++){
		if(x%i == 0)
		{
			cout<<i<<" ";
			if(i!=x/i)
			cout<<(x/i)<<" ";
		}
		
	}
}
int main(){
	cout<<"enter a numbers "<<endl;
	int x;
	cin>>x;
	divisor(x);
}
