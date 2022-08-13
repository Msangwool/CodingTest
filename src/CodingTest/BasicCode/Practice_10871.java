package CodingTest.BasicCode;

import java.util.Scanner;

public class Practice_10871 {
    public static void main(String[] args){
        int N, X;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        X = sc.nextInt();

        int[] intArr = new int[N];

        for(int i=0; i<N; i++){
            intArr[i] = sc.nextInt();
        }

        printMethod(intArr, X);
    }

    public static void printMethod(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i]<x){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
