#include <bits/stdc++.h>
//#include<iostream>

//#include<stdlib.h>
using namespace std;

int main()
{
    int n;
    cout<<"Enter the number of elements\n";
    cin>>n;
    int *arr;
    arr = (int *)malloc(n*sizeof(int));
    cout<<"Enter the array elements\n";
    for(int i = 0;i<n;i++)
    {
        cin>>arr[i];
    }
    sort(arr,arr+n);
    for(int i = 0 ;i<n;i++)
    cout<<arr[i]<<"\n";
    return 0;
}