package codingtest.backjoon.procession;

import java.io.*;
import java.util.StringTokenizer;

public class Procession_2563 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int num1, num2;
        int result = 0;

        boolean[][] arr = new boolean[101][101];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());

            for (int j = num1; j < num1 + 10; j++) {
                for (int t = num2; t < num2 + 10; t++) {
                    arr[j][t] = true;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]) {
                    result++;
                }
            }
        }

        bw.write(result + "");
        bw.close();
    }
}
