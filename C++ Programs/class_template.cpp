#include<bits/stdc++.h>
using namespace std;

template<typename T>
class khush
{
    private:
    string name;
    T marks;

    public:
    khush(string nam , T mar):name{nam} , marks{mar}
    {
        cout<<"Constructor is called\n";
    }
    string return_name() const
    {
        return name;
    }
    T return_marks() const
    {
        return marks;
    }
     ~khush()
    {
        cout<<"Destructor is called for name : "<<name<<endl;
    }
};

int main()
{
    khush<int>k1{"Khush" , 29};
    cout<<k1.return_name()<<endl<<k1.return_marks()<<endl;
    khush<float> k2{"Sunny" , 31.5f};
    cout<<k2.return_name()<<endl<<k2.return_marks()<<endl;
    khush<char> k3{"Lokesh",'A'};
    cout<<k3.return_name()<<endl<<k3.return_marks()<<endl;

    


    return 0;
}