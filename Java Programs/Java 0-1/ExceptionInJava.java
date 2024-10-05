public class ExceptionInJava {
    public static void main(String[] args) {

        //checked exception are check at compile time and can handle using try and catch block
        // Thread.sleep(1000);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //uncheck exception are check at runtime and generally give error like division by zero or accessing 
        //out of bound array values;

        int[] values = {1,2,3,4};
        System.out.println(values[5]);
    }
}
