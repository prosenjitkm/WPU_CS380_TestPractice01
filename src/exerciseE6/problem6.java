package exerciseE6;
import java.util.Scanner;

public class problem6 {
/*
    To read one or more temperature values in Fahrenheit and to convert them to Celsius.
    The sentinel value -99 marks the end of the input temperatures.
    You convert a Fahrenheit temperature to Celsius as follows: Celsius = 5.0 / 9 (Fahrenheit - 32).
 */
    public static void main(String[] args) {
        Scanner readUserData = new Scanner(System.in);

        double temperatureInFahrenheit = 0, temperatureInCelsius = 0;
        while(temperatureInFahrenheit != -99) {
            System.out.print("Enter temperature: ");
            temperatureInFahrenheit = readUserData.nextDouble();
            if(temperatureInFahrenheit != -99) {
                temperatureInCelsius = (5.0 / 9.0) * (temperatureInFahrenheit - 32);
                System.out.println("Conversion Result: " + temperatureInFahrenheit + " C = " + Math.round(temperatureInCelsius) + " F");
            }
        }
        readUserData.close();
    }
}
