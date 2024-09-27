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

class child : protected parent // class child inherits class parent by protected.
{
    public:

    void getdat(int aa)
    {
        a = aa;
        b = aa;
        //c = aa; c is private to class parent and hence it attribute cannot be inherited.
    }
    void display()
    {
        cout<<"a = "<<a<<"b = "<<b<<endl;
    }
};


int main()
{
    child obj;
    obj.getdat(23);
    obj.display();

    /*obj.a = 26;  this piece of code give error as a is public data member in class parent but when child class inherits class parent by protected(line no.16) then
     a data member is now become protected in class child and hence protected data member are not accessible by the object of the class. But it can be accessible by the
     object of class parent as a is public data member and public class member are accessible by the object of the class.
    cout<<obj.a;*/

    parent ob;
    ob.a = 221;
    cout<<ob.a;
    return 0;
}