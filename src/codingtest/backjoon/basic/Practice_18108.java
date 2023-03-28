package codingtest.backjoon.basic;

import java.io.*;

public class Practice_18108 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int year = Integer.parseInt(br.readLine());

        if (1000 > year | year > 3000) {
            return;
        }

        int interval = 2541 - 1998;

        bw.write(year - interval + "");
        bw.close();
    }
}
