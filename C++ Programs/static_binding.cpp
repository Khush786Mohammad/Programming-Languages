#include<bits/stdc++.h>
using namespace std;

class base
{
    public:
    void func() const
    {
        cout<<"This is a base class\n";
    }
};

class derived:public base
{
    public:
    void func() const
    {
        cout<<"This is a derived class\n";
    }
};

int main()
{
    base obj;
    obj.func();

    derived ob;
    ob.func();
     
    base *ptr = new derived();//ptr is a pointer of base and derived is a object of base.
    ptr->func(); //should print derived class but it does not.//because of static binding.

    return 0;
}