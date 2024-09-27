#include<bits/stdc++.h>
using namespace std;

class khush
{
   private:
   int roll;
   string name;

   public:

   khush(string names = "none" , int no = 0);
   khush(const khush &var);
};
khush::khush(string names , int no)
:name{names} , roll{no}
{
    cout<<name<<endl<<roll<<endl;
}
khush::khush(const khush &var)
:name{var.name} , roll{var.roll}
{
    cout<<"Copy COnstructor"<<endl;
    cout<<name<<endl<<roll<<endl;
}

int main()
{
    khush obj("khush" , 14);
    khush cop(obj);
    return 0;
}