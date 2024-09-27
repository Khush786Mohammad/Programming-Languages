#include<iostream>
#include<algorithm>
#include<array>
using namespace std;
int main()
{
    
   std::array<int,6> arr{23,45,74,2,73,1};
   
   for(auto &a : arr)
   cout<<" "<<a;
   cout<<"\n";

//    int csount = count(arr.begin() , arr.end() , 2);
//    cout<<"\n"<<csount;
   sort(arr.begin() , arr.end() , [&](auto a , auto b){
    return a>b;
   });
   for(auto aa : arr)
   cout<<" "<<aa;
   return 0;
}