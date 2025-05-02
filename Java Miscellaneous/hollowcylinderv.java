import java.util.*;
public class hollowcylinderv {
    public static void volume(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ir,or,v,h;
        double pie = 3.14159;
        System.out.println("Enter the inner radius in cm:");
        ir = sc.nextFloat();
        System.out.println("Enter the outer radius in cm:");
        or = sc.nextFloat();
        System.out.println("Enter the height in cm:");
        h = sc.nextFloat();
        v=(float) (pie*(Math.pow(or,2) - Math.pow(ir,2))*h);
        System.out.println("The volume of the hollow cylinder is "+v);
}
    public static void main(String[] args) {
        volume(args);
    }
}