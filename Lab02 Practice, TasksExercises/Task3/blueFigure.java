// START
//   SET x = given base length in cm
//   SET y = given height in cm

//   DISPLAY "Length x = ", x
//   DISPLAY "Length y = ", y

//   CALCULATE area = 2 * x * y
//   CALCULATE side = sqrt( (x)^2 + (y)^2 )
//   CALCULATE perimeter = 4 * side

//   DISPLAY "Perimeter of Blue area = ", perimeter
//   DISPLAY "Blue area = ", area
// END

public class blueFigure {
    public static void main(String[] args) {
        double x = 4.00; // base length in cm
        double y = 3.00; // height in cm

        System.out.println("Length x = " + x + " cm");
        System.out.println("Length y = " + y + " cm");

        double area = 2.0 * x * y; // area of the blue figure (two triangles)
        double side = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double perimeter = 4.0 * side;

        System.out.printf("Perimeter of Blue area = %.2f cm%n", perimeter);
        System.out.printf("Blue area = %.2f square cm%n", area);
    }
}