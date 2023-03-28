package codingtest.backjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_2839 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int n = Integer.parseInt(br.readLine()) ;
        for (int i = n/5 ; i > 0 ; i--) {
            int result = n-5*i ;
            if (result%3 == 0) {
                System.out.println(i+result/3) ;
                System.exit(0) ;
            }
        }
        if (n%5 == 0) {
            System.out.println(n/5) ;
        } else if ((n%3) == 0) {
            System.out.println(n/3) ;
        } else {
            System.out.println(-1) ;
        }
    }
}
