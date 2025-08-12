// START
//   SET change = amount in BND

//   DISPLAY "Change to be returned = " + change + " BND"

//   CALCULATE num50 = change / 50
//   SET change = change % 50

//   CALCULATE num10 = change / 10
//   SET change = change % 10

//   CALCULATE num5 = change / 5
//   SET change = change % 5

//   CALCULATE num1 = change / 1
//   SET change = change % 1   // will be 0

//   DISPLAY "50 BND bills: " + num50
//   DISPLAY "10 BND bills: " + num10
//   DISPLAY "5 BND bills: " + num5
//   DISPLAY "1 BND bills: " + num1
// END

public class dollarBills {
    public static void main(String[] args) {
        int change = 28; // amount in BND

        System.out.println("Change to be returned: " + change + " BND");

        int num50 = change / 50;
        change = change % 50;

        int num10 = change / 10;
        change = change % 10;

        int num5 = change / 5;
        change = change % 5;

        int num1 = change / 1; // this will be the remaining amount
        change = change % 1;   // will be 0

        System.out.println("Minimum number of bills: " + (num50 + num10 + num5 + num1));
        System.out.println("Number of fifty dollar bills: " + num50);
        System.out.println("Number of ten dollar bills: " + num10);
        System.out.println("Number of five dollar bills: " + num5);
        System.out.println("Number of one dollar bills: " + num1);
    }
}