public class spyNo {
    int num,s,p;
    spyNo(int n){
        s=0;
        p=1;
        num=n;
    }
    int sod(int x){
        if(x==0){
            return s;
        }
        s+=x%10;
        return sod(x/10);
    }
    int pod(int x){
        if(x==0){
            return p;
        }
        p*=x%10;
        return pod(x/10);
    }
    void display(){
        int sum=sod(num);
        int pro=pod(num);
        if(sum==pro){
            System.out.println(num+" is a spy number");
        }else{
            System.out.println(num+" is not a spy number");
        }
    }
    public static void main(String[] args) {
        spyNo s1=new spyNo(123);
        s1.display();
    }
}
