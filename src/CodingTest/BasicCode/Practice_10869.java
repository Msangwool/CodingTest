package CodingTest.BasicCode;

import java.util.Scanner;

public class Practice_10869 {
    public static void main(String[] args){
        int a,b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(add(a,b));
        System.out.println(minus(a,b));
        System.out.println(multiply(a,b));
        System.out.println(divide(a,b));
        System.out.println(share(a,b));
    }

    static int add(int a, int b){
        return a+b;
    }

    static int minus(int a, int b){
        return a-b;
    }

    static int multiply(int a, int b){
        return a*b;
    }

    static int divide(int a, int b){
        return a/b;
    }

    static int share(int a, int b){
        if(b>0){
            return a%b;
        }
        else{
            return -1;
        }
    }
}
