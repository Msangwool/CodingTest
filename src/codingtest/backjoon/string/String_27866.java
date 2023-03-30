package codingtest.backjoon.string;

import java.io.*;

public class String_27866 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        int strLength = str.length();

        if (strLength > 1000) {
            return;
        }

        int number = Integer.parseInt(br.readLine());

        if (strLength < 1 & strLength > number) {
            return;
        }

        bw.write(str.charAt(number - 1) + "");
        bw.close();
    }
}
