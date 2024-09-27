#include<stdio.h>
void countingsort(int A[], int k, int n);

int main()
{
    int n,i,A[15],k=0;
    printf("Enter size of array:\n");
    scanf("%d",&n);
    printf("Enter the array elements:\n");
    for(i=1;i<=n;i++)
    {
        scanf("%d",&A[i]);
        if (A[i] > k) {
            k = A[i];
        }
    }
    countingsort(A, k, n);
    return 0;
}
void countingsort(int A[], int k, int n)
{
    int b[n],c[1000];
    for(int i = 0; i<=k;i++)
    {
        c[i]= 0;
    }
    for(int i = 1 ; i<=n;i++)
    {
        c[A[i]] = c[A[i]]+1;
        
    }
    for(int i = 0 ; i<=k;i++)
    {
        printf("\nElement at index %d occurs %d times",i,c[i]);
    }
    for(int i = 1 ;i<=k;i++)
    {
        c[i] = c[i] + c[i-1];
        
    }
    
    for(int i = n;i>=1;i--)
    {
        b[c[A[i]]] = A[i];
        c[A[i]] = c[A[i]]-1;
    }
    for(int i = 1 ; i<=n;i++)
    printf("%d ",b[i]);
    // int d[1000];
    // for(int i = 0 ;i<=k;i++)
    // {
    //     d[i] = 0;
    // }
    // for(int i = 1 ;i<n;i++)
    // {
    //     d[b[i]] = d[b[i]]+1;
    // }
    // for(int i = 1 ;i<n;i++)
    // {
    //     printf("\nElement at index %d occurs %d times",i,d[A[i]]);
    // }
    
    
}