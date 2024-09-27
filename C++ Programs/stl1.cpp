// #include<iostream>
// #include<algorithm>
// #include<vector>

#include<bits/stdc++.h>

using namespace std;

int main()
{
    vector<int> v {1,8,5,3,7,2};
    sort(v.begin() , v.end()));
    for(int aa: v)
    cout<<aa<<"  ";
    cout<<endl;
    reverse(v.begin() , v.end()));
    for(auto a : v)
    cout<<a<<"  ";

    //sum of vector .
    int sum;
    sum = accumulate(v.begin() , v.end() , 0);
    cout<<"\n"<<sum;

    return 0;
}
    editor.action.showHover
