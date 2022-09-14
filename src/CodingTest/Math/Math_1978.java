package CodingTest.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_1978 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for(int i = 0 ; i < n ; i++) {
            boolean test = false;
            int number = Integer.parseInt(st.nextToken());
            if (number == 1) {
                test = true;
            } else if (number == 2) {
                count ++;
                test = true;
            }
            for(int j=2; j<number ; j++) {
                if (number%j == 0) {
                    test = true;
                    break;
                }
            }
            if (test == false) {
                count++;
            }
        }
        System.out.println(count);
    }
}
