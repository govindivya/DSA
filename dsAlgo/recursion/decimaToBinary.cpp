#include <iostream>
#include <cstring>

using namespace std;

string decimalToBinary(int n, string s)
{

    if (n == 0)
    {
        return s;
    }
    int q = n % 2;
    if (q == 1)
    {
        s = "1" + s;
    }
    else
    {
        s = "0" + s;
    }
    return decimalToBinary(n / 2, s);
}

int main()
{
    cout << decimalToBinary(256, "");
}