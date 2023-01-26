#include <iostream>
using namespace std;
int main()
{
    int no;
    cout<<"Enter a Number"<<endl;
    cin>>no;
    int temp = no;
    int rem,cnt=0;
    while (no > 0)
    {
        rem = no % 10;
        cnt++;
        no = no / 10;
    }
    cout<<"Number of digits in the "<<temp<<" is "<<cnt<<endl;
    
    return 0;
}