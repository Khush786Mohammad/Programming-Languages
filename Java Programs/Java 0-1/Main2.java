public class Main2 {
    public static void main(String[] args){
        Cat myCat = new Cat("Bilauta",2);
        myCat.meow();

        int newAge = myCat.age(2);
        System.out.println("My Cat age in human years is " + newAge);

        myCat.fetch();
    }
}
