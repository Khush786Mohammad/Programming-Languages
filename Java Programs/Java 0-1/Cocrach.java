public class Cocrach extends Insects{
    int length;

    public Cocrach(int age, int legs , int length){
        super(age,legs);
        this.length = length;
    }

    public void says(){
        System.out.println("I will teriffy you");
    }

    public void jump(){
        System.out.println("Yes cocrach can jump");
    }
}
