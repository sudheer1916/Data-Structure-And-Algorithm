#include<iostream>
using namespace std;
//O(n)
int zeros(int arr[],int n){
	int i;
	int count=0;
	for(i=0;i<n;i++){
		
		if(arr[i]!=0){
			swap(arr[i],arr[count]);
			count++;
		}
	}
	return i;
}
int main(){
	int arr[] = {15,0,25,65,0,0,0,35},n=8;
	cout<<"before Swaping"<<endl;
	for(int i = 0; i < n; i++)
    {
     	cout<<arr[i]<<" ";
    }
    cout<<endl;
	zeros(arr,n);
	cout<<"After Swaping"<<endl;
	for(int i = 0; i < n; i++)
    {
     	cout<<arr[i]<<" ";
    }
       
}
