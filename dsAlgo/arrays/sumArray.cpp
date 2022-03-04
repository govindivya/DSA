#include <iostream>

using namespace std;

int main()
{
    int n, s;
    cin >> n >> s;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int start = 0, end = 0, sum = 0;
    while (end < n)
    {
        sum += a[end];

        if (sum == s)
        {
            cout << start + 1 << " " << end + 1 << endl;
            return 0;
        }
        while (sum >= s)
        {
            if (sum == s)
            {
                cout << start + 1 << " " << end + 1<<endl;
                return 0;
            }
            sum -= a[start];
            start++;
        }
        end++;

    }
    cout << "-1" << endl;
}