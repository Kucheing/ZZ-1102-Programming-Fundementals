/*3.9 Assignment Statements
We can change the value of a variable any number of times within a program. One-way of
assigning or changing the value of a variable is using the assignment statement, which has the
form: variable = expression;*/
class AssignmentStatements {
    public static void main(String[] args) {
    int first, second, count = 0;
double average;
first = 10;
second = 20;
average = (first + second)/2.0;
count = count + 1;

System.out.println("First: " + first);
System.out.println("Second: " + second);
System.out.println("Average: " + average);
System.out.println("Count: " + count);
    }
}

                                                    //Comments
// In this example, it shows that java does work with multiple expressions in a single line from a variable like int here but
// it is not a good practice to do so as it reduces code readability.
// and for assigning values to variables, each variable must be declared with a value first and you can end it with ; or if you want to continue it in the same line you can by using , but still in the end you'll need to close it with a ;