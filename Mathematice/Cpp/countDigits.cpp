#include <iostream>
using namespace std;

int countdigits(int x){
		int count;
		while(x>0){
			x/=10;
			count++;
		}
		cout<<"count = "<<count<<endl;
		count=0;
	}

int main()
{
	countdigits(5264);
	countdigits(5868324);
}
/*{
	int count,n;
	cout<<"enter the number ";
	cin>>n;
	while(n>0)
	{
		n/=10;
		count++;
	}
	cout<<"no of digits "<< count;
}*/

