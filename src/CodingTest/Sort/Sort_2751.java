package CodingTest.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort_2751 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.parallelSort(arr);
        for (int i = 0 ; i < n ; i ++) {
            sb.append(arr[i] + "\n");
        }
        System.out.println(sb);
    }
}