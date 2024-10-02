class Animal{
    private String species;
    private boolean canFly;
    private int age;
    public Animal(){
        this("Unknown");
        System.out.println("This is default constructor");
    }

    public Animal(String species){
        this(species,false);
        System.out.println("This is single para constructor");
    }

    public Animal(String species, boolean canFly){
        this(species,canFly,0);
        System.out.println("This is double para constructor");
         
    }
    public Animal(String species, boolean canFly, int age){
        this.species = species;
        this.canFly = canFly;
        this.age = age;

        System.out.println("Species: "+this.species+" Can Fly: "+this.canFly+" age: "+this.age);
    }

    public void displaySpecies(){
        System.out.println("Species: "+this.species);
    }
}

class Fish extends Animal{
    private String name;

    public Fish(){
        super("unknown");
        System.out.println("Default Constructor for fish");
    }

    public Fish(String name, String species){
        super(species);
        this.name = name;
    }
}

public class ConstructorChaining {
    public static void main(String[] args){
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Carnivores");
        Animal animal3 = new Animal("Birds",true);
        Animal animal4 = new Animal("Aquatic",false,300);

        Fish fish1 = new Fish();
        Fish fish2 = new Fish("Tuna","Aquatic");
        fish2.displaySpecies();
    }
}
