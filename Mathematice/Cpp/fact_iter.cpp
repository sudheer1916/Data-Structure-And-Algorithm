#include<iostream>
using namespace std;

int fact(int n){
	
	int res=1;
	for(int i=n;i>0;i--){
		res=res*i;
	}
	return res;
}
int main()
{
	cout<<"type 'fact' for factorial ";
	int number;
	string c;
	cin>>c;
	
	while(c!="end"){
	cout<<"enter a number or type 'end' to exit ";

	if(cin>>number){
		cout<<fact(number)<<endl;
	}
	else{
		cout<<"thank you";
		break;
	}
	
}
}



