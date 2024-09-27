// Write a program to achieve multiple inheritance in java.
import java.util.*;
class t1
{
    void func()
    {
        System.out.println("Inside class t1");
    }
};

class t2
{
    void func()
    {
        System.out.println("Inside class t2");
    }
}
 class mul_inh extends t1,t2
 {
     public static void main(String[] args)
     {
         mul_inh m = new mul_inh();
         m.func();
     }
 } 