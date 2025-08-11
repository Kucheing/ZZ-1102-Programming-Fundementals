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

        double BOTTLE_VOLUME = 2.0; // Volume of a two-liter bottle in liters

        final double BOTTLE_VOLUME4 = BOTTLE_VOLUME * 4; // Volume of four two-liter bottles in liters

        double newtotalVolume = totalVolume + BOTTLE_VOLUME4; // Total volume of six-pack and four two-liter bottles

        System.out.print("A six-pack and four two-liter bottles contains ");
        System.out.print(newtotalVolume);
        System.out.println(" liters.");
        
    }
}