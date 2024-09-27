#include<stdio.h>
#include<stdlib.h>

void linear_search(int * , int , int);

int main()
{
    int n,i,key;
    printf("Enter the number of elements in array\n");
    scanf("%d",&n);

    int *ptr;
    ptr=(int*)malloc(n*sizeof(int));
    printf("Enter the array elements\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&ptr[i]);
    }
     
    printf("Enter the key\n");
    scanf("%d",&key);
    
    linear_search(ptr,n,key);
    return 0;
    
}

void linear_search(int *arr , int size, int elem)
{
    int i=0;
    for(i=0;i<size;i++)
    {
        if(arr[i] == elem)
        {
        printf("Key Element found at index %d\n", i+1);
        return;
        }
    }
    printf("Key Element not found in Array\n");

}