/*Example 4: In this example, we practise on the difference between declaration and assignment; also
we note the difference between print and println. Try: What happens if bob is assign the value of 3?
Explain your observation.
*/

public class Example4 {
    public static void main(String[] args) {
    String bob; // declaration
    int hour, minute; //declaration

        bob = "Hello."; // assign bob to "Hello."
        hour = 11; // assign hour to 11
        minute = 59;// assign minute to 59

        System.out.println("bob has the value of " + bob);
        System.out.println("hour has the value of " + hour);
        System.out.println("minute has the value of " + minute);
    }
}

// Comments
// if i were to assign the value of 3 to bob, then ill get a type mismatch error because bob is declared as a String and 3 is an int or a value.