package exerciseE7;

import java.util.Scanner;

public class problem01a {

    /*
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char letter;
        int num = 10;
        letter = scan.next().charAt(0);
        if (letter == 'A')
        {
            System.out.println ("Apple");
            num += 5;
        }
        else if (letter == 'Y')
        {
            System.out.println ("Yellow");
            num ++ ;
        }
        else if (letter == 'G')
            System.out.println ("Green");
        else
            System.out.println ("Invalid");

        System.out.println (num);
    }
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letter;
        int num = 10;
        letter = scan.next().charAt(0);

        switch (letter) {
            case 'A' -> {
                System.out.println("Apple");
                num += 5;
            }
            case 'Y' -> {
                System.out.println("Yellow");
                num++;
            }
            case 'G' -> System.out.println("Green");
            default -> System.out.println("Invalid");
        }
        System.out.println (num);
        scan.close();
    }
}
