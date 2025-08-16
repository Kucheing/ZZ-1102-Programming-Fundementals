public class expShaded1 {

    public static void main(String[] args) {
       
       // QS1
       // rectangle with full size shaded region being 10m and unshaded region being 6m

       double fullSize = 10; // full size of the rectangle in meters
       double unshadedRegion = 6; // unshaded region in meters
       double fullarea = fullSize * fullSize; // area of the full rectangle in square meters
       double unshadedArea = unshadedRegion * unshadedRegion; // area of the unshaded region in square meters

       double shadedArea = fullarea - unshadedArea; // shaded region in square meters
       System.out.println("The area of the shaded region for QS1 is " + shadedArea + " m²");

         // QS2
         // square with 12m sides and shaded region is halved diagonally

       double squareSide = 12; // side length of the square in meters
       double squareArea = squareSide * squareSide; // area of the full square in square meters
       double shadedAreaQS2 = squareArea / 2; // shaded region is half of the square area
       System.out.println("The area of the shaded region for QS2 is " + shadedAreaQS2 + " m²");

         // QS3
         // rectangle, shaded region is 5m by 5m triangle and there is 4 of that triangle

       double triangleBase = 5; // base length of the triangle in meters
       double triangleHeight = 5; // height of the triangle in meters
       double triangleArea = (triangleBase * triangleHeight) / 2; // area of one triangle in square meters
       double shadedAreaQS3 = triangleArea * 4; // total shaded area is 4 times the triangle area
       System.out.println("The area of the shaded region for QS3 is " + shadedAreaQS3 + " m²");

         // QS4
         // rectangle woth unshaded region being 50m by 40m and square shaded region being 10m, there is 4 of those square shaded regions
         double unshadedWidth = 70; // width of the unshaded region in meters
         double unshadedHeight = 60; // height of the unshaded region in meters
         double OuterArea = unshadedWidth * unshadedHeight; // area of the unshaded region in square meters
         double squareShadedSide = 10; // side length of the shaded square in meters
         double squareShadedArea = squareShadedSide * squareShadedSide; // area of one shaded square in square meters
         double shadedAreaQS4 = squareShadedArea * 4; // total shaded area is 4 times the shaded square area
         System.out.println("The area of the shaded region for QS4 is " + (OuterArea - shadedAreaQS4) + " m²");

        // QS5
        //A circle has a diameter of 10 m. Inside the circle, a right-angled triangle with base 6 m and height 4 m is inscribed. Calculate the area of the shaded region (the semicircle above the triangle minus the triangle’s area).

        // Circle diameter = 10 → radius = 5.
        // Circle area = 𝜋 × 5² = 25𝜋 ≈ 78.54
        // Semicircle area = 78.54 / 2 ≈ 39.27
        // Triangle base = 6, height = 4 → area = 1/2 × 6 × 4 = 12
        // Shaded area = semicircle area - triangle area = 39.27 - 12 = 27.27 m²

         double circleDiameter = 10; // diameter of the circle in meters
            double circleRadius = circleDiameter / 2; // radius of the circle in meters
            double circleArea = Math.PI * circleRadius * circleRadius; // area of the circle in square meters
            double triangleBaseQS5 = 6; // base length of the triangle in meters
            double triangleHeightQS5 = 4; // height of the triangle in meters
            double triangleAreaQS5 = (triangleBaseQS5 * triangleHeightQS5) / 2; // area of the triangle in square meters
            double shadedAreaQS5 = (circleArea / 2) - triangleAreaQS5; // shaded area is the semicircle above the triangle minus the triangle area
            System.out.printf("The area of the shaded region for QS5 is %.2f m²%n", shadedAreaQS5);



    }
    // Additional methods can be added here as needed
}