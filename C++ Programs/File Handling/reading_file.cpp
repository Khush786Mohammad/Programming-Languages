#include<iostream>
#include<fstream>
using namespace std;

int main()
{
    string str;
    fstream file;
    file.open("khush.txt");
    if(file.is_open())
    {
       cout<<"File is good to go\n";
       getline(file, str); //getline function is used to read the file till the end.
    }
    else
    {
        cerr<<"Problem in opening a file\n";
    }
    cout<<str;
    file.close();
    return 0;
} 