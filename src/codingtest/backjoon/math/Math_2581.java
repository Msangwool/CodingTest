package codingtest.backjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_2581 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int mininum = 0;
        for (int i = m ; i <= n ; i++) {
            boolean test = false;
            if (i == 1) {
                test = true;
            } else if (i == 2) {
                if (mininum == 0) {
                    mininum = i;
                }
                sum += i;
                test = true;
            }
            for(int j=2; j<i ; j++) {
                if (i%j == 0) {
                    test = true;
                    break;
                }
            }
            if (test == false) {
                if (mininum == 0) {
                    mininum = i;
                }
                sum += i;
            }
        }
        if (mininum == 0) {
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(sum);
        System.out.println(mininum);
    }
}
