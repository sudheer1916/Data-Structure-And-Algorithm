#include<iostream>
using namespace std;
int gcd(int a,int b){
	int res=min(a,b);
	while(res>0){
		if(a%res==0 && b%res==0){
			break;
		}
		res--;
	}
	return res;
}
int main(){
	cout<<"enter a numbers "<<endl;
	int x,y;
	cin>>x;
	cin>>y;
	cout<<gcd(x,y);
}
