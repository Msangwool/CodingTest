package codingtest.backjoon.loop;

import java.io.*;

public class Loop_25314 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        n /= 4;

        for (int i = 0; i < n; i++) {
            sb.append("long ");
        }
        sb.append("int");

        bw.write(sb + "");
        bw.close();
    }
}
