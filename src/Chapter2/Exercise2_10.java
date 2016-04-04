package Chapter2;

/**
 * Created by pjuda on 4/2/2016.
 */

import java.util.Scanner;

/**
 * Calculating energy needed to heat water from initial temperature to final temperature
 * */
public class Exercise2_10 {

    public Exercise2_10(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double water = in.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemp = in.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = in.nextDouble();
        System.out.print("The energy needed is " + (water * (finalTemp - initialTemp) * 4184) + " joules");
    }
}
