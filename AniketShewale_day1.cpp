#include <iostream>
using namespace std;
// Driver Code
int main()
{
    char c;
    cout << "Enter a character:";
    cin >> c;

    if (isalpha(c))
    {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            cout << "Character is Vowel" << endl;
        }
        else
        {
            cout << "Character is Consonant" << endl;
        }
    }
    else
    {
        cout << "Invalid Input" << endl;
    }

    return 0;
}