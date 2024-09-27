//Binary Search By Non Recursive Method
#include<stdio.h>
#include<stdlib.h>

int binary_search(int * , int , int , int);

int main()
{
    int n,i,key,j,temp,value;
    printf("Enter the size of array\n");
    scanf("%d",&n);

    int *ptr;
    ptr=(int*)malloc(n*sizeof(int));
    printf("Enter the array elements\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&ptr[i]);
    }
    //Sort the array in ascending order
     for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(ptr[j]<ptr[i]) // By Insertion Sort.
            {
                temp=ptr[i];
                ptr[i] = ptr[j];
                ptr[j] = temp;
            }
        }
    }
    printf("Enter the key element\n");
    scanf("%d",&key);

    //Print the sorted array.

    printf("Sorted Array is\n");
    for(i=0;i<n;i++)
    {
        printf("%d  ",ptr[i]);
    }
   
    printf("\n");

    value = binary_search(ptr,0,n-1,key);
    if(value<0)
    printf("Key element is not found in array");
    else
    printf("Key element is found at index %d",value);
    
    return 0;
}

int  binary_search(int *arr, int low , int high , int key )
{
    while(low<=high)
    {
        int mid = (low + high)/2;
        if(arr[mid] == key)
        {
            return mid;
        }
        else if(key<arr[mid])
        {
            high = mid - 1;
        }
        else
        {
            low = mid + 1;
        }
    } 
    return -1;  
}