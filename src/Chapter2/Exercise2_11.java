package Chapter2;

/**
 * Created by pjuda on 4/2/2016.
 */


import java.util.Scanner;

/**
 * Population projection
 * */

public class Exercise2_11 {

    public Exercise2_11() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of years:");
        long years = in.nextLong();
        long totalSeconds = years * 365 * 24 * 60 * 60;
        long births = totalSeconds /7;
        long deaths = totalSeconds /13;
        long immigrants = totalSeconds /45;
        long originalPop = 312032486;
        System.out.println("The population in " + years + " is " + (originalPop + births + immigrants - deaths));
    }
}
