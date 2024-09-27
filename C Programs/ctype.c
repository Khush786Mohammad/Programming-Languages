#include<stdio.h>
int main()
{
    char p[] = "The six is five plus one";
    int i = 0 ;
     while(p[i]!='\0')
     {
         putchar(p[i]);
         i++;
     }
    return 0;
}