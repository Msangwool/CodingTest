package codingtest.backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack_10773_Answer {
    public static void main(String[] args) throws IOException {
        int end = 0, sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        if(k>100000 | k<1){
            System.exit(0);
        }

        int[] arr = new int[k];

        for(int i=0; i<k; i++){
            arr[end] = Integer.parseInt(br.readLine());
            if(arr[end]<1000000 & arr[end]>0){
                end++;
            } else if (arr[end] == 0){
                arr[end] = 0;
                if(end > 0){
                    end--;
                    arr[end] = 0;
                }
            } else {
                System.exit(0);
            }
        }
        for(int i=0; i<end; i++){
            sum += arr[i];
        }
        if(sum <= Math.pow(2, 32) - 1){
            System.out.println(sum);
        }
    }
}
