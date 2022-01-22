#include<iostream>
using namespace std;
/*
int fun(int arr[],int n){         //naive method O(n^2)
	int lar = 0;
	for(int i=1;i<n;i++){
		if(arr[i]>arr[lar])
		lar=i;
	}
	return lar;
}
int secondLargest(int arr[],int n){
	int largest = fun(arr,n);
	int second = -1;
	for(int i=0;i<n;i++){
		if(arr[i]!=arr[largest]){
			if(second == -1)
			second = i;
			else if(arr[i]>arr[second])
			second = i;
		}
	}
	return second;
}*/



int secondLargest(int arr[],int n){    //theta(n)  //efficient
	int second = -1,largest = 0;         //intial indexes
	for(int i=1;i<n;i++){
		if(arr[i]>arr[largest]){
			second = largest;
			largest = i;
		}
		else if(arr[i]!=arr[largest]){
			if(second==-1 || arr[i]>arr[second])
			second = i;
		}
	}
	cout<<"the second largest element is at position ";
	return second+1;
	//cout<<"the second largest element is ";
	//return arr[second];
}

int main(){
	int arr[] = {2,5,6,8,78,50},n=6;
	cout<<secondLargest(arr,n);
}
