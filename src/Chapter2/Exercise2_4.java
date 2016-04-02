package Chapter2;

import java.util.Scanner;

/**
 * This program converts pounds into kilograms
 * */

public class Exercise2_4 {

    public Exercise2_4(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = in.nextDouble();
        System.out.println(pounds + " pounds is " + (0.454 * pounds) + " kilograms");
    }

}
