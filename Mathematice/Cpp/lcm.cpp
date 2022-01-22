//O(log(min(a,b)))
// lcm(a,b) * hcf(a,b) = a*b

#include<iostream>
using namespace std;

int gcd(int a,int b)
	{
		if(b==0)
		a=a+0;
		else
		gcd(b,a%b);
 	}
 	
int lcm(int x,int y){
	int a=x;
	int b=y;
	return ((x*y)/gcd(a,b));
}


int main(){
	cout<<"enter a numbers "<<endl;
	int x,y;
	cin>>x;
	cin>>y;
	cout<<lcm(x,y);
} 
