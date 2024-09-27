// Pure Virtual Function and Abstract classes.

#include<bits/stdc++.h>
using namespace std;

class Shape               // shape is a abstract class it provide only the declaration of function not it implementation
{
    public:

    virtual void draw() = 0; // function assing with = 0 are pure virtual function.
    virtual void rotate() = 0; // pure virtual function or abstract function 
    virtual ~Shape()
    {
         cout<<"Releasing shape memory\n";
    }
};

class closed_area : public Shape
{
    public :
    virtual void draw() //override // it is also a abstract class because it does not override the abstract class methods ( Shape class).
    {

    } 
};

class circle : public Shape
{
    public : 
    virtual void draw() override
    {
        cout<<"Drawing a circle\n";
    }
    virtual void rotate() override
    {
        cout<<"Rotating a cirlce\n";
    }
    virtual ~circle(){cout<<"Releasing circle memory\n";}
};

class square : public Shape
{
    public :
    virtual void draw() override
    {
        cout<<"Drawing a square\n";
    }
    virtual void rotate() override
    {
        cout<<"Rotating a square\n";
    }
    virtual ~square(){
        cout<<"Releasing square memory\n";
    }
};

int main()
{
    /* We cannot create object to abstract classes as abstract classes only provide declaration of a function not its implementation.
    following object creation will give error. 
    Shape s;
    Shape *ptr = new Shape();
    */

    /*
    Similarly we cannot create object to closed circle class inherited from class shape as it does not override the abstract class function.
    closed_area obj;
    closed_area *ptr = new closed_area();
    */

    Shape *ptr = new circle();
    Shape *ptr1 = new square();
    

    vector<Shape*> shapes{ptr , ptr1};
    for(const auto i:shapes)
    {
        i->draw();
        i->rotate();
    }

    cout<<"=====Deleting=====\n";
    delete ptr;
    delete ptr1;
    return 0;
}