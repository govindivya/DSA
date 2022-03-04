#include<iostream>
using namespace std;

bool isSorted(int arr[],int n){
    if(n==1){
        return true;
    }
    return arr[n-1]<arr[n-2]?false:isSorted(arr,n-1);
}
int main (){
    int arr[]={0,1,2,4,5,7,8,9};
    cout<<isSorted(arr,8)<<"\n";
}