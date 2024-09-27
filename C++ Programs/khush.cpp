#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int arr[]= {1,12,13,24,53,6,47};
    int size = sizeof(arr)/sizeof(arr[0]);
    sort(arr,arr+size);
    for(int i = 0 ;i<size;i++)
    std::cout<<arr[i]<<"   ";
    return 0;
}