//Throwing exception from functions.
#include<bits/stdc++.h>
using namespace std;

float func(int total , int n)
{
    if(n == 0)
    throw 0;
    return static_cast<float>(total/n);
}

int main()
{
    int total = 0;
    int n = 0;
    cout<<"Enter the total value\n";
    cin>>total;
    cout<<"Enter the value of n\n";
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
    cout<<"\nOKK\n";
    
    return 0;
}