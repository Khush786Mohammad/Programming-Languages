#include<bits/stdc++.h>
using namespace std;

int main()
{
    int sum = 0;
    int num = 0;
    cout<<"Enter the sum\n";
    cin>>sum;
    cout<<"Enter the number of objects\n";
    cin>>num;
    try
    {
        if(num == 0)
        throw 0;

        float avg = float(sum/num);
        cout<<"Average = "<<avg;
    }
    catch(int &ex)
    {
        cout<<"Exception is caught dividing by 0\n";
    }
    
    return 0;
}