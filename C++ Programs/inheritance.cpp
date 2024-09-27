#include<bits/stdc++.h>
using namespace std;

class Account
{
    private:
    int balance{0};

    public:

    void deposit(int amount);

    void withdraw(int amount);

    void display();

     ~Account();
};

class Saving_account : public Account
{
    public:
    ~Saving_account();
};

void Account::deposit(int amount)
{
    balance = balance + amount;
}

void Account::withdraw(int amount)
{
    if(balance<amount)
    return;
    balance = balance - amount;
}
void Account::display()
{
    cout<<"Total amount = "<<balance<<endl;
}
Account::~Account()
{
    cout<<"Destructor for base class is called\n";
}
Saving_account::~Saving_account()
{
    cout<<"Destructor for derived class is called\n";
}

int main()
{
    Account acc;
    acc.deposit(10000);
    acc.withdraw(500);
    acc.display();

    Saving_account *ac = new Saving_account();
    ac->deposit(5000);
    ac->withdraw(1000);
    ac->display();
    delete ac;
    return 0;
}