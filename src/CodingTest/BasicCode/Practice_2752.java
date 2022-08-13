package CodingTest.BasicCode;

import java.util.Scanner;
import java.util.Arrays;

public class Practice_2752 {
    public static void main(String[] args){
        int[] arr = new int[3];

        Scanner sc = new Scanner(System.in);

        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>1000000 | arr[i]<1){
                return;
            }
        }

        Arrays.sort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
