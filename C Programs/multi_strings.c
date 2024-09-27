//Program To Check wheather a name is present or not in a string.

#include<stdio.h>
#include<string.h>
#include<stdbool.h>

int main()
{
    int i,j;
    bool var=false;
    char str[5][10],name[10];
    printf("Enter the five names\n");
    for(i=0;i<5;i++)
    {
        scanf("%s",&str[i][0]);
    }

    printf("Enter a name to be search\n");
    scanf("%s",name);
   
    i=0;
    while(i!=5)
    {
        int a;
        a=strcmp(&str[i][0],name);
        if(a==0)
        { 
        var=true;
        j=i;
        break;
        }

        else
        i++;
    }  
    if(var)
    printf("Enter name %s is found at index %d\n",&str[i],j+1);
    else
    printf("Name is not found in the list\n");
    

    return 0;
}