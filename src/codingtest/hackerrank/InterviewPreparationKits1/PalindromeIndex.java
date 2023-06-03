package codingtest.hackerrank.InterviewPreparationKits1;

import java.io.*;
import java.util.stream.*;

public class PalindromeIndex {

    static class Result {

        public static int palindromeIndex(String s) {

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    // 다른 문자를 찾은 경우 왼쪽 인덱스의 값이 다음 값과 동일하지 않다면 Palindrome
                    if (s.charAt(left) != s.charAt(left + 1)) {
                        return left;
                    } else {
                        return right;
                    }
                }
                left++;
                right--;
            }

            return -1;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
