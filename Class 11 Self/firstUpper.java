public class firstUpper {
    int find(String s, int n){
        if(n==s.length()){
            return -1;
        }
        else if(Character.isUpperCase(s.charAt(n)) == true){
            return n;
        }
        else{
            return find(s, n+1);
        }
    }
    public static void main(String[] args) {
        String str = "boOk";
        firstUpper obj = new firstUpper();
        int index = obj.find(str, 0);
        if(index!=-1){
            System.out.println("First uppercase letter is at index: " + index);
        }else{
            System.out.println("No uppercase letter found.");
        }
    }
}
