package exerciseE7;

import java.util.Scanner;

public class problem02 {

    /*
    public static void main(String[] args) {

        //Rewrite the following Java code segment using if-else structures.
        Scanner scan = new Scanner(System.in);
        int ctl = scan.nextInt();

        switch (ctl) {
            case 0:
            case 1:
                System.out.println("red");
                break;
            case 2:
                System.out.println("blue");
            case 3:
                System.out.println("green");
                break;
            default:
                System.out.println("yellow");
        }
        System.out.println(ctl);
    }
    */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ctl;
        ctl = scan.nextInt();

        if (ctl == 0 || ctl == 1)
            System.out.println ("red");
        else if (ctl == 2 || ctl == 3) {
            System.out.println("blue");
            System.out.println("yellow");
        }
        else
            System.out.println ("yellow");

        System.out.println (ctl);
    }
}
