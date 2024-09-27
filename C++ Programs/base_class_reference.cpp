#include<bits/stdc++.h>
using namespace std;

class account
{
    public :
    virtual void withdraw()
    {
        cout<<"Account Withdraw\n";
    }
   
};

class saving_account : public account{
    public:
    void withdraw() override
    {
        cout<<"Saving account withdraw\n";
    }
    
};

class current_account : public account
{
    public:
    void withdraw() override
    {
        cout<<"Current account withdraw\n";
    }
   
};

void do_withdraw(account &ref)
{
    ref.withdraw();
}

int main()
{
    account acc;
    account &ref = acc;
    ref.withdraw();

    saving_account sa;
    account &ref1 = sa;
    ref1.withdraw();

    current_account ca;
    account &ref2 = ca;
    ref2.withdraw();
   
   account r1 ; 
   do_withdraw(r1);

   saving_account r2;
   do_withdraw(r2);

   current_account r3;
   do_withdraw(r3);
    


    return 0;
}