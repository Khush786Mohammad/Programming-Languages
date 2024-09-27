//Binary Search By Recursive Method
#include<stdio.h>
#include<stdlib.h>

void binary_search(int * , int , int , int);

int main()
{
    int n,i,key,j,temp;
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

    binary_search(ptr,0,n-1,key);
    printf("Key element is not found in array\n");
    return 0;
}

void binary_search(int *arr, int low , int high , int key )
{
    int i,mid;
    if(low<=high)
    {
            mid = (low + high) / 2;
            if(arr[mid]==key)
            {
                printf("key element found at index %d\n",mid);
                exit(1);
            }
            else if(key<arr[mid])
            {
                 binary_search(arr , low , mid-1 , key);
            }
            else
            {
                binary_search(arr , mid+1 , high , key);
            }
    }
    
    
}