class binarySearch {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 7, 9, 11 };
        System.out.println("Found at index: " + binary(a, 7));
    }

    private static int binary(int[] numbers, int numToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midNum = numbers[mid];

            if (numToFind == midNum) {
                return mid;
            }
            if (numToFind < midNum) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // Number not found
    }
}