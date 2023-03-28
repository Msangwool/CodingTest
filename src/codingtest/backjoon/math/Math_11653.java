package codingtest.backjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_11653 {
    public static boolean primenumber(int n) {
        if(n==1) {
            return false;
        }
        for(int i=2 ; i<n ; i++ ) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.exit(0);
        } else if (primenumber(n)) {
            System.out.println(n);
            System.exit(0);
        }
        int result = n ;
        for (int i = 2 ; i < n ; i++) {
            if (result % i == 0) {
                sb.append(i).append("\n");
                result /= i;
                i = 1;
            }
            if (primenumber(result)) {
                sb.append(result).append("\n");
                break;
            }
        }
        System.out.println(sb);
    }
}
