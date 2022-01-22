//euclidean algorithm
#include<iostream>
using namespace std;
int gcd1(int x,int y){
	while(x!=y){
		if(x>y)
		x=x-y;
		else
		y=y-x;
	}
	return x;
}

int main(){
	cout<<"enter a numbers "<<endl;
	int x,y;
	cin>>x;
	cin>>y;
	cout<<gcd1(x,y);
}
