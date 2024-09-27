#include<iostream>
#include<iomanip>//it provides manipulators used to formatted stream
using namespace std;

int main()
{
    std::cout<<(10 == 20)<<endl;
    std::cout<<(10 == 10)<<endl;

    std::cout<<std::boolalpha;
    std::cout<<(10 == 10)<<endl;
    std::cout<<(10 == 20)<<endl;

    std::cout<<std::noboolalpha;
    std::cout<<(10 == 10)<<endl;

    return 0;

}