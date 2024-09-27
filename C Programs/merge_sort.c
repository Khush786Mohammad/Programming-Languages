#include<stdio.h>
#include<stdlib.h>

void merge_sort(int * , int , int);
void merge(int * ,int , int , int);


int main()
{
    int size;
    
    printf("Enter the size of array\n");
    scanf("%d",&size);

    int *ptr = (int*)malloc(size*sizeof(int));
    
    for(int i = 0 ;i < size ;i++)
    scanf("%d",&ptr[i]);
    int low = 0 , high = size - 1;
    merge_sort(ptr , low , high);
    for(int i = 0 ; i<size ;i++)
    printf("%d ",ptr[i]);
    return 0;
}
void merge_sort(int *arr , int low ,int high)
{
    if(low<high)
    {
        int mid = (low+high)/2;
        merge_sort(arr , low , mid);
        merge_sort(arr , mid+1 , high);
        merge(arr, low , mid , high);
    }
}
void merge(int *arr , int low ,int mid ,int high)
{
    int a[high-low+1];
    int i = low;
    int j= mid + 1;
    int k = low;
    while(i<=mid && j<=high)
    {
        if(arr[i]<arr[j])
        {
            a[k] = arr[i];
            i++;
            k++;
        }
        else{
            a[k] = arr[j];
            k++;
            j++;
        }
    }
     while(i<=mid)
        {
            a[k] = arr[i];
            k++;
            i++;
        }
   
        while(j<=high)
    {
        a[k] = arr[j];
        j++;
        k++;
    }
       
    
    for(k = low ; k<=high ; k++)
    {
        arr[k] = a[k];
    }
}