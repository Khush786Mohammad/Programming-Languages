public class Spider extends Insects{
    boolean isPoisonous;

    public Spider(int age, int legs , boolean isPoisonous){
        super(age,legs);
        this.isPoisonous = isPoisonous;
    }

    public void crawl(){
        System.out.println("No spider is walking and flying");
    }

    public void spidy(){
        System.out.println("Spider age is : " + this.age + " " + " Spider have " + this.legs + " legs" + " and Spider is poisonous?" + this.isPoisonous);
    }
}
