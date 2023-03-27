package exerciseE6;

import java.util.Scanner;

public class problem09 {
    /*
    To read the speed of a car and to output the corresponding fine.
    The fines are imposed for speeding violations as follows:
    $0.00 for a speed <= 50 mph;
    $15.00 for a speed such that 50 < speed <= 70;
    $30.00 for a speed such that 70 < peed <= 80; and
    $60.00 for a speed such that speed > 80.
    */

    public static void main(String[] args) {

        Scanner readUserData = new Scanner(System.in);
        System.out.print("Enter the speed of the Car: ");
        double speedOfCar = readUserData.nextDouble();
        double speedingViolation = 0;

        if (speedOfCar <= 50.0)
            speedingViolation = 0.00;
        else if (speedOfCar > 50 && speedOfCar <= 70)
            speedingViolation = 15.00;
        else if (speedOfCar > 70 && speedOfCar <= 80)
            speedingViolation = 30.00;
        else if (speedOfCar > 80)
            speedingViolation = 60.00;

        System.out.println("The speeding Violation is $ :" + speedingViolation);
        readUserData.close();
    }
}
