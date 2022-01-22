#include<iostream>
using namespace std;
//theta(log n)
int power(int x,int p){
	
	if(p==0)
	return 1;
	
	int temp = power(x,p/2);
	temp = temp * temp ; 
	
	if(p%2==0)
		return temp;
	else
		return temp*x;
	//return power(n,p-1)*n;
	
}
int main(){
	int x,p;
	cout<<"enter the number "<<endl;
	cin>>x;
	cout<<"enter the power "<<endl;
	cin>>p;
	cout<<"result = "<<power(x,p);
}
