package exerciseE6;
import java.util.Scanner;

public class problem08 {

    /*
    To read an item number and the number of bouquets of that type purchased and to compute and
    print the total price of those bouquets. The unit prices of the bouquets is given as follows:
    ITEM NUMBER UNIT PRICE
    101         $ 5.25
    202         $ 3.10
    303         $ 9.75
    404         $ 6.50
    */

    public String itemNumber;
    public double unitPrice;

    public problem08(String itemNumber, double unitPrice) {
        this.itemNumber = itemNumber;
        this.unitPrice = unitPrice;
    }

    public static void main(String[] args) {

        problem08[] database = new problem08[4];
        database[0] = new problem08("101", 5.25);
        database[1] = new problem08("202", 3.10);
        database[2] = new problem08("203", 9.75);
        database[3] = new problem08("404", 6.50);

        Scanner readUserData = new Scanner(System.in);
        System.out.print("Enter the Item Number: ");
        String userItemNumber = readUserData.next();
        System.out.print("Enter the item Quantity: ");
        int userItemQuantity = readUserData.nextInt();

        double totalPrice = 0;
        for(int i = 0; i < 4; i++)
        {
            if(userItemNumber.equals(database[i].itemNumber))
            {
                totalPrice = database[i].unitPrice * userItemQuantity;
                break;
            }
        }

        System.out.println("Total Price for " + userItemNumber + " and quantity: " + userItemQuantity + " is: $ " + totalPrice);
    }
}