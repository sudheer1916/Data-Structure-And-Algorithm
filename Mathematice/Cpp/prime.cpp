//if x<y ,x*x<=n  so,x<sqrt(n)    -->basic idea
//O(sqrt(n))

#include<iostream>
using namespace std;
bool isprime(int n){
	if(n==1)
	return false;
	for(int i=2;i*i<=n;i++){
		
		if(n%i==0)
		return false;
		else
		return true;
	}
}
int main(){
	cout<<"1 --> prime number"<<endl;
	cout<<"0 --> non-prime number"<<endl;
	cout<<"enter a numbers "<<endl;
	int x;
	cin>>x;
	cout<<isprime(x);
} 
