#include <iostream>
using namespace std;
// Driver Code
int main()
{
    char alp;
    cout<<"Enter a Alphabet:";
    cin>>alp;

    if(isalpha(alp)){
        cout<<"Alphabet"<<endl;
    }
    else{
        cout<<"Not an alphabet"<<endl;
    }
    return 0;
}