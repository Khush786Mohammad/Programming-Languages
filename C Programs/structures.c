//structures

#include<stdio.h>

typedef struct student_info
{
    char name[50];
    int roll_no;
    float marks;
} students;

int main()
{
   //struct student_info student; 
   students student;
    printf("Enter the name of the student\n");
    scanf("%s",student.name);
    
    printf("Enter the roll no of the student\n");
    scanf("%d",&(student.roll_no));

    printf("Enter the marks in physics\n");
    scanf("%f",&(student.marks));

    printf("Details of the students is\n");
    printf("%s\n%d\n%0.3f",student.name , student.roll_no, student.marks);

    return 0;
}