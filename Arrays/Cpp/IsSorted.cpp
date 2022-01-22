#include<iostream>
using namespace std;

bool isSorted(int arr[],int n){      //efficient O(n)
	for(int i=1;i<n;i++){
		if(arr[i]<arr[i-1])
		return false;
		
		return true;
	}
}
int main(){
	int arr[] = {45,2,68},n1=3;
	int arr1[] = {2,4,9,12,15},n2=5;
	cout<<isSorted(arr,n1)<<endl;
	cout<<isSorted(arr1,n2);
}
