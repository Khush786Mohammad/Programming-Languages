#include<bits/stdc++.h>
using namespace std;

class Account
{
    public :
    virtual void withdraw() const
    {
        cout<<"In a Account Withdraw\n";
    }
    virtual ~Account()
    {
        cout<<"Deleting : Account\n";
    }
};

class Saving_account : public Account
{
    public : 
    void withdraw() const
    {
        cout<<"In a Saving Account Withdrawn\n";
    }
    ~Saving_account()
    {
        cout<<"Deleting : Saving Account\n";
    }
};

class Current_account : public Account
{
    public:
    void withdraw() const
    {
        cout<<"In a Current Account Withdrawn\n";
    }
    ~Current_account()
    {
        cout<<"Deleting : Current Account\n";
    }
};

int main()
{
    Account *ptr1 = new Account();
    ptr1 -> withdraw();

    Account *ptr2 = new Saving_account();
    ptr2->withdraw();

    Account *ptr3 = new Current_account();
    ptr3 -> withdraw();

    cout<<"=====Deleting=====\n";
    delete ptr1;
    delete ptr2;
    delete ptr3;

    return 0;
}