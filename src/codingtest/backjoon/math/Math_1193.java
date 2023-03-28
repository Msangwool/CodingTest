package codingtest.backjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i = 1;
        int sum = 0;
        int[] arr = new int[2];
        while (true) {
            sum += i;
            if (n <= sum){
                break;
            }
            i++;
        }
        sum -= i;
        sum += 1;
        if (i%2 == 0) {
            arr[0] = 1;
            arr[1] = i;
            while (true) {
                if (sum == n) {
                    break;
                }
                arr[0]++;
                arr[1]--;
                sum++;
            }
        } else {
            arr[0] = i;
            arr[1] = 1;
            while (true) {
                if (sum == n) {
                    break;
                }
                arr[0]--;
                arr[1]++;
                sum++;
            }
        }
        System.out.println(arr[0] + "/" + arr[1]);
    }
}
