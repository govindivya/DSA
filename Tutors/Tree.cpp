#include <iostream>
using namespace std;


struct node
{
    char op;
    double data;
    node *left;
    node *right;

    node(double _data)
    {
        data = _data;
    }
    node(char _op)
    {
        op = _op;
    }
};
node* root;

node* ExpTree(istream &f){
    
}
