package codingtest.hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Mini_MaxSum {

    static class Result {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
            // Write your code here

            Long sum = 0L;

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (Integer num : arr) {
                sum += num;
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            System.out.print(sum - max + " ");
            System.out.println(sum - min);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
