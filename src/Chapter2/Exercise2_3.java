package Chapter2;

import java.util.Scanner;

/**
 * This program converts feet into meters
 * */

public class Exercise2_3 {

    public Exercise2_3(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for feet:");
        double feet = in.nextDouble();
        System.out.println(feet + " feet is " + (feet*0.305) + " meters");
    }
}
