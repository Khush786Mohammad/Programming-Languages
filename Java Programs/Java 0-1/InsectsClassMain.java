public class InsectsClassMain {
    public static void main(String[] args){
        Insects insects = new Insects(2,2);
        Spider spoider = new Spider(30,2,false);
        Cocrach bidu = new Cocrach(3,6,5);
        insects.crawl();
        insects.says();
        insects.jump();

        spoider.jump();
        spoider.spidy();

        bidu.says();
        bidu.jump();
    }
}
