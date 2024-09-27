#include<iostream>
#include<memory>
using namespace std;

class Test
{
    private:
     int data;
    
    public:
     Test():data{0}
     {
        cout<<"Test Constructor  "<<data<<endl;
     }
     Test(int d):data(d)
     {
        cout<<"Test constructor  "<<data<<endl;
     }
     ~Test()
     {
        cout<<"Test Destructor  "<<data<<endl;
     }
};

int main()
{
    //Test t1 = 100;
   /* Test *t1 = new Test(200);
    delete t1;*/

    unique_ptr<Test> t1 {new Test{100}};
    unique_ptr<Test> t2 = make_unique<Test>(1000);
    unique_ptr<Test> t3;
    //t3 = t1; cannot copy or assing pointer to another one.
    t3 = move(t1);//we can move a pointer but can't copy it.

    if(!t1)
    {
        cout<<"it is nullptr";
    }
    
    return 0;
}