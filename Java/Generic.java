public class Generic {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        Printer<Double> printer1 = new Printer<>(3.14159265359);
        Printer<String> printer2 = new Printer<>("Hello!!");
        printer.Print();
        printer1.Print();
        printer2.Print();
    }
}
