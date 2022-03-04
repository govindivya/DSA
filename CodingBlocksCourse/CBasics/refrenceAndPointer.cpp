#include<iostream>
using namespace std;


// pointer can be defined and initiased diffrently but refrence should be defined and initialsed at the same time
// pointer can be changed but refrence can be changed to another value
// refrnce are alias for a variable
// pointer has its own memory adress while refrence share same memory with  the variable 
// pointer can assinged null value but reference can't be asssined null value;
// we can have a pointer to pointer but can't have refrence to refrence 
// pointer support various operation but refrences do not

void pointerFunction(int *a){
    cout<<*a<<"\n";
   *a=50;
}
void refrenceFunction(int &a){
    cout<<a<<"\n";
    a=100;

}

int main(){
    int num=10;
    int num1=20;

    int *pointer=&num;
    // int *p;
    // p=&num;  it is correct;

    //pointer can be reassinged 

    pointer=&num1;
    // it is correct to reassign pointer to another variable
    
    int &refrence = num;
    // but 

    // int &refrence ;
    // refrence=a      
    //   it  is incorrect


    // refrence can't be reassined 
    // &refrence = num1              
    //  is incorrect 

    // cout<<refrenceFunction(num1);
    refrence=100;
    cout<<num1;

}