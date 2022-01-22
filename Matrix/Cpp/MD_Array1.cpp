//using Double Pointer
#include<iostream>
using namespace std;
int main(){
    int m=4,n=3;
    int **arr;

    arr = new int*[m];

    for (int i = 0; i < m; i++)
    {
        /* code */
        arr[i] = new int[n];
    }
    for(int i = 0; i < m; i++)
	{
		for(int j = 0; j < n; j++)
		{
			cout << i << j <<" ";
		}
        cout<<endl;
	}
    
}