#include<bits/stdc++.h>
using namespace std;

void reverse(vector<int> &arr,int pos);

int main()
{
    vector<int> arr={1,2,3,4,5,6};
    int pos = 3;
    reverse(arr,pos);
    
    for(int i = 0 ; i<arr.size();i++)
    {
        cout<<arr[i];
    }
    return 0;
}
    void reverse(vector<int> &arr , int pos)
    {
        int size=arr.size();
        int m =pos+size;
        if(pos>size)
        return;
        for(int i = pos+1;i<m/2;i++)
        {
            int temp = arr[i];
            arr[i]=arr[size-1];
            arr[size-1]=arr[i];
        }
    }