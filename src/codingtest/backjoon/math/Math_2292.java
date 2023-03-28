package codingtest.backjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 1;
        int t = 1;

        while (result < n) {
            result += (t * 6);
            t++;
        }
        System.out.println(t);
    }
}
