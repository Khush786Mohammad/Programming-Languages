#include<bits/stdc++.h>
using namespace std;
class DivideByZeroException
{

};

int main()
{
    int total_marks = 0;
    int no_of_subject = 0;

    cout<<"Enter the total marks\n";
    cin>>total_marks;

    cout<<"Enter the number of subjects\n";
    cin>>no_of_subject;

    try
    {
        if(no_of_subject == 0)
        throw 0;
        else
        {
            float avg = static_cast<float> (total_marks/no_of_subject);
            cout<<"Average marks = "<<avg;
        }
        

        
    }
    catch(const DivideByZeroException &ex )
    {
        std::cerr <<"Can't divide by zero"<< '\n';
    }
    
}