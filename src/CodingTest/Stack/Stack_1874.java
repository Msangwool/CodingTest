package CodingTest.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack_1874 {
    public static void main(String[] args) throws IOException {
        int count = 1, end = 0;
        int value;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n>100000 | n<1){
            System.exit(0);
        }

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            value = Integer.parseInt(br.readLine());
            if(arr[end]==value){
                System.out.println("pop");
                end--;
            } else if(arr[end] < value){
                for(int j=arr[end]+1; j<=value; j++){
                    arr[end] = j;
                    System.out.println(arr[end] + " " + end);
                    end++;
                    System.out.println("push");
                    System.out.println(arr[end] + " " + end);
                }
            }
        }

    }
}
