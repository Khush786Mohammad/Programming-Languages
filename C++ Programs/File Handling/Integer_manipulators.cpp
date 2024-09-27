#include<iostream>
#include<iomanip>
using namespace std;

int main()
{
    int num {225} , num2{-225};
    cout<<dec<<num<<endl;
    cout<<hex<<num<<endl;
    cout<<oct<<num<<endl;

    cout<<"--------\\n\\--------";

    cout<<showbase;
    cout<<dec<<num<<endl;
    cout<<hex<<num<<endl;//0x prefix for hexadecimal number.
    cout<<oct<<num<<endl;//0 prefix for octal number
    
    cout<<"--------\\n\\--------";

    cout<<uppercase;
    cout<<dec<<num<<endl;
    cout<<hex<<num<<endl;//show number in uppercase in hexadecimal
    cout<<oct<<num<<endl;//show number in uppercase in octal.

    cout<<"--------\\n\\--------";
    std::cout.setf(std::ios::showpos);
    std::cout<<std::resetiosflags(std::ios::basefield);
   
    cout<<num<<endl;//show sign
    cout<<num2<<endl;//show sign
    return 0;
}