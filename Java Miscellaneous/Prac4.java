import java.util.Scanner;

public class Prac4
{
    private String name;
    private int age;
    private double mks;
    private String stream;
    
    public void accept() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = in.nextLine();
        System.out.print("Enter age: ");
        age = in.nextInt();
        System.out.print("Enter marks: ");
        mks = in.nextDouble();
    }
    
    public void allocation() 
    {
        if (mks < 75)
            stream = "Try again";
        else if (mks < 200)
            stream = "Arts and Animation";
        else if (mks < 300)
            stream = "Commerce and Computer";
        else
            stream = "Science and Computer";
    }
    
    public void print() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + mks);
        System.out.println("Stream allocated: " + stream);
    }
    
    public static void main(String args[]) {
        Prac4 obj = new Prac4();
        obj.accept();
        obj.allocation();
        obj.print();
    }
}