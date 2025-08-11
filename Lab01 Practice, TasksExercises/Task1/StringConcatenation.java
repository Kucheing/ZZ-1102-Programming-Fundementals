/*3.10 String concatenation operator
The operator + when applied to two strings creates a new String object that is the concatenation
of the two string objects. The operator may also be applied to a String and a numeric expression
to produce a String object that concatenates the String and the expression. The String
concatenation operator has the same priority as the addition and subtraction operators. */

class StringConcatenation {
    public static void main(String[] args) {
        String mystring = "UBD";
        System.out.println("I am a student of " + mystring);

        int num1 = 12, num2 = 45;
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}

                                                    //Comments
// I understood that the + operator can be used to concatenate strings in Java.
// It can also be used with numeric expressions to produce a combined string output.