// /*
//     *
//    **
//   ***
//  ****

//  */

// #include<iostream>
// using namespace std;
// int main()
// {
//     int n;
//     cin>>n;
//     for(int i = 0 ; i < n ; i++)
//     {
//         for(int space = 0 ; space < n-i-1 ; space++)
//         {
//             cout<<" ";
//         }
//         for(int j = 0 ; j<=i;j++)
//         {
//             cout<<"*";
//         }
//         cout<<endl;
//     }
   
//     return 0;
// }
#include<iostream>
using namespace std;
int main()
{
    int a = 1 ;
    printf("%d",++a + a++ + ++a);
    return 0;
}