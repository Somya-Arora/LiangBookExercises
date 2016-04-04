package Chapter2;

/**
 * Created by pjuda on 4/2/2016.
 */

import java.util.Scanner;

/**
 * Calculating velocity
 * */
public class Exercise2_9 {

    public Exercise2_9(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter velocity final: ");
        double v1 = in.nextDouble();
        System.out.print("Enter velocity initial: ");
        double v2 = in.nextDouble();
        System.out.print("Enter time: ");
        double t = in.nextDouble();
        System.out.print("The average acceleration is " + (v1-v2)/t);


    }

}
