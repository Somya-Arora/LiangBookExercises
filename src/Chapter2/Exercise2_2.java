package Chapter2;

import java.util.Scanner;

/**
 * This program calculates the area and volume of a cylinder
 * */


public class Exercise2_2 {

    public Exercise2_2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius a cylinder: ");
        double radius = in.nextDouble();
        System.out.print("Enter the length a cylinder: ");
        double length = in.nextDouble();
        double area = radius * 3.14159265 * radius;
        double volume = area * length;
        System.out.print("The area is " + area + "\nThe volume is " + volume);
    }

}
