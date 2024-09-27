//Constructro initialization in C++
#include<bits/stdc++.h>
using namespace std;

class khush
{
   private:
   string name;
   int roll_no;
   char grade;

   public :
 
   khush();
   khush(string temp_name);
   khush(string temp_name , int temp_no , char temp_grade);
   void print_data();
};

khush::khush()
:name{"none"} , roll_no{0} , grade{'F'}
{  
    print_data();
}
khush::khush(string temp_name)
:name{temp_name} , roll_no{10} , grade{'E'}
{
    print_data();
}
khush::khush(string temp_name , int temp_no , char temp_grade)
:name{temp_name} , roll_no{temp_no} , grade{temp_grade}
{
    print_data();
}
void khush::print_data()
{
    cout<<name<<endl<<roll_no<<endl<<grade<<endl;
}

int main()
{
    khush obj;
    khush ob("Khush");
    khush obbj("Khush" , 14 , 'A');
    return 0;
}