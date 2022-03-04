#include <iostream>
using namespace std;

const int N = 10e6 + 2;
int a[N];
int aa[N];

int main()
{

    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        aa[i] = 0;
    }
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
        if (a[i] >= 0)
            aa[a[i]]++;
    }
    for (int i = 0; i < n; i++)
    {
        if (aa[i] == 0)
        {
            cout << i;
            break;
        }
    }
}