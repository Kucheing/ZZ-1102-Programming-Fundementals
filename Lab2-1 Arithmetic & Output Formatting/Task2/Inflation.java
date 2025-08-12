//PSUEDOCODE
// START
//   SET currentAmount = some value in BND
//   SET currentYear = current year
//   SET yearFuture1 = first future year
//   SET yearFuture2 = second future year
//   SET yearPast = past year

//   CALCULATE amountFuture1 = currentAmount * (0.97 ^ (yearFuture1 - currentYear))
//   CALCULATE amountFuture2 = currentAmount * (0.97 ^ (yearFuture2 - currentYear))
//   CALCULATE amountPast = currentAmount * (0.97 ^ (yearPast - currentYear))

//   DISPLAY current amount and current year
//   DISPLAY amountPast
//   DISPLAY amountFuture1
//   DISPLAY amountFuture2
// END

public class Inflation{
public static void main(String[] args) {

    // Step 1: Initialize values
    double currentAmount = 1000.0; // Example value in BND
    int currentYear = 2013; // Example current year
    int pastYear = 2009; // Example past year
    int futureYear1 = 2025; // Example first future year
    int futureYear2 = 2040; // Example second future year

    // Step 2: Perform calculations using formula
    double amountPast = currentAmount * Math.pow(0.97, (pastYear - currentYear));
    double amountFuture1 = currentAmount * Math.pow(0.97, (futureYear1 - currentYear));
    double amountFuture2 = currentAmount * Math.pow(0.97, (futureYear2 - currentYear)); 

    // Step 3: Display results
        System.out.printf("The current amount is: %.1f%n", currentAmount);
        System.out.println("The current year is: " + currentYear);
        System.out.printf("The amount for year %d is %.13f%n", pastYear, amountPast);
        System.out.printf("The amount for year %d is %.13f%n", futureYear1, amountFuture1);
        System.out.printf("The amount for year %d is %.13f%n", futureYear2, amountFuture2);
}
}

// public class Inflation{
// public static void main(String[] args) {

//     // Step 1: Initialize values
//     double currentAmount = 1000.0; // Example value in BND
//     int currentYear = 2017; // Example current year
//     int pastYear = 2015; // Example past year
//     int futureYear1 = 2020; // Example first future year
//     int futureYear2 = 2025; // Example second future year

//     // Step 2: Perform calculations using formula
//     double amountPast = currentAmount * Math.pow(0.97, (pastYear - currentYear));
//     double amountFuture1 = currentAmount * Math.pow(0.97, (futureYear1 - currentYear));
//     double amountFuture2 = currentAmount * Math.pow(0.97, (futureYear2 - currentYear)); 

//     // Step 3: Display results
//         System.out.printf("The current amount is: %.1f%n", currentAmount);
//         System.out.println("The current year is: " + currentYear);
//         System.out.printf("The amount for year %d is %.13f%n", pastYear, amountPast);
//         System.out.printf("The amount for year %d is %.13f%n", futureYear1, amountFuture1);
//         System.out.printf("The amount for year %d is %.13f%n", futureYear2, amountFuture2);
// }
// }