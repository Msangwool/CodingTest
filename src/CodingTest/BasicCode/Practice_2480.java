package CodingTest.BasicCode;

import java.util.Scanner;

public class Practice_2480 {
    public static void main(String[] args){
        int a,b,c,max;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a==b&b==c){
            System.out.println(10000 + a*1000);
        }
        else if(a==b&a!=c){
            System.out.println(1000 + a*100);
        }
        else if(b==c&b!=a){
            System.out.println(1000 + b*100);
        }
        else if(c==a&c!=b){
            System.out.println(1000 + c*100);
        }
        else{
            if(a>b){
                max = a;
            }else{
                max = b;
            }
            if(max>c){
                System.out.println(100*max);
            }else{
                System.out.println(100*c);
            }
        }
    }
}
