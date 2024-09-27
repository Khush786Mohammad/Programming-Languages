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

class child : public parent
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
    obj.getdat(22);
    obj.display();
    obj.a = 12;
    //obj.b = 22; b is protected to class child and hence it cannot be accessible by the help of object of that class.
    cout<<obj.a;
    return 0;
}