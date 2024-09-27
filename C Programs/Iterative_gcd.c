#include<stdio.h>

int gcd(int , int);

int main()
{
    int a1,b1;
    printf("Enter the values of a and b");
    scanf("%d%d",&a1,&b1);

    printf("GCD of Two no. is %d",gcd(a1,b1));
    return 0;

}

// int gcd(int x , int y)
// {
//     int r;
//     while(y!=0)
//     {
//         r = x%y;
//         x=y;
//         y=r;
//     }
//     return x;
// }

// Recursive Approach

 int gcd(int a,int b)
{
    if(a == 0)
    return b;
    else
    return gcd(b%a , a);
}
