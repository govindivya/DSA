#include <iostream>

using namespace std;

int main()
{
    int n, x, y;
    cin >> n >> x >> y;
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
        if (i % x == 0 || i % y == 0)
        {
            sum += i;
            cout<<i<<" ";
        }
    }
    cout << sum << "\n";
}