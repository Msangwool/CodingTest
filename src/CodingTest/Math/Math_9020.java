package CodingTest.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Math_9020 {
    public static boolean primenumber (int n) {
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
        int n = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < n ; i++) {
            int number = Integer.parseInt(br.readLine());
            int[] arr = new int[number];
            int count = 0;
            for (int j = 1 ; j < number ; j++) {
                if (primenumber(j)) {
                    arr[count] = j;
                    count++;
                }
            }
            int[] realArr = new int[count];
            for (int j = 0; j < count ; j++) {
                realArr[j] = arr[j];
            }

            Arrays.sort(realArr);

            int start = 0;
            int end = count - 1;
            int sum = 0;
            int a = 0, b = 0;
            boolean test = false;

            for (int j = 0 ; j < count ; j++) {
                if (realArr[j] * 2 == number) {
                    sb.append(realArr[j] + " " + realArr[j]).append("\n");
                    test = true;
                }
            }
            if (test == true) {
                continue;
            }

            while(start < end) {
                sum = realArr[start] + realArr[end];
                if(sum == number) {
                    a = realArr[start];
                    b = realArr[end];
                }

                if(sum <= number) {
                    start++;
                }
                else {
                    end--;
                }
            }
            sb.append(a + " " + b).append("\n");
        }
        System.out.println(sb);
    }
}
