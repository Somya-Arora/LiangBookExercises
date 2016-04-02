package Chapter2;

import java.util.Scanner;

/**
 * This program converts Celcius to Farenheit
 * */


public class Exercise2_1 {

    public Exercise2_1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a degree in Celcius: ");
        double celcius = in.nextDouble();
        double farenheit = (9.0/5.0) * celcius + 32.0;
        System.out.println("\n" + celcius + " Celcius is " + farenheit + " Farenheit");
    }

}



