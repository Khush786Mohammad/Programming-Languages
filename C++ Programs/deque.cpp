#include<bits/stdc++.h>
using namespace std;
int main()
{
    deque<int> d {10 , 2 , 23 , 56 , 12};
    for(auto a : d)
    cout<<a<<" ";
    cout<<"\n";
    d.push_back(25);
    d.push_back(26);
    d.push_front(33);
    d.push_front(39);
    auto it = d.begin();
    while(it != d.end())
    {
        cout<<*it<<" ";
        it++;
    }
    cout<<endl;
    it = d.begin();
    sort(d.begin() , d.end() );
    while(it != d.end())
    {
        cout<<*it<<" ";
        it++;
    }
    
    
    cout<<"Size = "<<d.size()<<endl;
    cout<<"Max_size = "<<d.max_size()<<endl;
    cout<<endl;
    deque<int> d2 (10 , 11);
    for(auto a : d2)
    cout<<a<<" ";
    return 0;
}