#include<iostream>
using namespace std;

class Khush
{
    private:
    int roll_no;
    string name;
    char grade;

    public:
    Khush(string temp , int no = 14 , char Temp_grade = 'A');
    void print_data();
};
Khush::Khush(string temp , int no , char temp_grade)
:name{temp} , roll_no{no} , grade(temp_grade)
{
    print_data();
}
void Khush::print_data()
{
    cout<<name<<endl<<roll_no<<endl<<grade<<endl;
}

int main()
{
    Khush obj("khush");
    Khush ob("khush" , 13);
    return 0;
}