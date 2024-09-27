#include<bits/stdc++.h>
using namespace std;

class base
{
    public:
    int value{0};
    base()
    {
        cout<<"No-args base class Constructor\n";
    }
    base(int x)
    {
        value = x;
        cout<<"Base Constructor\n";
        cout<<"value = "<<value;
    }
    ~base()
    {
        cout<<"base class destructor\n";
    }
};

class child : public base
{
    private:
    int double_value;

      public:

    child():base() , double_value{0}
    {
        cout<<"No-args child constructor\n";
    }
    child(int x):base(x) , double_value{x}
    {
       
        cout<<"Args child constructor\n";
        cout<<"double value = "<<double_value*2<<endl;
    }
    ~child()
    {
        cout<<"Child class destructor\n";
    }
};

int main()
{
    child obj(33);
    return 0;
}