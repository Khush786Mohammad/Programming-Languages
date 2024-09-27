#include<iostream>
using namespace std;

void insertion_sort(int *a ,int n);
void printarray(int *a , int n);

int main()
{
    int arr[10000];
    int size;
    cout<<"Enter the size of array\n";
    cin>>size;
    cout<<"Enter the array elements\n";
    
    for(int i = 0 ; i<size ; i++)
    cin>>arr[i];

    cout<<"Before Sorting\n";
    printarray(arr,size);
    
    insertion_sort(arr,size);

    cout<<"After Sorting\n";
    printarray(arr, size);

    return 0;
}

void insertion_sort(int *a , int n)
{
    for(int i = 1 ; i<n ; i++)
    {
        int key = a[i];
        int j = i-1;
        while(j>=0 && a[j] > key)
        {
            a[j+1] = a[j];
            j = j - 1;
        }
        j = j+1;
        a[j] = key;
    }   
}

void printarray(int *a , int n)
{
    for(int i = 0 ; i<n ; i++)
    cout<<a[i]<<" ";
    cout<<"\n";
}