 #include<iostream>
 using namespace std;

static int a=1;
int main(){
     if(a<=17){
         cout<<a<<"\n";
         a++;
         main();

     }
 }