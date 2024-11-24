public class PinCode {
    private int[] pinCodes;

    public PinCode(int[] pinCodes) {
        this.pinCodes = pinCodes;
    }

    public void sortPinCodes() {
        int n = pinCodes.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (pinCodes[j] < pinCodes[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = pinCodes[minIndex];
            pinCodes[minIndex] = pinCodes[i];
            pinCodes[i] = temp;
        }
    }

    public void displayPinCodes() {
        for (int pinCode : pinCodes) {
            // System.out.println(pinCode);
            System.out.println(pinCode);
        }
    }

    public static void main(String[] args) {
        int[] pinCodes = { 110061, 110001, 110029, 110023, 110055, 110006, 110019, 110033 };
        PinCode pinCodeObj = new PinCode(pinCodes);
        pinCodeObj.sortPinCodes();
        pinCodeObj.displayPinCodes();
    }
}