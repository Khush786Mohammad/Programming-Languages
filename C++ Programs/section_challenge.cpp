#include<bits/stdc++.h>
using namespace std;

bool is_palindrome(const std::string &s)
{
    //write you code here...
    deque<char> d;
    for(auto c : s)
    {
        if(isalpha(c))
        {
            d.push_back(toupper(c));
        }
    }
    char c1 , c2;
    while(d.size() > 1)
    {
        c1 = d.back();
        
        c2 = d.front();
    
        if(c1 != c2)
        return false;
        d.pop_back();
        d.pop_front();
    }
    return true;
}

int main()
{
    std::vector<std::string> test_strings{"a" , "aa" ,"aba","abba","abbcbba","ab","abc",
    "radar","bob","A Toyota's a toyota"," A Santa at NASA","C++"};
    std::cout<<std::boolalpha;
    std::cout<<setw(8)<<std::left<<"Result"<<"String"<<std::endl;
    for(const auto &s:test_strings)
    {
        cout<<setw(8)<<std::left<<is_palindrome(s)<<s<<std::endl;
    }
    std::cout<<std::endl;
    return 0;
}