package codingtest.hackerrank.InterviewPreparationKits1;

import java.io.*;

public class RecursiveDigitSum {

    static class Result {

        /*
         * Complete the 'superDigit' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. STRING n
         *  2. INTEGER k
         */

        public static int superDigit(String n, int k) {
            // Write your code here

            if (n.length() == 1 || k == 0) {
                return Integer.parseInt(n);
            }

            long sum = 0;
            for (int i = 0; i < n.length(); i++) {
                sum += Character.getNumericValue(n.charAt(i));
            }

            String p = Long.toString(sum * k);

            return superDigit(p, 1);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
