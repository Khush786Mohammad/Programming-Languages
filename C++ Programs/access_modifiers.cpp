// #include<bits/stdc++.h>
// using namespace std;

// class Khush
// {
//     public:
//     int a{0};

//     protected:
//     int b{0};

//     private:
//     int c{0};
// };

// int main()
// {
//     Khush obj;
//     obj.a = 10;
//     cout<<"a = "<<obj.a<<endl;

//     // obj.b= 20;//error because protected members are not by the object of that class.
//     // cout<<"b = "<<obj.b<<endl;

//     // obj.c = 30;
//     // cout<<"c = "<<obj.c<<endl;

//     return 0;
// }

/*accessing protected data members by derived class.*/

#include<bits/stdc++.h>
using namespace std;

class Khush
{
  protected:
  int id_no;
};

class derived:public Khush
{
    public:
    void getdata(int no)
    {
        id_no = no;
    }
    void display()
    {
        cout<<"ID NUMBER = "<<id_no;
    }
};

int main()
{
    derived obj;
    obj.getdata(295);
    obj.display();

   // obj.id_no = 20;//error as protected data members are not accessible by the oject of base or derived class.
    return 0;
}

