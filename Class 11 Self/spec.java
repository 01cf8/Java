public class spec {
    int n;
    spec(){
        n=0;
    }
    int fact(int x){
        if(x == 0){
            return 1;
        }
        return x * fact(x-1);
    }
    boolean isSpec(){
        int sum = 0, temp = n;
        while(temp!=0){
            sum += fact(temp%10);
            temp /= 10;
        };
        return sum == n;
    }
    void display(){
        if(isSpec() == true){
            System.out.println(n + " is a special number.");
        }else{
            System.out.println(n + " is not a special number.");
        }
    }
    public static void main(String[] args) {
        int num = 145;
        spec obj = new spec();
        obj.n = num;
        obj.display();
    }
}
