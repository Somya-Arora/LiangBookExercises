package Chapter3;

/**
 * Created by pjuda on 4/2/2016.
 */

import java.util.Scanner;

/**
 * Solving quadratic formula
 * */
public class E3_1 {

    public E3_1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        System.out.print("Enter c: ");
        double c = in.nextDouble();
        double r1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2*a);
        double r2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2*a);
        double discriminant = Math.sqrt(Math.pow(b,2) - 4 * a * c);
        if(discriminant > 0)
            System.out.print("The equation has two roots " + r1 + " and " + r2);
        else if(discriminant == 0)
            System.out.print("The equation has one root " + r1);
        else
            System.out.print("The equation has no real roots");
    }
}
