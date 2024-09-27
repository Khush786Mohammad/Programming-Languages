#include<bits/stdc++.h>
using namespace std;

template<typename T>
    T max_elem(T a , T b)
    {
        return (a>b)? a:b;
    }


int main()
{
    cout<<max_elem<int>(10 , 20)<<endl;
    cout<<max_elem<double>(13.4 , 34.5)<<endl;
    cout<<max_elem<char>('A' , 'z');

    return 0;
}