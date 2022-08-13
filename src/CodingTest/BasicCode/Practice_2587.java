package CodingTest.BasicCode;

import java.util.Scanner;
import java.util.Arrays;

public class Practice_2587 {
    public static void main(String[] args){
        int[] arr = new int[5];
        int sum=0;
        int mid;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum/5);

        Arrays.sort(arr);

        System.out.println(arr[2]);
    }
}
