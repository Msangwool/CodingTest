package codingtest.hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staircase {

    static class Result {
        /*
         * Complete the 'staircase' function below.
         *
         * The function accepts INTEGER n as parameter.
         */

        public static void staircase(int n) {
            // Write your code here

            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    sb.append(" ");
                }
                for (int k = 1; k <= i; k++) {
                    sb.append("#");
                }
                sb.append("\n");
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}

