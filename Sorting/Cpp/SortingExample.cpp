#include<iostream>
#include<algorithm>
using namespace std;

struct Point{
	int x,y;
};

bool MyComp(Point p1,Point p2){
	return p1.x<p2.x;
}

int main(){
	Point arr[] = {{3,10},{2,8},{5,4}};    ///O(nlogn)
	
	cout<<sizeof(arr)<<endl;
    cout<<sizeof(arr[0])<<endl;
    
    int n = sizeof(arr)/sizeof(arr[0]);
    
    sort(arr,arr+n,MyComp);   //hybrid of quicksort, heapSort, insertion sort  						  
    for(auto i: arr){		  //i.e introsort
    	cout<<i.x<<" "<<i.y<<endl;
	}	    
}
