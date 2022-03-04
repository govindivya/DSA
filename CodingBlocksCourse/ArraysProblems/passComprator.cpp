#include <iostream>
using namespace std;

bool compare(int a, int b)
{
    return a > b;
}

// acceoting function pointer as parameters
void bubbleSort(int a[], int n, bool (&comp)(int a, int b))
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            // calling comparator function by refrence
            if (comp(a[i], a[j + 1]))
            {
                // swap a[i] and a[i+1];this
            }
        }
    }
}
int main()
{
}