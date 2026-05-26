public class sales extends product {
    int day;
    double tax;
    double totamt;
    sales(String n, double c, double p, int d) {
        super(n, c, p);
        day = d;
    }
    void compute() {
        double fine = 0.0;
        tax = amount * 0.125;
        if(day > 30) {
            fine = amount * 0.025;
        }
        totamt = amount + tax + fine;
    }
    void show() {
        super.show();
        System.out.println("Tax: " + tax);
        System.out.println("Total Amount: " + totamt);
    }
    public static void main(String[] args) {
        sales s = new sales("Laptop", 12345, 50000, 35);
        s.compute();
        s.show();
    }
}