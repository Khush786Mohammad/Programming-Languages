import java.util.*;

class Animal implements Cloneable{
    private int age;
    private String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }

    public String toString(){
        return age+" "+name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class DeepCopy{
    public static void main(String[] args){
        Animal obj1 = new Animal(22,"Dog");
        Animal obj2 = new Animal(3,"Cat");

        System.out.println(obj1.toString());
        try{
            Animal newObj = (Animal) obj1.clone();
            newObj.setName("Bull");
            System.out.println(newObj.toString());
        }
        catch(CloneNotSupportedException e){
            System.out.println("Clone not supported");
        }
        
        
        System.out.println(obj1.toString());
    }
    
}
