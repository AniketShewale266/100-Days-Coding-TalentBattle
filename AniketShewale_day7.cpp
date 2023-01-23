// Get the number of month and year as input from the user and check the number of days present in that month.
#include <iostream>
using namespace std;
int main()
{
    int month;
    int year;
    cout << "Enter Month" << endl;
    cin >> month;
    cout << "Enter Year" << endl;
    cin >> year;

    int arr[13] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 29};

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
    {
        if (month == 2)
        {
            cout << "Number of days present in this month is " << arr[12];
        }
        else
        {
            for (int i = 1; i <= 12; i++)
            {
                for (int j = i; j <= i; j++)
                {
                    if (i == month)
                    {
                        cout << "Number of days present in this month is " << arr[j - 1] << endl;
                    }
                }
            }
        }
    }
    else{
          for (int i = 1; i <= 12; i++)
            {
                for (int j = i; j <= i; j++)
                {
                    if (i == month)
                    {
                        cout << "Number of days present in this month is " << arr[j - 1] << endl;
                    }
                }
            }
    }
    return 0;
}