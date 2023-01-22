#include <iostream>
using namespace std;
// Driver Code
int main()
{
    int num;
    cout<<"Enter a number"<<endl;
    cin>>num;
    if(num == 0){
        cout<<"Neither positive nor negative"<<endl;
    }
    else if(num < 0){
        cout<<"Negative number"<<endl;
    }
    else{
        cout<<"Positive number"<<endl;
    }
    return 0;
}