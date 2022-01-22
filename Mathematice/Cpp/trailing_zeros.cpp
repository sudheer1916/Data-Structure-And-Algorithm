#include<iostream>
using namespace std;

int zeros(int x){
	int res=0;
	int count=0;
	for(int i=5;i<=x;i=i*5){
		res = res+(x/i);
		count ++;
	}
	return res;
	cout<<count;
}
int main(){
	int x;
	cout<<"enter a number ";
	cin>>x;
	cout<<zeros(x);
}

