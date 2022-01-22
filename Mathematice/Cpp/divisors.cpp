#include<iostream>
using namespace std;
int divisor(int x){
	for(int i=1;i<=x;i++){
		if(x%i == 0)
		cout<<i<<" ";
	}
}
int main(){
	cout<<"enter a numbers "<<endl;
	int x;
	cin>>x;
	divisor(x);
}
