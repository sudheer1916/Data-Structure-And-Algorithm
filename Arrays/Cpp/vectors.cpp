#include<iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main(){
	int arr[] =  {10,20,5,7},n=4;
	vector <int>v = {10,20,5,7}; 
	int i=0;
	while(i<n)
	v.push_back(i) = arr[i];
	
	sort(v.begin(),v.end());
	
	for(int x: v)
	    cout<<x<<" ";
	
	sort(v.begin(),v.end(),greater<int>());
	
	cout<<endl;
	for(int x: v)
	    cout<<x<<" ";
}
