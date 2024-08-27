import java.util.*;
public class arraysIntro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[3];

        for(int i=0; i<3; i++){

            if(i==0){
                System.out.println("Enter your Physics marks out of 100:");
                marks[i] = sc.nextInt();
            }else if(i==1){
                System.out.println("Enter your Chemistry marks out of 100:");
                marks[i] = sc.nextInt();
            }else if(i==2){
                System.out.println("Enter your Math marks out of 100:");
                marks[i] = sc.nextInt();
            }

        }

        System.out.println();

        for(int i=0; i<3; i++){
            if(i==0){
                System.out.println("Your Physics marks are: "+marks[i]);
            }else if(i==1){
                System.out.println("Your Chemistry marks are: "+marks[i]);
            }else if(i==2){
                System.out.println("Your Math marks are: "+marks[i]);
            }
        }

        System.out.println();

        double avg = (marks[0]+marks[1]+marks[2])/3.0;
        System.out.println("Your average is: "+avg);

        System.out.println();

        double percent = ((marks[0]+marks[1]+marks[2])/300.0)*100.0;
        System.out.println("Your percentage is: "+percent+"%");

        System.out.println();

        sc.close();
    }
}