#include<bits/stdc++.h>
using namespace std;
int main()
{
    // list<int> l {19 , 23,5,23, 21, 4,6};
    // for(auto a : l)
    // cout<<a<<" ";
    // cout<<endl;
    // l.push_back(0);
    // l.push_back(99);
    // l.push_front(3);
    // l.push_front(11);
    // for(auto a : l)
    // cout<<a<<" ";
    // cout<<"\n"<<l.size();
    // auto it = find(l.begin() , l.end() , 21);
    // if(it != l.end())
    // cout<<it-l.begin();
    vector<int> v { 3,6,32,8,9};
    vector<int>::iterator it;
    auto loc = find(v.begin() , v.end() , 8);
    if(loc != v.end())
    cout<<loc - v.begin();
    return 0;
}