#include <bits/stdc++.h>
using namespace std;

class Heap
{
private:
    double *arr;
    int size = 0, capacity;

public:
    Heap(int n)
    {
        this->capacity = n;
        this->arr = new double[n];
    }
    Heap()
    {
        this->capacity = 100;
        this->arr = new double[100];
    }
    bool insert(double num)
    {
        if (this->capacity > this->size)
        {
            this->arr[size] = num;
            size++;
        }
        else
        {
            int n = this->capacity;
            double *arr = new double[2 * n];
            for (int i = 0; i < this->size; i++)
            {
                arr[i] = this->arr[i];
            }
            arr[this->size] = num;
            size++;
            this->capacity *= 2;
            delete[] this->arr;
            this->arr = arr;
        }
        maintainInsert();
    }
    void maintainInsert()
    {
        int index = this->size - 1;
        while (index > 0 && this->arr[(index - 1) / 2] < this->arr[index])
        {
            double value = this->arr[index];
            this->arr[index] = this->arr[(index - 1) / 2];
            this->arr[(index - 1) / 2] = value;
            index = (index - 1) / 2;
        }
    }
    void maintainRemove(int i)
    {
        int index = i;
        while (2 * index + 1 < this->size)
        {
            if (2 * index + 2 < this->size)
            {
                if ((this->arr[2 * index + 1] > this->arr[index]) || (this->arr[2 * index + 2] > this->arr[index]))
                {
                    int maxIndex;
                    if (this->arr[2 * index + 1] > this->arr[2 * index + 2])
                    {
                        maxIndex = 2 * index + 1;
                    }
                    else
                    {
                        maxIndex = 2 * index + 2;
                    }
                    double val = this->arr[index];
                    this->arr[index] = this->arr[maxIndex];
                    this->arr[maxIndex] = val;
                    index = maxIndex;
                }
                else
                {
                    break;
                }
            }
            else
            {
                if (this->arr[index] < this->arr[2 * index + 1])
                {
                    double val = this->arr[index];
                    this->arr[index] = this->arr[2 * index + 1];
                    this->arr[2 * index + 1] = val;
                }
                else
                {
                    break;
                }
            }
        }
        this->size--;
    }
    int getSize()
    {
        return this->size;
    }
    int getCapacity()
    {
        return this->capacity;
    }
    bool remove(double num)
    {
        int index = find(num);
        if (index >= 0)
        {
            double val = this->arr[index];
            this->arr[index] = this->arr[this->size - 1];
            this->arr[this->size - 1] = val;
            maintainRemove(index);
        }
        return true;
    }
    int find(double num)
    {
        for (int i = 0; i < this->size; i++)
        {
            if (this->arr[i] == num)
            {
                return i;
            }
        }
        return -1;
    }
    ~Heap()
    {
        delete[] this->arr;
        this->arr = NULL;
    }
    double getMax()
    {
        return this->arr[0];
    }
    void removeTop()
    {
        double val = this->arr[this->size - 1];
        this->arr[this->size - 1] = this->arr[0];
        this->arr[0] = val;
        maintainRemove(0);
    }
};

int main()
{
    Heap heap(100);
    heap.insert(45);
    heap.insert(20);
    heap.insert(15);
    heap.insert(2);
    heap.insert(24);
    heap.insert(12);
    heap.insert(5);
    heap.insert(9);
    heap.insert(40);

    cout<<heap.getMax()<<"\n";
}