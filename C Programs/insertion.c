#include<stdio.h>
#include<stdlib.h>

int main()
{
    int size,i,j,key;
    printf("Enter the size of array\n");
    scanf("%d",&size);
    int *ptr;
    ptr= (int *)malloc(sizeof(int));
    printf("Enter the array elements\n");
    for(i=0;i<size;i++)
    {
        scanf("%d",&ptr[i]);
    }
    //Insertion Sort.

    for(i=1;i<size;i++)
    {
        key = ptr[i];
        j = i-1;
        while(j>=0 && ptr[j]>key)
        {
            ptr[j+1] = ptr[j];
            j=j-1;
        }
        ptr[j+1] = key;
    }

    //Now print the array elements.

    for(i=0;i<size;i++)
    {
        printf("%d  ",ptr[i]);
    }
    return 0;
}