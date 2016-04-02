package Chapter2;

import java.util.Scanner;

/**
 * Financial application
 * This program calculates the total cost and gratitude rate
 * */

public class Exercise2_5 {

    public Exercise2_5(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the subtotal: ");
        double subtotal = in.nextDouble();
        System.out.print("Enter the gratitude rate (15% = 15): ");
        double gratitude = in.nextDouble();
        System.out.print("The gratitude is $" + (subtotal * (gratitude * 0.01)) + " and total is $" +(
                subtotal + (subtotal * (gratitude * 0.01))));

    }
}
