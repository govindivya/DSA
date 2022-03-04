#include <iostream>
using namespace std;

// spiral print of array
int main()
{
    int row,col;
    cout << "Enter rows :";
    cin >> row;
    cout<<"Enter cols: ";
    cin>>col;
    cout << "\n";
    int array[row][col];
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            cin >> array[i][j];
        }
    }

    int top_row = 0;
    int bottom_row = row - 1;
    int left_col = 0;
    int right_col = col - 1;

    while (top_row < bottom_row && left_col < right_col)
    {
        for (int i = left_col; i < right_col; i++)
        {
            cout << array[top_row][i] << " ";
        }

        for (int i = top_row; i < bottom_row; i++)
        {
            cout << array[i][right_col] << " ";
        }
        for (int i =right_col; i > left_col; i--)
        {
            cout << array[bottom_row][i] << " ";
        }
        for (int i = bottom_row; i > top_row; i--)
        {
            cout << array[i][left_col] << " ";
        }

        left_col++;
        right_col--;
        top_row++;
        bottom_row--;


    }
}