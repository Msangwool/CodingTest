package codingtest.backjoon.basic;

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Practice_2587 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[5];
        int sum=0;
        int mid;

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        sb.append(sum / 5).append("\n");

        Arrays.sort(arr);

        sb.append(arr[2]);

        System.out.println(sb);
    }
}
