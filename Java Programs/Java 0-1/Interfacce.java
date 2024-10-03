interface Animal{
    public void animalSound();
    public void animalNickname();
    public void animalRunning();
}

abstract class SetAttributes{
    private String name;
    private int age;

    public SetAttributes(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void Sleeping(){
        System.out.println("Whatever is animal is it is sleeping");
    }
}

class Dog extends SetAttributes implements Animal{
    public Dog(String name, int age){
        super(name,age);
    }

    @Override
    public void animalSound(){
        System.out.println("Bhawo Bhaow");
    }

    @Override
    public void animalNickname(){
        System.out.println("Stepherd");
    }

    @Override public void animalRunning(){
        System.out.println("Animal is running");
    }
}

class Cat extends SetAttributes implements Animal{
    private String color;
    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public void animalSound(){
        System.out.println("Meaoooooooo");
    }

    @Override
    public void animalNickname(){
        System.out.println("Asteroid Destroyer");
    }

    @Override public void animalRunning(){
        System.out.println("Cat is not running");
    }

}

public class Interfacce {
    public static void main(String[] args){
        Dog dog1 = new Dog("Riley",8);
        System.out.printf("Dog name is "+dog1.getName() +" and is %d years old",dog1.getAge()).println();
        dog1.animalNickname();
        dog1.animalRunning();
        dog1.animalSound();
        dog1.Sleeping();

        Cat cat1 = new Cat("Bilaumta", 3, "Yellow");
        System.out.printf("Cat name is "+cat1.getName() +" and its color is "+cat1.getColor()+ " and is %d years old",cat1.getAge()).println();
        cat1.animalNickname();
        cat1.animalRunning();
        cat1.animalSound();
    }
}
