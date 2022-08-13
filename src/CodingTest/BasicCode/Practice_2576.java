package CodingTest.BasicCode;

import java.util.Scanner;
import java.util.Arrays;

public class Practice_2576 {
    public static void main(String[] args){
        int[] arr = new int[7];
        int[] arrCopy = new int[7];
        int test=0;
        int j=0;
        int sum=0;

        Scanner sc = new Scanner(System.in);

        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0 & arr[i] > 100){
                return;
            }
            if(arr[i]%2==1){
                test++;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==1){
                arrCopy[j] = arr[i];
                sum += arrCopy[j];
                j++;
            }
        }

        if(test==0){
            System.out.println(-1);
            return;
        }

        Arrays.sort(arrCopy);

        System.out.println(sum);
        System.out.println(arrCopy[7-j]);
    }
}
