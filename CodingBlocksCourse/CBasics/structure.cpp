#include <iostream>
using namespace std;

// This is a structure

struct circle
{
    double xc0, yc0, r0;
};
struct sqaure
{
    double arms, diagonal;
};
struct cylinder
{
    double height, radius;
};
// This is a nested structures

struct geometryStruct
{
    circle c;
    sqaure sq;
    cylinder cyl;
};
int main()
{
    circle c1 = {10,10,10};
    sqaure sq={10,10};
    cylinder cyl={10,10};
    geometryStruct geometry={c1,sq,cyl};
    cout<<geometry.c.r0;
}