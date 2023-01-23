#include <iostream>
using namespace std;
int main()
{
    int x,y;
    cout<<"Enter value of X"<<endl;
    cin>>x;
    cout<<"Enter value of Y"<<endl;
    cin>>y;
    
    if(x > 0 && y > 0){
        cout<<"This point lies in first quadrant"<<endl;
    }
    else if(x < 0 && y > 0){
        cout<<"This point lies in second quadrant"<<endl;
    }
    else if(x < 0 && y < 0){
        cout<<"This point lies in third quadrant"<<endl;
    }
    else{
       cout<<"This point lies in four quadrant"<<endl; 
    }

    return 0;
}