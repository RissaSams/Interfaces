package advance.collection;

import java.util.Scanner;

public class FinancialCalculator {

    static void overAll_Company_Asset_Calculator(String companyName, int m) {

        System.out.println(companyName + " is worth $" + m + " million!");

    }

    static int overAll_Company_Asset_Calculator_Display(int equity, int liabilities) {

        int totalAssets = liabilities + equity;
        return totalAssets;

    }


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Equity: ");
        int e = userInput.nextInt();
        System.out.print("Liabilities: ");
        int l = userInput.nextInt();

        int totalAssetsFull = overAll_Company_Asset_Calculator_Display(e, l);
        System.out.println("Your overall assets: " + totalAssetsFull);
        //overAll_Company_Asset_Calculator("Boss Cafe", 10);


    }
}
