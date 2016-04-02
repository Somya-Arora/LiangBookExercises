package Chapter2;

import java.util.Scanner;

/**
 * Summing the digits in an integer
 * */
public class Exercise2_6 {

    private Scanner in;
    private int digit = -1;


    public Exercise2_6(){
        in = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number between 0 and 1000:");
            digit = in.nextInt();
            if(digit>0 && digit < 1000) {
                int total = 0;
                int digitLength = String.valueOf(digit).length();
                for(int i = 0; i < digitLength;i++) {
                    total += digit % 10;
                    digit /= 10;
                }
                System.out.print("The sum of the digits is " + total);
                return;
            }
            else {
                System.out.println("Bad number!");
            }
        }
    }
}
