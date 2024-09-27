#include<iostream>
#include<iomanip>
using namespace std;

int main()
{
    int num = 392749;
    string str = "Khush";
    cout<<"-------------------------------------\n";
    cout<<setw(20)<<std::setfill('*')<<num;
    cout<<setw(10)<<std::setfill('#')<<str;
    return 0;
}