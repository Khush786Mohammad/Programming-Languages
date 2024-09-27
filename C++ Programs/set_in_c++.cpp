#include<bits/stdc++.h>
using namespace std;
int main()
{
    set<int> s {4,6,1,7,2,4,1,5,7,3,1,2};
    for(auto a : s)
    {
        cout<<a<<" ";
    }
    auto loc = s.end();
    cout<<*loc;
    cout<<endl;
    s.insert(10);
    s.insert(11);
    s.insert(10);
    for(auto a : s)
    cout<<a<<" ";
    auto it = s.find(5);
    if(it != s.end())
    cout<<*it<<endl;


    unordered_set<int> ss{32,4,1,3,2,4,2,1,5,6,4};
    for(auto a : ss)
    cout<<a<<" ";
    return 0;
}