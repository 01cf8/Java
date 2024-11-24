public class prac6 {
    public static void main(String[] args) {
        int a[][] = { { 3, 4, 2, 5 }, { 2, 5, 2, 3 }, { 5, 3, 2, 7 }, { 1, 3, 7, 1 } };
        int sumL = 0, sumR = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    sumL += a[i][j];
                }
                if (i + j == a.length - 1) {
                    sumR += a[i][j];
                }
            }
        }
        if (sumL == sumR) {
            System.out.println("Diagonal");
        }
    }
}
