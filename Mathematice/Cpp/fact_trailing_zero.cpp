#include<iostream>
using namespace std;

int fact(int n){
	
	int res=1;
	for(int i=n;i>0;i--){
		res=res*i;
	}
	
	
	int count = 0;
	for(int j=5;j<=res;j=j*5){
		count = count + 1;//(res/j);
	}
	cout<<count<<endl;
	return res;
}
/*int trailzero(int res){
	int count = 0;
	for(i=5;i<=res;i=i*5){
		count = count + (n/i);
	}
	return count;
}
*/
int main()
{
	cout<<"type 'fact' for factorial ";
	int number;
	//int result;
	string c;
	cin>>c;
	
	while(c!="end"){
	cout<<"enter a number or type 'end' to exit ";

	if(cin>>number){
		//fact(number);
		cout<<fact(number)<<endl;
		//cout<<fact(result)<<endl;
		
	}
	else{
		cout<<"thank you";
		break;
	}
	
}
}



