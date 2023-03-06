package CodingTest.BasicCode;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_10869 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a, b;

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        if (b == 0 | 1 > a | 1 > b | a > 10000 | b > 10000) {
            return;
        }

        sb
                .append(add(a, b)).append("\n")
                .append(minus(a, b)).append("\n")
                .append(multiply(a, b)).append("\n")
                .append(divide(a, b)).append("\n")
                .append(share(a, b)).append("\n");

        bw.write(sb + "");
        bw.close();
    }

    static int add(int a, int b) {

        return a + b;
    }

    static int minus(int a, int b) {

        return a - b;
    }

    static int multiply(int a, int b) {

        return a * b;
    }

    static int divide(int a, int b) {

        return a / b;
    }

    static int share(int a, int b) {

        return a % b;
    }
}
