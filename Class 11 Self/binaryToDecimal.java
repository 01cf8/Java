public class binaryToDecimal {
    public static void main(String[] args) {
        String binary = "0100";

        // Parse binary string directly in O(1)
        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal: " + decimal);
    }
}
