package codingtest.hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class PlusMinus {

    static class Result {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            StringBuilder sb = new StringBuilder();

            int arrSize = arr.size();
            int plusCount = 0;
            int minusCount = 0;
            int zero = 0;

            for (int value : arr) {
                if (value > 0) {
                    plusCount++;
                } else if (value < 0) {
                    minusCount++;
                } else {
                    zero++;
                }
            }

            sb.append((double) plusCount / arrSize).append("\n");
            sb.append((double) minusCount / arrSize).append("\n");
            sb.append((double) zero / arrSize).append("\n");

            System.out.println(sb);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
