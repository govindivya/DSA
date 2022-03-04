#include<iostream>
using namespace std;

int main(){

    enum days {Sun,Mon,Tues,Wed,Thu,Fri,Sat};
    // enum is set of all possible value of some type of data and they are internally stored as 0,1,2,3,4,5,......
    // they can be added and subtracted and those calculation can be done which can be  done on the integer.
    // they ar helpful while using some specific type of data whose values are restricted and so useful
    days day1,day2;
    day1=Sun;
    day2=Sun;
    cout<<day1+day2;
    days day3=Tues;
    cout<<day3;

}