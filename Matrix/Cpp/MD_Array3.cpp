//using Array of Vector
#include<iostream>
#include<vector>
using namespace std;
int main(){
    int m=2,n=4;
    vector<int> arr[m];   //Array of Vectors

    for(int i = 0; i < m; i++)
	{
		for(int j = 0; j < n; j++)
		{
			arr[i].push_back(10);
		}
	}

	for(int i = 0; i < m; i++)
	{
		for(int j = 0; j < n; j++)
		{
			cout << arr[i][j] << " ";
		}
        cout<<endl;
	}
}