#include <iostream>
#include <cstring>
using namespace std;

string reverseString(string s)
{
    if (s == "")
    {
        return "";
    }
    else
    {
        return reverseString(s.substr(1)) + s[0];
    }
}
int main()
{

    string name = "Govind";
    cout << reverseString(name) << "\n";
}