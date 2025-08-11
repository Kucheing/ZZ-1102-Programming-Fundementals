public class balanceOfAccount {
    public static void main(String[] args) {
        double initialBalance = 1000.00; // Initial account balance
        double InterestRate = 0.05; // Interest rate for the first year

        // First Year Calculation
        double Interest = initialBalance * InterestRate; // Interest earned in the first year
        double FirstYear = initialBalance + Interest; // Total balance after the first year

        System.out.println("The balance after the first year is: " + FirstYear);

        // Second Year Calculation
        double SecYearInterest = FirstYear * InterestRate; // Interest earned in the second year
        double SecondYear = FirstYear + SecYearInterest; // Total balance after the second year
        System.out.println("The balance after the second year is: " + SecondYear);

        // Third Year Calculation
        double ThirdYearInterest = SecondYear * InterestRate; // Interest earned in the third year
        double ThirdYear = SecondYear + ThirdYearInterest; // Total balance after the third year
        System.out.println("The balance after the third year is: " + ThirdYear);
    }
}


// public class balanceOfAccount {
//     public static void main(String[] args) {
//         // Step 1: Initialise variables
//         double balance = 1000.0;     // Initial balance
//         double interestRate = 0.05;  // 5% interest per year

//         // Step 2: First year
//         double interest = balance * interestRate;
//         balance += interest;
//         System.out.println("Balance after 1st year: $" + balance);

//         // Step 3: Second year
//         interest = balance * interestRate;
//         balance += interest;
//         System.out.println("Balance after 2nd year: $" + balance);

//         // Step 4: Third year
//         interest = balance * interestRate;
//         balance += interest;
//         System.out.println("Balance after 3rd year: $" + balance);
//     }
// }
