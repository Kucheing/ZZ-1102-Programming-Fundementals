//Notes Lab 1 No. 5 Example 1
// computes the sum, difference, product, and average of two integers

public class Arithmetic {
    public static void main(String[] args) {
        int num1 = 15; int num2 = 19;
        int sum, diff, product;

        double average;
        sum = num1 + num2;
        diff = num1 - num2;
        product = num1 * num2;
        average = (num1 + num2) / 2;

        // Display results
        System.out.println("The Sum is: " + sum);
        System.out.println("The difference is: " + diff);
        System.out.println("The product is: " + product);
        System.out.println("The average is: " + average);

// Example 2
        System.out.print("Goodbye, ");
        System.out.println("cruel world!");

// Example 3
       System.out.println("Hello");
       System.out.println("");
       System.out.println("World");

// Example 4
        String bob;
        int hour, minute;

        bob = "Hello.";
        hour = 11;
        minute = 59;

        System.out.println("bob has the value of " + bob);
        System.out.println("hour has the value of " + hour);
        System.out.println("minute has the value of " + minute);

// Example 5
        System.out.println("39+3");
        System.out.println(39+3); 
    }
}

// Example 8
/*This program computes the volume (in liters) of a six-pack of soda cans and the total volume 
of a six-pack and a two-liter bottle*/

public class NewVolume1 {
    public static void main(String[] args) {
        int cansPerPack = 6; // Number of cans in a six-pack
        final double CAN_VOLUME = 0.355; // Volume of one can in liters
        double totalVolume = cansPerPack * CAN_VOLUME; // Total volume of the six-pack in liters

        System.out.print("A six-pack of 12-ounce cans contains ");
        System.out.print(totalVolume);
        System.out.println(" liters.");

        final double BOTTLE_VOLUME = 2.0; // Volume of a two-liter bottle in liters

        totalVolume = totalVolume + BOTTLE_VOLUME; // Total volume of six-pack and two-liter bottle

        System.out.print("A six-pack and a two-liter bottle contains ");
        System.out.print(totalVolume);
        System.out.println(" liters.");
        
    }
}

//Notes Lab 1 No. 5 Example 2

class Hello {
    public static void main(String[] args) {
        System.out.print("Goodbye, ");
        System.out.println("cruel world!");
    }
}

//Notes Lab 1 No. 5 Example 3
class TestTwo {
    public static void main(String[] args) {
       System.out.println("Hello");
       System.out.println("");
       System.out.println("World");
    }
}

//Notes Lab 1 No. 5 Example 4
class BobHourMin {
    public static void main(String[] args) {
        String bob;
        int hour, minute;

        bob = "Hello.";
        hour = 11;
        minute = 59;

        System.out.println("bob has the value of " + bob);
        System.out.println("hour has the value of " + hour);
        System.out.println("minute has the value of " + minute);
    }
}

//Notes Lab 1 No. 5 Example 5 
class Test {
    public static void main(String[] args) {
        System.out.println("39+3");
        System.out.println(39+3); 
    }
}