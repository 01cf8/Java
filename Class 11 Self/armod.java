public class armod {
    int n,l;
    armod(int nn){
        n=nn;
        l=Integer.toString(nn).length();
    }
    int sumpow(int i){
        if(i==0){
            return 0;
        }
        return ((int) Math.pow((i%10), l) + sumpow(i/10));
    }
    void isArmstrong(){
        if(sumpow(n)==n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    public static void main(String[] args) {
        int num = 153;
        armod obj = new armod(num);
        obj.isArmstrong();
    }
}
