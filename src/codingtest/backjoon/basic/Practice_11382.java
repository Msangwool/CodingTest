package codingtest.backjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_11382 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());
        Long c = Long.parseLong(st.nextToken());

        double maxNum = Math.pow(10, 12);

        Long sum = a+b+c;
        bw.write(sum + "");
        bw.flush();
    }
}
