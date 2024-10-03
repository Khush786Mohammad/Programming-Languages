//abstract classes provid 0-100 abstraction level as some methods in abstract classes may have a body like
// the method sleeping() inside the abstract class Animal which provide the information about the implementation to the user.
abstract class Animal{
    private String name;
    private int legs;

    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }

    public void sleeping(){
        System.out.println("ZZZzzzzz");
    }

    public abstract void animalSound();

    public abstract void food();

    public abstract String animalNickName();
    //getter
    public String getName(){
        return this.name;
    }
    public int noLegs(){
        return this.legs;
    }
}

class Dog extends Animal{

    public Dog(String name, int legs){
        super(name,legs);
    }
    @Override
    public void animalSound(){
        System.out.println("Bhoo Bhooo Bhawooo");
    }

    @Override
    public void food(){
        System.out.println("Dog eats biscuits");
    }

    @Override
    public String animalNickName(){
        return "doggyo";
    }
}

class Cat extends Animal{
    public Cat(String name, int legs){
        super(name,legs);
    }

    @Override
    public void animalSound(){
        System.out.println("Meaow Meowww");
    }

    @Override
    public void food(){
        System.out.println("Cat eat brain");
    }

    @Override
    public String animalNickName(){
        return "Asteroid Destroyer";
    }
}

public class AbstractClassEx2{
    public static void main(String[] args){
        Dog dog1 = new Dog("Kaalu",4);
        System.out.println("Dog name is " +dog1.getName() +" and have " +dog1.noLegs()+" legs");
        System.out.println(dog1.animalNickName());
        dog1.animalSound();
        dog1.food();

        Animal cat1 = new Cat("Bilaumta",8);
        System.out.println("Cat name is " +cat1.getName() +" and have " +cat1.noLegs()+" legs");
        System.out.println(cat1.animalNickName());
        cat1.animalSound();
        cat1.food();
        cat1.sleeping();

        
    }
}