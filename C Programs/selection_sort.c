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
    for(i = 0 ;i<n-1;i++)
    {
        int min = i;
        for(j=i+1;j<n;j++)
        {
            if(ptr[j]<ptr[min])
            min = j;
        }
        //if(min!=i)
        //
            temp=ptr[min];
            ptr[min]=ptr[i];
            ptr[i] = temp;
        //
    }


    for(i=0;i<n;i++)
    {
        printf("%d  ",ptr[i]);
        
    }
    printf("\n%d",count);
}