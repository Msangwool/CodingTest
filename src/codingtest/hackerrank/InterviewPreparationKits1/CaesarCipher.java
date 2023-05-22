package codingtest.hackerrank.InterviewPreparationKits1;

import java.io.*;

public class CaesarCipher {

    static class Result {

        /*
         * Complete the 'caesarCipher' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. STRING s
         *  2. INTEGER k
         */

        public static String caesarCipher(String s, int k) {
            // Write your code here

            StringBuilder sb = new StringBuilder();

            // String 을 char[] 로 변경하여 char 타입으로 순환한다.
            for (char c : s.toCharArray()) {
                // 해당 char 가 알파벳인지 확인한다.
                if (Character.isLetter(c)) {
                    // 모두 수를 가지고 할 수 없기에, 각각 대문자, 소문자에 해당하는 기준점을 a or A 로 잡는다.
                    char base = Character.isUpperCase(c) ? 'A' : 'a';
                    // 현재 알파벳의 상대적 위치 - 알파벳이 시작되는 수 + 이동된 위치만큼 % 알파벳 개수
                    int offset = (c - base + k) % 26;
                    // 위 작업을 통해 상대적인 위치를 % 26 을 통해 파악할 수 있다.
                    char encryptedChar = (char) (base + offset);
                    // 이를 기준점과 더하여서 해당 char 를 찾아 sb 에 추가시킨다.
                    sb.append(encryptedChar);
                } else {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
