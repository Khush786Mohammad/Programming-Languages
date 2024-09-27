#include<bits/stdc++.h>
using namespace std;
class abc
{
   private:
   public:
   int age;
   string name = "md";

   public:

   abc()
   {
    cout<<"No argument constructor\n";
   }
   abc(string s)
   {
    cout<<"One argument constructor is called\n";
    name = s;
    cout<<name<<age<<endl;
   }
   abc(string s , int a)
   {
    name = s;
    age = a;
    cout<<"Two argument constructor is called\n";
    cout<<name<<age<<endl;
   }
   ~abc()
   {
    cout<<"Destructor is called for"<<name<<endl;
   } 
};

int main()
{
    abc obj;
    
    abc objj("khush");

    abc obj3("Mohammad" , 20);

    return 0;
}