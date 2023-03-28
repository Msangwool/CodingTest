package codingtest.backjoon.basic;

import java.util.Scanner;

public class Practice_2562 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int max = 0,j=0;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<1 | arr[i]>100){
                return;
            }
            if(arr[i]>max){
                max = arr[i];
                j=i;
            }
        }
        System.out.println(max);
        System.out.println(j+1);
    }
}
