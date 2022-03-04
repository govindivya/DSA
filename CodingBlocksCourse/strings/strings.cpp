#include <iostream>
#include <string.h>
using namespace std;

//  spliting string using  char *strtok(*char s,const char* t) function
int main()
{
    char str[80] = "This is www.tutorialspoint.com  website";
    const char s[2] = " ";
    char *token;

    /* get the first token */
    token = strtok(str, s);

    /* walk through other tokens */
    while (token != NULL)
    {
        printf(" %s\n", token);
        token = strtok(NULL, s);
    }

    return (0);
}
