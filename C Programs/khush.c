#include<stdio.h>
#include<string.h>

int main()
{
    char str[] = "Khush Mohammad ";
    char str2[] = "Ansari";
    
    strcat(str, str2);
    printf("%s",str);

    return 0;
}