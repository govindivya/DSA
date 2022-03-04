#include <bits/stdc++.h>
using namespace std;

string swap(string str, int n, int m)
{
    char c = str[n];
    str[n] = str[m];
    str[m] = c;
    return str;
}
void permute(string s, int n, int k)
{
    if (k >= n)
    {
        cout << s << "\n";
        return;
    }
    else
    {
        for (int i = k; i < n; i++)
        {
            s = swap(s, i, k);
            permute(s, n, k + 1);
            s = swap(s, i, k);
        }
    }
}
int main()
{
    permute("ABC", 3, 0);
}