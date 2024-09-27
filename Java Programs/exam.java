// import java.util.*;
// class rectangle
// {
//     int l,b;
//     void getdata(int x , int y)
//     {
//         l=x;
//         b=y;
//     }
//     int area()
//     {
//         return l*b;
//     }

// };
// class exam{


// public static void main(String[] args)
// {
//     rectangle r1 = new rectangle();
//     r1.getdata(10,20);
//     System.out.println("Area = "+r1.area());

// }
//// }
// import java.util.*;
// class rectangle
// {
//     int l , b;
//     rectangle(int x , int y)
//     {
//         l=x;
//         b=y;
//     }
//     int area()
//     {
//         return l*b;
//     }
// }
// class exam
// {
//     public static void main(String[] args)
//     {
//         rectangle r1 = new rectangle(10,20);
//         int area = r1.l * r1.b;
//         System.out.println("area=" +area);
//     }
// }

import java.util.*;
class employee
{
    int id; 
    String name;
    int salary;

    employee(int i ,String s)
    {
        id = i; 
        name =s;
    }
    employee(int i , String s , int sal)
    {
       this.id=i;
        this.name = s;
        this.salary =sal;
    }
    employee()
    {
        System.out.println("I am an employee class");
    }
    void show()
    {
        System.out.println("id ="+id+"name="+name+"salary="+salary);
    }
};
class exam{
    public static void main(String[] args)
    {
        employee e1 = new employee();
        employee e2 = new employee(20,"Unknown");
        employee e3 = new employee(21,"khush",1000000);
        e1.show();
        e2.show();
        e3.show();
    }
    
}