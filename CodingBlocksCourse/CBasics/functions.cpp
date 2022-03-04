#include <iostream>

using namespace std;

// this is function prototype given arguments acts as default value if not passed when invoking the function
// function overloading  is done 
// it done on basis of number of parameters and type of parameters not on return type 
int sum(int, int);
int sum(int );
int sum();
int main()
{
    cout << sum(120)<<"\n";
    cout << sum(12, 9)<<"\n";
    cout << sum(10)<<"\n";
}

int sum(int a = 10, int b = 20)
{
    return a + b;
}
int sum(int a){
    return a;
}
int sum(){
    return 100;
}