public class product {
    String name;
    double code;
    double amount;
    product(String n, double c, double p) {
        name = n;
        code = c;
        amount = p;
    }
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Amount: " + amount);
    }
}