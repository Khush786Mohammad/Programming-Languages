//Bubble Sort.

#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n,i,j,count=0,temp;
    printf("Enter the size of array\n");
    scanf("%d",&n);

    int *ptr;
    ptr=(int*)malloc(n*sizeof(int));
    printf("Enter the array elements\n");
    for(int i = 0 ;i<n ; i++)
    {
        scanf("%d",&ptr[i]);
    }
    for(int i = 0;i<n-1;i++)
    {
        for(j=0;j<n-1-i;j++)
        {
            if(ptr[j]>ptr[j+1])
            {
                temp = ptr[j];
                ptr[j] = ptr[j+1];
                ptr[j+1] = temp;
                count++;
            }
        }
    }
    for(i=0;i<n;i++)
    {
        printf("%d  ",ptr[i]);
        
    }
    printf("\n%d",count);
}