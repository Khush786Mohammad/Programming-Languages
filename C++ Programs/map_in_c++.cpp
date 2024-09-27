#include<bits/stdc++.h>
using namespace std;
int main()
{
    map<int , int > m1 {{1,10} , {2,20} , {3,30} , {4,40} , {5,50}};
    // for(auto a : m1)
    // {
    //     cout<<a.first<<"\t"<<a.second;
    //     cout<<endl;
    // }
    map<int,int>::iterator it;
    for(it = m1.begin() ; it != m1.end() ; it++)
    {
        cout<<it->first<<"\t"<<it->second;
        cout<<endl;
    }
    m1.insert({5,60});
    //or
    m1.insert(pair<int,int>(6,60));
    m1.insert(pair<int,int>(7,70));
    m1.erase(4);
    cout<<"-------------"<<endl;
     for(it = m1.begin() ; it != m1.end() ; it++)
    {
        cout<<it->first<<"\t"<<it->second;
        cout<<endl;
    }
    return 0;
}