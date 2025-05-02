import java.util.Scanner;
public class numberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 0 and 9999:");
        int num = sc.nextInt();
        String n = Integer.toString(num);
        int len = n.length();
        String res = "";
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",  "eighty", "ninety"};

        if(num > 9999){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        if(num == 0){
            System.out.println("Zero");
        }
        if(num >=1000){
            res += ones[num/1000]+" thousand ";
            num = num % 1000;
        }
        if(num >=100){
            res += ones[num/100]+" hundred ";
            num = num % 100;
        }
        if(num >0 && !res.contains("")){
            res += "and ";
        }
        if(num < 20){
            res += ones[num];
        }
        else{
            res += tens[num / 10] + " " +ones[num%10];
        }
        String result = res.trim();
        System.out.println("Result: "+result);
    }
}
