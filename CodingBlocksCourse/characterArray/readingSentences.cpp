#include<iostream>

using namespace std;


void readline(char arr[],int maxLen){
    int i=0;
    char c=cin.get();
    while(c!='\n' && i<maxLen-1){
     arr[i]=c;
     c=cin.get();
     i++;
    }
    arr[maxLen-1]='\n';
}

void readStences(){
    const char * vogan= R"(Hello mini
    How are you ?
    I hope you are very well;
    )";
    int i=0;
    cout<<vogan<<" ";
    delete vogan;
}
int main(){
//  char arr[10]={};
//  readline(arr,10);
//  int i=0;
//  while(arr[i]!='\n'){
//      cout<<arr[i];
//      i++;
//  }
readStences();
}