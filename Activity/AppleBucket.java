
public class AppleBucket {

    public static void main(String[] args) {
        String Apple1 = "red apple";
        String Apple2 = "green apple";
        String hand1, hand2;

        String bucket1 = Apple2 + " " + Apple1;
        String bucket2 = Apple1 + " " + Apple2;

        System.out.println("Bucket 1 contains: " + bucket1);
        System.out.println("Bucket 2 contains: " + bucket2);
        System.out.println("This is wrong. We want bucket 1 to contain red apples and bucket 2 to contain green apples.");

        hand1 = Apple2;
        hand2 = Apple1;

        bucket1 = Apple1 + " " + hand2;
        bucket2 = Apple2 + " " + hand1;

        System.out.println("Bucket 1 contains: " + bucket1);
        System.out.println("Bucket 2 contains: " + bucket2);
    }
}
