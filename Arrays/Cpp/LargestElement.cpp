#include<iostream>
using namespace std;
/*
int fun(int arr[],int n){            ////T.C = O(n^2) naive method
	for(int i=0;i<n;i++){
		bool flag = true;
		for(int j=0;j<n;j++){
			if(arr[j] > arr[i]){
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			cout<<"the largest element is at position ";
			return i+1;
		}
	}
	return -1;
}*/

int fun(int arr[],int n){      //theta(n) efficient
	int res = 0;
	for(int i=1;i<n;i++){
		if(arr[i]>arr[res])
		res = i;
	}
	cout<<"the largest element is at position ";
	return res+1;
	
}

int main(){
	int arr[] = {2,5,6,8,78,50},n=6;
	cout<<fun(arr,n);
}
