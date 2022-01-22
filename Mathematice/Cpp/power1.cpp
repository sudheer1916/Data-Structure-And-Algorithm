#include<iostream>
using namespace std;
//t.c = O(log n)
//auxillary space = O(1)
int power1(int x,int p){
	int res=1;
	while(p>0){
		//if(p%2 != 0)
		if(p&1)
		res = res*x;
		
		x=x*x;
		//p=p/2;
		p=p>>1;
	}
	return res;
} 


int main(){
	int x,p;
	cout<<"enter the number "<<endl;
	cin>>x;
	cout<<"enter the power "<<endl;
	cin>>p;
	cout<<"result = "<<power1(x,p);
}
