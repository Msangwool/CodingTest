package codingtest.backjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_1008 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        double a, b;

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        if (0 >= a | 0 >= b | a >= 10 | b >= 10) {
            return;
        }

        bw.write(a / b + "");
        bw.close();
    }
}
