package codingtest.backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort_10989 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long n = Long.parseLong(br.readLine());
        long[] arr = new long[(int) n];
        for (long i = 0 ; i < n ; i++) {
            arr[(int)i] = Long.parseLong(br.readLine());
        }
        Arrays.parallelSort(arr);
        for (long i = 0 ; i < n ; i ++) {
            sb.append(arr[(int)i] + "\n");
        }
        System.out.println(sb);
    }
}