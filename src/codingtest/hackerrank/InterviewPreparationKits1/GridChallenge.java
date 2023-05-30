package codingtest.hackerrank.InterviewPreparationKits1;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class GridChallenge {

    static class Result {

        /*
         * Complete the 'gridChallenge' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING_ARRAY grid as parameter.
         */

        public static String gridChallenge(List<String> grid) {
            // Write your code here

            int n;
            int m;

            if (( n = grid.size() ) == 1) {
                return "YES";
            }

            char[] beforeArr = grid.get(0).toCharArray();
            Arrays.sort(beforeArr);

            m = beforeArr.length;

            List<char[]> sortedGrid = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                char[] sortedArr = grid.get(i).toCharArray();
                Arrays.sort(sortedArr);
                sortedGrid.add(sortedArr);
            }

            for (char[] afterArr : sortedGrid) {
                for (int i = 0; i < m; i++) {
                    if (beforeArr[i] > afterArr[i]) {
                        return "NO";
                    }
                }
            }

            return "YES";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                            try {
                                return bufferedReader.readLine();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        })
                        .collect(toList());

                String result = Result.gridChallenge(grid);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
