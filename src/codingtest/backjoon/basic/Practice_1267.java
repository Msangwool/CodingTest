package codingtest.backjoon.basic;

import java.util.Scanner;

public class Practice_1267 {
    public static void main(String[] args){
        int N;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int y = youngsik(arr);
        int m = minsik(arr);

        if(y>m){
            System.out.println("M");
            System.out.println(m);
        }
        else if(y==m){
            System.out.println("Y M");
            System.out.println(y);
        }
        else{
            System.out.println("Y");
            System.out.println(y);
        }

    }
    static int youngsik(int[] arr){
        int fee = 0;
        for(int i=0; i<arr.length; i++){
            fee += arr[i]/30 + 1;
        }
        return fee * 10;
    }
    static int minsik(int[] arr){
        int fee=0;
        for(int i=0; i<arr.length; i++){
            fee += arr[i]/60 + 1;
        }
        return fee * 15;
    }
}
