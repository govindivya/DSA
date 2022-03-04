#include <bits/stdc++.h>
using namespace std;

void karry(string s, int n, int k, int l)
{
    if (k == n)
    {
        cout << s << "\n";
        return;
    }
    else
    {
        karry(s, n, k + 1, l);
        for (int i = 1; i <= l; i++)
        {
            if (i == 1)
            {
                s[k] = '1';
            }
            else if (i == 2)
            {
                s[k] = '2';
            }

            else if (i == 3)
            {
                s[k] = '3';
            }
            else if (i == 4)
            {
                s[k] = '4';
            }
            else
            {
                s[k] = '5';
            }

            karry(s, n, k + 1, l);
        }
    }
}
int main()
{
    string str = "00000";
    karry(str, 5, 0, 5);
    return 0;
}