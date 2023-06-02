package codingtest.backjoon.nomalmath;

import java.io.*;
import java.util.StringTokenizer;

public class NomalMath_2745 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] N = st.nextToken().toCharArray();
        int B = Integer.parseInt(st.nextToken());

        for (char c : N) {
            int p = c;

            if (p < 10) {
                bw.write(p + "");
                continue;
            }

            bw.write((p - 55) + "");
        }

        bw.flush();
        bw.close();
    }
}
