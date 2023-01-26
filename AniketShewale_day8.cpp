#include <iostream>
#include <math.h>
using namespace std;
// Driver Code
int main()
{
    int a, b, c;
    float r1,r2;
    cin >> a >> b >> c;
    float d = (b * b) - (4 * a * c);
    if (d > 0)
    {
        r1 = -b + sqrt(d) / (2 * a);
        r2 = -b - sqrt(d) / (2 * a);
        cout<<"The real roots "<<r1 <<" " <<r2;
    }
    else if (d == 0)
    {
        r1 = -b / (2 * a);
        r2 = -b / (2 * a);
        cout<<"roots are equal"<<endl;
        cout<<"Root 1 = Root 2 = "<<r1;
    }
    else{
      cout<<"Roots are imaginary";
    }
return 0;
}