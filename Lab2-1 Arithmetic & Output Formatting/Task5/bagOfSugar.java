public class bagOfSugar {
    public static void main(String[] args) {
        int noofBags = 32;
        int weightperBag = 5;
        double PricePerKg = 5.99;
        double salesTax = 7.25;

        double totalPrice = weightperBag * noofBags * PricePerKg;
        double totalPricewithTax = totalPrice + (totalPrice * salesTax / 100);

        System.out.println("Please enter the number of bags: " + noofBags);
        System.out.println("Please enter he weight per bag (in kg): " + weightperBag);
        System.out.println("Price per Kg: $" + PricePerKg);
        System.out.println("Sales tax: " + salesTax + "%");
        System.out.println("Total price (without tax): $" + totalPrice);
        System.out.println("Total price (with tax): $" + totalPricewithTax);
    }
}