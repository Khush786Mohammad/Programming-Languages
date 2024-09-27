// import java.util.*;

// class test
// {
//     void show(String s)
//     {
//         System.out.println("String method");
//     }

//     void show(int i)
//     {
//         System.out.println("Integer Method");
//     }
    
// }

// public class meth
// {
//     public static void main(String[] args)
//     {
//         test t = new test();
//         t.show("abc");
//         t.show(10);
//         t.show('a');
//     }
// }

// import java.util.*;
// class test
// {
//     void show(String s)
//     {
//         System.out.println("String Method");
//     }
//     void show(Object o)
//     {
//         System.out.println("Object Method");
//     }
// }

// public class meth
// {
//     public static void main(String[] args)
//     {
//         test t = new test();
//         t.show("khush");
//         t.show(19);
//         t.show('A');
//     }
// }

import java.util.*;
class test
{
    void show(int a , float b)
    {
        System.out.println("Integer float method");
    }
    void show(float a , int b)
    {
        System.out.println("Float integer Method");
    }
    
}

public class meth
{
    public static void main(String[] args)
    {
        test t = new test();
        t.show(10, 20.3f);
        t.show(20.33f , 20);
       
        //t.show(10 ,10);//Ambiguity Arises.
    }
}