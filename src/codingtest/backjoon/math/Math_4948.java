package codingtest.backjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_4948 {
    public static boolean primenumber( int n ) {
        if ( n == 1 ) {
            return false;
        }
        for ( int i = 2 ; i * i <= n ; i++ ) {
            if ( n % i == 0 ) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            for (int i = n+1 ; i <= 2 * n ; i++) {
                if (primenumber(i)) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
