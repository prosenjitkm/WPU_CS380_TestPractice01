package exerciseE7;

import java.util.Scanner;

public class problem01b {

    /*
    int num, value;
    Scanner scan = new Scanner(System.in);
    num = scan.nextInt();

    if (num + 5 == 0 || num + 5 == -1)
        value = 10;
    else if (num + 5 == 2)
        value = 7;
    else if (num + 5 == 5)
        value = 4;
    System.out.println ("value =" + value);
    */

    public static void main(String[] args) {

        int num, value = 0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        switch(num + 5)
        {
            case 0:
            case -1:
                value = 10;
                break;
            case 2:
                value = 7;
                break;
            case 5:
                value = 4;
                break;
            default:
        }
        System.out.println ("value =" + value);
        scan.close();
    }
}
