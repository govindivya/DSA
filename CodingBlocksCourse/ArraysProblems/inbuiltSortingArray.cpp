#include<iostream>
#include<algorithm>
using namespace std;

bool compareDecrease(int a,int b){
   return a>b; 
}
bool compareIncrease(int a,int b){
   return a<b; 
}

int main(){
int n;
cin>>n;
int arr[n];
for(int i=0;i<n;i++){
    cin>>arr[i];
}
// sort in increasing order 
sort(arr,arr+n);
// sort increasing order 
sort(arr,arr+n,compareIncrease);
// sort decresing order 
sort(arr,arr+n,compareDecrease);
for(int i=0;i<n;i++){
    cout<<arr[i]<<+" ";
}

}