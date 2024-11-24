/**
 * ObjectsandClasses
 */

 import java.util.*;

 class Student {
    String Name;
    int Age;
    int RollNo;
    public void StudentInfo(){
        System.out.println("The name of this student is: "+Name);
        System.out.println("The age of this student is: "+Age);
        System.out.println("The Roll.No of this student is: "+RollNo);
    }
 }

public class ObjectsandClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu1 = new Student();
        String Name;
        int Age,Roll;
        System.out.println("Enter the name of the student:");
        Name = sc.nextLine();
        System.out.println("Enter the age of the student:");
        Age = sc.nextInt();
        System.out.println("Enter the roll.no of the student:");
        Roll = sc.nextInt();
        stu1.Name = Name;
        stu1.Age = Age;
        stu1.RollNo = Roll;

        stu1.StudentInfo();
    }
}