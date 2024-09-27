#include<stdio.h>
#include<string.h>

int main()
{
    char *str[] = {"khush","sidhu","malton"};
    int i;
    for(i=0;i<3;i++)
    {
        printf("%s\n",str[i]);
    }
    return 0;
}