// optimised euclidean algorithm
#include<iostream>
using namespace std;

int gcd(int a,int b){
	if(b==0)
	return a;
	else
	gcd(b,a%b);
}
int main(){
	cout<<"enter a numbers "<<endl;
	int x,y;
	
	if(cin>>x && cin>>y){
		cout<<gcd(x,y)<<endl;
	}
	else
	return 0;
}
