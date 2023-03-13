package codingtest.backjoon.math;

import java.io.*;
import java.util.StringTokenizer;

public class Math_5086 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n, m;

        while (true) {

            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            // 두 수는 자연수.
            if (n == 0 | m == 0) {
                bw.write(sb + "");
                bw.close();
                return;
            }

            if (n > m) {
                sb.append(isMultiple(n, m)).append("\n");
            } else {
                sb.append(isFactor(n, m)).append("\n");
            }
        }
    }

    private static String isFactor(int n, int m) {
        if (m % n == 0) {
            return "factor";
        } else {
            return "neither";
        }
    }

    private static String isMultiple(int n, int m) {
        if (n % m == 0) {
            return "multiple";
        } else {
            return "neither";
        }
    }
}
