//Tail call elimination QuickSort Algorithm.
//if we do not do anything after making recusive call,
//such functions are called tail recursive functions.
// we can always optimize them by doing tail call elimination
//i.e by adding "goto" . 
//we can again super optimize our solution by 
//which partition has less no of elements, do recursion for that part,
//do tail call elimination for the larger part.
#include <iostream>
using namespace std;

int partition(int arr[],int l,int h){
    int pivot = arr[l];
    int i = l-1;
    int j = h+1;
    while (true)
    {
        do
        {
            i++;
        } while (arr[i]<pivot);
        do
        {
            /* code */
            j--;
        } while (arr[j]>pivot);
        if(j<=i) return j;
        swap(arr[i],arr[j]);
        
    }
    
}

void qsort(int arr[],int l,int h){
    begin:
    if(l<h){
        int p = partition(arr,l,h);
        qsort(arr,l,p);
        l = p+1;
        goto begin;
    }
}

int main(){
    int arr[] = {8,4,7,9,3,10,5};
    int n = sizeof(arr)/sizeof(arr[0]);
    qsort(arr,0,n-1);
    for(int x:arr)
    cout<<x<<" ";
}

