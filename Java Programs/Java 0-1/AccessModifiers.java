class Animal{
    private String name;
    protected int legs;

    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }
    public String getName(){
        return this.name;
    }

    public int getLegs(){
        return this.legs;
    }
}

class Dog extends Animal{
    public Dog(String name, int legs){
        super(name,legs);
    }
    void showName(){
        // System.out.println(super.name);
    }

    void showLegs(){
        System.out.println(super.legs);
    }
}

public class AccessModifiers {
    public static void main(String[] args){
        Animal animal1 = new Animal("janwar",6);
        System.out.println(animal1.getName());
        Dog dog1 = new Dog("kalia",12);
        System.out.println(dog1.getName());
        dog1.showLegs();
        // System.out.println(animal1.name + dog1.name);
        System.out.println(animal1.legs + " " +dog1.legs);

        String s1 = new String("Khush");
        String s2 = new String("Khush");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
