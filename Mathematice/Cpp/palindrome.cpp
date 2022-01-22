#include<iostream>
using namespace std;

bool palindrome(int x){
	int rev=0,temp=0;
	int org=x;
	while(x>0){
		temp=x%10;
		rev = rev*10+temp;
		x/=10;
	}
	return rev==org;
	
}

int main(){
	cout<<palindrome(4554)<<endl;
	cout<<palindrome(8668)<<endl;
	cout<<palindrome(21);
	
	return 0;
}

