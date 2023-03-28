package codingtest.backjoon.basic;

import java.util.Scanner;

public class Practice_10093_Scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if(b>a & b>0 & a>0){
            if(a<1 | b>Math.pow(10, 15) | b-a > 100000){
                System.exit(0);
            }
            System.out.println(b-a-1);
            for(long i = a+1 ; b>i; i++){
                System.out.print(i + " ");
            }
        }
        else if(a>b  & b>0 & a>0){
            if(b<1 | a>Math.pow(10, 15) | a-b > 100000){
                System.exit(0);
            }
            System.out.println(a-b-1);
            for(long i = b+1 ; a>i; i++){
                System.out.print(i + " ");
            }
        }
        else {
            System.exit(0);
        }
    }
}
