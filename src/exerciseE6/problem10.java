package exerciseE6;

import java.util.Scanner;

public class problem10 {
    /*
    To read a positive integer value and to output the bonus received by the user.
    Bonuses are awarded according to the remainder in the division of that integer value by 4 as follows:
    REMAINDER BONUS
    0           200
    1           350
    2           200
    3           500
    */

    public static void main(String[] args) {
        int positiveInteger = 0;
        int remainder = 0;
        int bonus = 0;

        Scanner readUserInput = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        positiveInteger = readUserInput.nextInt();

        remainder = positiveInteger % 4;

        System.out.println("Remainder is: " + remainder);

        if(remainder == 0 || remainder == 2)
            bonus = 200;
        else if(remainder == 1)
            bonus = 350;
        else if(remainder == 3)
            bonus = 500;

        System.out.println("Bonus is: " + bonus);
    }
}
