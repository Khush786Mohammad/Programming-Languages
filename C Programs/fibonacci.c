// #include<stdio.h>
// int main()
// {
//     int result,num,i=1;
//     printf("Enter the number\n");
//     scanf("%d",&num);
//     int first = 0 ,second = 1;
//     printf("%d %d",first,second);
//     result = first + second;
//     while(i<num)
//     {
//         result = first + second;
//         first = second;
//         second = result;
        
//         printf(" %d ",result);
//         i++;
//     }
//     return 0;
// }

//By Recursion.
#include<stdio.h>
int fibo(int);
int main()
{
    int n;
    printf("Enter the range for fibonacci series\n");
    scanf("%d",&n);

   fibo(n);
    return 0;
}

int fibo(int n)
{
    if(n==0)
    return 0;
    else if(n == 1)
    return 1;
    else
    
}