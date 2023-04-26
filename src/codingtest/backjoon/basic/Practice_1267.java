package codingtest.backjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_1267 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        int N;

        N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int y = makeFare(arr, 30, 10);
        int m = makeFare(arr, 60, 15);

        if (y > m) {
            sb.append("M").append(" ");
            sb.append(m).append("\n");
        } else if (y == m) {
            sb.append("Y M").append(" ");
            sb.append(y).append("\n");
        } else {
            sb.append("Y").append(" ");
            sb.append(y).append("\n");
        }

        bw.write(sb + "");
        bw.flush();
        bw.close();
    }

    static int makeFare(int[] arr, int value_1, int value_2) {
        int fee = 0;
        for (int j : arr) {
            fee += j / value_1 + 1;
        }
        return fee * value_2;
    }
}
