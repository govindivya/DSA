#include <iostream>
using namespace std;

void binarystring(string s, int n, int k)
{
    if (k == n)
    {
        cout<<s<<"\n";
        return;
    }
    else
    {
        s[k] = '0';
        binarystring(s, n, k + 1);
        s[k] = '1';
        binarystring(s, n, k + 1);
    }
}
int main()
{
    string str = "00000";
    binarystring(str,5,0);

    return 0;
}