package CodingTest.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Array_3273_pointer {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        Arrays.parallelSort(arr);

        int x = Integer.valueOf(st.nextToken());

        int count = 0;
        int start = 0;
        int end = n - 1;
        int sum = 0;

        while(start < end) {
            sum = arr[start] + arr[end];
            if(sum == x) {
                count++;
            }

            if(sum <= x) {
                start++;
            }
            else {
                end--;
            }
        }
        System.out.println(count);
    }
}
