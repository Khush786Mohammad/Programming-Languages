import java.math.BigInteger;
import java.util.Scanner;
public class Biginteger {
    public static void main(String[] args){
        int a = 10;
        BigInteger A;

        A = BigInteger.valueOf(a);
        System.out.println(A);

        BigInteger B = new BigInteger("12345678901112");
        System.out.println(B);

        BigInteger num1 = BigInteger.ONE;
        System.out.println(num1);

        BigInteger num2 = BigInteger.TEN;
        BigInteger result = num1.add(num2);
        System.out.println(result);

        String resu = result.toString();
        System.out.println(resu);

        //factorial of a number using bigIntegers

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        BigInteger factResult = fact(number);
        System.out.println(factResult);
        BigInteger bigValue = sc.nextBigInteger();
        BigInteger ans = factorial(bigValue);
        System.out.println(ans);
        sc.close();
    }

    public static BigInteger factorial(BigInteger num){
        if(num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }
        return num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }

    public static BigInteger fact(int num){
        if(num <= 1){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(num).multiply(fact(num-1));
    }
}
