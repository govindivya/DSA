#include<iostream>
#include<cstring>

using namespace std;

bool isPalindrome(string s){
    if(s=="" || s.size()==1){
        return true;
    }
    if(s[0]==s[s.size()-1]){
        return isPalindrome(s.substr(1,s.size()-2));
    }
    else{
        return false;
    }
}
int main(){
cout<<isPalindrome("chamahc");
}