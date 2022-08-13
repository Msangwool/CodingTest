package CodingTest.BasicCode;

import java.util.Scanner;
import java.util.Arrays;

public class Practice_2309 {
    public static void main(String[] args){
        int[] arr = new int[9];
        int[] arrCopy = new int[9];
        int a=0,b=0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                if(sum - (arr[i] + arr[j]) == 100){
                    a = i;
                    b = j;
                }
            }
        }
        for(int i =0; i<9; i++){
            if(i != a & i != b){
                arrCopy[i] = arr[i];
            }
        }
        Arrays.sort(arrCopy);
        for(int i = 2; i<9; i++){
            System.out.println(arrCopy[i]);
        }
    }
}
