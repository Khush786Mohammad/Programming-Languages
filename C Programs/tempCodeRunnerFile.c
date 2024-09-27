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