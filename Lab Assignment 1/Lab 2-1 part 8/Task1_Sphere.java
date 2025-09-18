//PSUEDOCODE
// START
//   SET radius = some value (cm)
//   CALCULATE volume = (4.0 / 3.0) * PI * (radius ^ 3)
//   CALCULATE surfaceArea = 4 * PI * (radius ^ 2)
//   DISPLAY "Volume = " volume " Cubic cm"
//   DISPLAY "Surface Area = " surfaceArea " Square cm"
// END

public class Task1_Sphere {

    public static void main(String[] args) {
        // Step 1: Define radius in cm
        double radius = 1.555; // example value, can be changed

        // Step 2: Calculate volume and surface area
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        // Step 3: Display results
        System.out.printf("Volume = %.2f Cubic cm%n", volume);
        System.out.printf("Surface Area = %.2f Square cm%n", surfaceArea);
    }
}
// %.2f is used to format the output to two decimal places, the beginners have just learned it in this current lab lecture
// %n is used for a platform-independent line separator
// printf is used for formatted output
// Math.PI provides the value of π
// Math.pow is used to raise a number to a power
// The code calculates the volume and surface area of a sphere given its radius

// According to sample program output from the task
// Example 1, the radius is set to 1.555 cm for the first example. To get the output from the lab
// Example 2, the radius is set to 1.6839 cm for the second example. To get the output from the lab
// Example 3, the radius is set to 1.1575 cm for the third example. To get the output from the lab

// END
