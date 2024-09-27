#include<bits/stdc++.h>
using namespace std;
int main()
{
    vector<int> v = {1,2,3,4,5,6,7,8,9};
    vector<int>::reverse_iterator it1 = v.rbegin();
    while(it1 != v.rend())
    {
        cout<<*it1<<" ";
        ++it1;
    }
    v.clear();
    cout<<" ";
    cout<<v.size();
  
    return 0;
}