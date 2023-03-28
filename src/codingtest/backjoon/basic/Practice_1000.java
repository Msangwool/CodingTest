package codingtest.backjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_1000 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a, b;

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        if (0 > a | a > 10 | 0 > b | b > 10) {
            return;
        }

        bw.write(a + b + "");
        bw.close();
    }
}
