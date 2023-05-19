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

            Long sum = arr.stream().mapToLong(Integer::intValue).sum();
            Long min = arr.stream().mapToLong(Integer::intValue).min().getAsLong();
            Long max = arr.stream().mapToLong(Integer::intValue).max().getAsLong();

            System.out.printf("%d %d", sum - max, sum - min);
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
