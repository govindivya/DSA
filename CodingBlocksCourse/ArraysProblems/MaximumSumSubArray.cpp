#include <iostream>

using namespace std;

void bruteForceMaxSum()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    int maxSum = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            int currentSum = 0;
            for (int k = i; k <= j; k++)
            {
                currentSum += arr[k];
            }
            if (currentSum > maxSum)
            {
                maxSum = currentSum;
            }
        }
    }
    cout << "Maxsum is :" << maxSum << " \n";
}
void optimizedMaxSum()
{
    //   using prefixSum array

    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    for (int i = 1; i < n; i++)
    {
        arr[i] += arr[i - 1];
    }
    int maxSum = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            if (arr[j] - arr[i] > maxSum)
            {
                maxSum = arr[j] - arr[i];
            }
        }
    }
    cout << maxSum;
}
void kadanesAlgo()
{

    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int maxSum = 0;
    int currentSum = 0;
    for (int i = 0; i < n; i++)
    {
        currentSum += arr[i];
        if (currentSum > maxSum)
        {
            maxSum = currentSum;
        }
        if (currentSum < 0)
        {
            currentSum = 0;
        }
    }
    cout << maxSum;
}
void maxCyclicSubArray()
{

    int n;
    cin >> n;
    int arr[n];
    int negArr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
        negArr[i] = -arr[i];
    }
    int maxSum = 0;
    int currentSum = 0;

    // Apply kadanes algo on negative of that array find  most negative subarray
    for (int i = 0; i < n; i++)
    {
        currentSum += negArr[i];
        if (currentSum > maxSum)
        {
            maxSum = currentSum;
        }
        if (currentSum < 0)
        {
            currentSum = 0;
        }
    }
    // sum the total array and remove most negative part subtract that sum from it  
    currentSum=0;
    for(int i=0;i<n;i++){
       currentSum+=arr[i]; 
    }
    currentSum+=maxSum;
    maxSum=currentSum;
    cout<<maxSum;
}
int main()
{
    // kadanesAlgo();
    // optimizedMaxSum();
    maxCyclicSubArray();
}