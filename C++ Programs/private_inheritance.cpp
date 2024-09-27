#include<bits/stdc++.h>
using namespace std;

class parent 
{
    public:
    int a{0};

    protected:
    int b{0};

    private:
    int c{0}; 
};

class child:private parent // Private Inheritance
{
    public:
    void getdata(int aa)
    {
        a = aa;
        b = aa;
       // c = aa; c is private to parent class.and cannot be accessible outside of that class.
    }
    void display()
    {
        cout<<"a = "<<a<<"b = "<<b;
    }
};

int main()
{
    child obj;
    obj.getdata(99);
    obj.display();

   // obj.a = 20; a is now private to class child due to private inheritance and cannot be accessible outside the class but a can be accessible through parent object.
   // obj.b = 22;

    return 0;
}