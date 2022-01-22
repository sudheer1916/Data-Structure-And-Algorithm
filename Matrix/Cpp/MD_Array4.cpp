#include<iostream>
#include<vector>
//using Vector of Vectors
using namespace std;
int main(){
    int m=2,n=4;

    vector<vector <int>> arr;              //Vector of Vectors
    for(int i=0;i<m;i++){
        vector<int> v;
        for(int j=0;j<n;j++)
        v.push_back(j);

        arr.push_back(v);
    }

    for(int i = 0; i < arr.size(); i++)
	{
		for(int j = 0; j < arr[i].size(); j++)
		{
			//cout << arr[i][j] << " ";
            cout<<i<<j<<" ";
		}
        cout<<endl;
	}
}