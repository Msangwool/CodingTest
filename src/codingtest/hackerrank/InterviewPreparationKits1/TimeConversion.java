package codingtest.hackerrank.InterviewPreparationKits1;

import java.io.*;

public class TimeConversion {

    static class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            // Write your code here

            String whatMidday = s.substring(s.length() - 2);
            String[] date = s.substring(0, s.length() - 2).split(":");

            int hour = Integer.parseInt(date[0]);
            int minute = Integer.parseInt(date[1]);
            int second = Integer.parseInt(date[2]);

            if (whatMidday.equals("PM") && hour != 12) {
                hour += 12;
            } else if (whatMidday.equals("AM") && hour == 12) {
                hour -= 12;
            }

            return String.format("%02d:%02d:%02d", hour, minute, second);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
