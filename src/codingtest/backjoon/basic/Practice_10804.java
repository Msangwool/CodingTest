package codingtest.backjoon.basic;

import java.util.Scanner;

public class Practice_10804 {
    public static void main(String[] args){
        int a,b,c=0;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if(20<a | 20<b | 1>a | 1>b){
                return;
            }
            int[] arrCopy = new int[b-a+1];
            for(int j=a-1; j<b; j++) {
                arrCopy[c] = arr[j];
                c++;
            }
            c = 0;
            arrReverse(arrCopy);
            for(int j=a-1; j<b; j++){
                arr[j] = arrCopy[c];
                c++;
            }
            c = 0;
        }
        for(int i=0; i<20; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void arrReverse(int[] arr){
        int j = arr.length;
        int[] arrCopy = new int[j];
        for(int i =0; i<arr.length; i++){
            arrCopy[j-1] = arr[i];
            j--;
        }
        for(int i = 0; i<arr.length; i++){
            arr[i] = arrCopy[i];
        }
    }
}
