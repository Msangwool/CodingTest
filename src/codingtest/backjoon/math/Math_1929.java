package codingtest.backjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_1929 {
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for (int i = M ; i <= N ; i++ ) {
            if ( primenumber(i) ) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
