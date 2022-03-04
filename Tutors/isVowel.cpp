#include <iostream>
using namespace std;
bool isVowel(char ch){
if ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') || (ch == 'a') || (ch =='e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
return true;
}
else
{
return false;
}
}
int main()
{
    cout<<isVowel('l') ;
}