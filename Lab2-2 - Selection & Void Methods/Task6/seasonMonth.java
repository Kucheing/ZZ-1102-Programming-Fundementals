
import java.util.Scanner;

public class seasonMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter a day (1-31): ");
        int day = input.nextInt();

        String season = "";

        if (month == 1 || month == 2 || month == 3) {
            season = "Winter";
        } else if (month == 4 || month == 5 || month == 6) {
            season = "Spring";
        } else if (month == 7 || month == 8 || month == 9) {
            season = "Summer";
        } else if (month == 10 || month == 11 || month == 12) {
            season = "Fall";
        }

        if (month % 3 == 0 && day >= 21) {
            if (season.equals("Winter")) {
                season = "Spring";
            } else if (season.equals("Spring")) {
                season = "Summer";
            } else if (season.equals("Summer")) {
                season = "Fall";
            } else {
                season = "Winter";
            }
        }

        System.out.println("The season is: " + season);
    }
}
// This program determines the season based on the month and day input by the user.
