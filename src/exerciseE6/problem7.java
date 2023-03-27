package exerciseE6;
import java.util.Scanner;

public class problem7 {
    /*
    In a department store, a 10% rebate is given for every purchase of at least $ 20.00.
    Write a code segment to read the unit price of a product, the quantity purchased, and to compute and print
    the amount of the purchase after the rebate if applicable.
    */

    public static void main(String[] args) {

        double unitPrice;
        double quantity;
        double purchaseTotal;
        double purchaseTotalAfterRebate;

        Scanner readUserData = new Scanner(System.in);

        System.out.print("Enter unit price $ : ");
        unitPrice = readUserData.nextDouble();

        System.out.print("Enter product quantity: ");
        quantity = readUserData.nextDouble();

        purchaseTotal = unitPrice * quantity;

        if(purchaseTotal >= 20.0) {
            purchaseTotalAfterRebate = purchaseTotal * 0.90;
            System.out.println("Amount of the purchase (10% rebate): $ " + purchaseTotalAfterRebate);
        }
        else
        {
            purchaseTotalAfterRebate = purchaseTotal;
            System.out.println("Amount of the purchase: $ " + purchaseTotalAfterRebate);
        }

        readUserData.close();
    }
}
