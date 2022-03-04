#include <bits/stdc++.h>
using namespace std;

int getVal(int (*A)[5], int i, int j, int l, int h)
{
    if (i < 0 || i >= l || j < 0 || j >= h)
    {
        return 0;
    }
    else
    {
        return A[i][j];
    }
}
void maxCell(int (*A)[5], int r, int c, int l, int h, int size, bool **cntarr, int &maxsize)
{
    if (r >= l || c >= h)
    {
        return;
    }
    cntarr[r][c] = true;
    size++;
    if (size > maxsize)
    {
        maxsize = size;
    }
    int direction[][2] = {{-1, 0}, {-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}};

    for (int i = 0; i < 8; i++)
    {
        int newi = r + direction[i][0];
        int newj = c + direction[i][1];
        int val = getVal(A, newi, newj, l, h);
        if (val > 0 && cntarr[newi][newj] == false)
        {
            maxCell(A, newi, newj, l, h, size, cntarr, maxsize);
        }
    }
    cntarr[r][c] = false;
}
int getMaxOnes(int (*A)[5], int rmax, int colmax)
{
    int maxSize = 0;
    int size = 0;
    bool **cntarr = new bool *[rmax];
    for (int i = 0; i < rmax; i++)
    {
        cntarr[i] = new bool[colmax];
    }
    for (int i = 0; i < rmax; i++)
    {
        for (int j = 0; j < colmax; j++)
        {
            if (A[i][j] == 1)
            {
                maxCell(A, i, j, rmax, colmax, 0, cntarr, maxSize);
            }
        }
    }
    return maxSize;
}

int main()
{
    int arr[5][5] = {{1, 1, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {0, 1, 0, 1, 1}};
    cout << getMaxOnes(arr, 5, 5);
}