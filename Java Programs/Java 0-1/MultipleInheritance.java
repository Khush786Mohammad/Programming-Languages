interface Animal{
    public void breed();
    public void animalName();
}

interface Species{
    public void breed();
    public void existence();
}

class Cat implements Animal, Species{
    @Override
    public void breed(){
        System.out.println("Cat breed is persian");
    }

    @Override 
    public void animalName(){
        System.out.println("Cat name is Forps");
    }

    @Override
    public void existence(){
        System.out.println("Cat species still exists");
    }
}

class Dog implements Animal{
    @Override
    public void breed(){
        System.out.println("Dog breed is German");
    }

    @Override 
    public void animalName(){
        System.out.println("Dog name is Hamper");
    }
}

class Dinasours implements Species{
    @Override
    public void breed(){
        System.out.println("Dinasours breed is Agilsaurus");
    }

    @Override
    public void existence(){
        System.out.println("Dinasours existence came to end million of years ago");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        Cat cat1 = new Cat();
        cat1.animalName();
        cat1.breed();
        cat1.existence();

        System.out.println();

        Dog dog1 = new Dog();
        dog1.animalName();
        dog1.breed();

        System.out.println();
        Dinasours dino1 = new Dinasours();
        dino1.breed();
        dino1.existence();
    }
}
