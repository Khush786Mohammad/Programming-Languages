public class Cat{
    String name;
    int age;
    String[] favFood = {"Milk","Chicken","Catnip"};
    int fetchCounter = 0;

    public Cat(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void meow(){
        System.out.println("Maaow");
    }

    public int age(int age){
        return this.age + 7;
    }

    public void fetch(){
        this.fetchCounter = (this.fetchCounter + 1) % 3;
        String newFood = this.favFood[this.fetchCounter];
        System.out.println("Cat Favouirate Food is " + newFood);
    }

}
