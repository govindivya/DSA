#include <bits/stdc++.h>
using namespace std;

const double h = 0.01;
double fx(double x, double y)
{
    return x * x * x + y;
}

double newtonRaphson(){
    
}
void solve_Euler(double x0, double y0, double x)
{

    double y = y0;
    double x1 = x0;
    while (x1 < x)
    {
        y += h * fx(x1, y);
        x1 += h;
    }
    cout << "f(x) at " << x << " is :" << y << "\n";
}

int main()
{
    solve_Euler(0, 1, 0.02);
}