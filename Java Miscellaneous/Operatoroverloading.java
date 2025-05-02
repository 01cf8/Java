import java.util.*;

class Overloading{
        public int operator(int num1, int num2){

            return num1+num2;
        }
        public String operator(String str1, String str2){

            return str1+str2;
        }
}


public class Operatoroverloading {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println("The result is:"+obj.operator("Hello ","Akshit"));
    }
}