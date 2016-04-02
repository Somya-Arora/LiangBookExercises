package Chapter2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Finding the number of years from a given number of minutes
 * */

public class Exercise2_7 {

    public Exercise2_7(){
        System.out.print("Enter the number of minutes:");
        Scanner in = new Scanner(System.in);
        BigInteger minutes = in.nextBigInteger();
        BigInteger years = minutes.divide(BigInteger.valueOf(525600));
        BigInteger days = minutes.mod(BigInteger.valueOf(525600)).divide(BigInteger.valueOf(1440));
        System.out.print(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
