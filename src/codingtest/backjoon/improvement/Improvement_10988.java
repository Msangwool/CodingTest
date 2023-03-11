package codingtest.backjoon.improvement;

import java.io.*;

public class Improvement_10988 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        if (1 > str.length() | str.length() > 100) {
            return;
        }

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                bw.write(0 + "");
                bw.close();
                return;
            }
        }
        bw.write(1 + "");
        bw.close();
    }
}
