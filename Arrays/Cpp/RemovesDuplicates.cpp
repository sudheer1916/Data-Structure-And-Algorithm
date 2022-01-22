#include<iostream>
using namespace std;
//O(n)
int duplicates(int arr[],int n){
	int dup = 1;
	for(int i=1;i<n;i++){
		if(arr[i]!=arr[dup-1]){
			arr[dup] = arr[i];
			dup++;
		}
	}
	return dup;
}

int main(){
	int arr[] = {10,10,20,20,30,30,30},n=7;  //array should be sorted
	cout<<"Before Removal"<<endl;
	for(int i = 0; i < n; i++)
       {
       		cout<<arr[i]<<" ";
       }
       
	n = duplicates(arr,n);
	cout<<endl;
	
	cout<<"After Removal"<<endl;

       for(int i = 0; i < n; i++)
       {
       		cout<<arr[i]<<" ";
       }
}
