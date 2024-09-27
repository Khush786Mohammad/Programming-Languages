#include<stdio.h>
#include<stdlib.h>

void quick_sort(int * , int , int);
int partition(int * , int , int);
void swap(int  , int );


int main()
{
    int size;
    printf("Enter the size fo array\n");
    scanf("%d",&size);

    int *ptr;
    ptr= (int*)malloc(size*sizeof(int));
    for(int i = 0;i<size ;i++)
    {
        scanf("%d",&ptr[i]);
    }
    int low = 0 , high = size - 1;
    quick_sort(ptr, low, high);
     printf("Sorted Array is \n");
    for(int i = 0 ;i<size ;i++)
    {
        printf("%d ",ptr[i]);
    }
    return 0;

}
void quick_sort(int *arr, int low , int high)
{
    int loc = partition(arr, low , high);
    quick_sort(arr, low, loc - 1);
    quick_sort(arr, loc+1, high);
}
int partition(int *arr , int lb , int ub)
{
    int pivot = arr[lb];
    int start = lb;
    int end = ub;
    while(start<end)
    {
        while(arr[start]<=pivot)
        {
            start++;
        }
        while(arr[end]>pivot)
        {
            end--;
        }
        if(start<end)
        swap(arr[start] , arr[end]);
    }
    swap(arr[lb] , arr[end]);
    return end;
}
void swap(int a , int b)
{
    int temp = a;
    a=b;
    b=temp;
}
