#include<stdio.h>

struct s1
{
    char name[20];
    int roll_no;
};

struct s2
{
    char course[20];
    struct s1 s;
};

int main()
{
    struct s2 obj = {"B.tech , Khush , 14"};
    printf("%s %s %d",obj.s.name,obj.course , obj.s.roll_no);
    return 0;
}