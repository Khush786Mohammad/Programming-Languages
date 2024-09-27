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
        cout<<"Test Destructor  "<<endl;
     }
};

int main()
{
    /*
    //part 1;
    shared_ptr<int> p1 (new int(100));
    cout<<p1.use_count()<<" ";
    shared_ptr<int> p2(p1);
    shared_ptr<int> p3;
    p3 = p1;
    cout<<p2.use_count()<<" ";
    cout<<p3.use_count()<<" ";
    cout<<p1.use_count()<<" ";

    p1.reset();

    cout<<p1.use_count()<<" "<<p2.use_count()<<" "<<p3.use_count()<<" ";
    */

   //part 2

   shared_ptr<Test> ptr = make_shared<Test>();
   cout<<"\n"<<ptr.use_count();

   shared_ptr<Test> ptr1 {new Test(50)};
   cout<<"\n"<<ptr1.use_count();



    return 0;
}