#include <iostream>
#include<math.h>
using namespace std;


int partition(int arr[], int low, int high)
{
    int num = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++)
    {
        if (arr[j] <= num)
        {
            i++;
            int num1 = arr[i];
            arr[i] = arr[j];
            arr[j] = num1;
        }
    }
    int num2 = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = num2;
    return i + 1;
}

void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int q = partition(arr, low, high);
        quickSort(arr, low, q - 1);
        quickSort(arr, q + 1, high);
    }
}

int main()
{
    int arr[] = {10, 9, 8, 12, 14, 16, 6, 5, 10, 2, 1, 16, 19, 32, 22};
    quickSort(arr, 0, 15);
    cout << arr[0] << "\n";
}