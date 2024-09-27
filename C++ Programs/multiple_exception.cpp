//Throwing exception from functions.
#include<bits/stdc++.h>
using namespace std;

float func(int total , int n)
{
    if(n == 0)
    throw 0;
    if(total<0 || n<0)
    throw std::string{"Oh bhai kya kar riya h\n"};
    return static_cast<float>(total/n);
}

int main()
{
    int total = 0;
    int n = 0;
    cout<<"Enter the Marks\n";
    cin>>total;
    cout<<"Enter the number of subject\n";
    cin>>n;

    try
    {
        float avg = func(total , n);
        cout<<"Average = "<<avg;
    }
    catch(const int &ex)
    {
        std::cerr << "Exception is caught dividing by zero\n";
    }
    catch(const std::string &str)
    {
        std::cerr<<str;
    }
    cout<<"\nOKK\n";
    
    return 0;
}