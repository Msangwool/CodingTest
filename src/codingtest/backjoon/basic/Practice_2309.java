package codingtest.backjoon.basic;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Practice_2309 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[9];
        int[] arrCopy = new int[9];
        int a=0,b=0;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
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
            sb.append(arrCopy[i]).append("\n");
        }

        System.out.println(sb);
    }
}
