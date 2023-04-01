package codingtest.backjoon.procession;

import java.io.*;
import java.util.StringTokenizer;

public class Procession_2566 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int row;
        int max = 0;
        int[] arr = new int[2];
        StringBuilder sb = new StringBuilder();

        for (row = 0; row < 9; row++) {

            max = getMax(row, max, arr);
        }

        sb.append(max).append("\n");
        sb.append(arr[0]).append(" ").append(arr[1]);

        bw.write(sb + "");
        bw.close();
    }

    private static int getMax(int row, int max, int[] arr) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num >= max) {
                max = num;
                arr[0] = row + 1;
                arr[1] = i + 1;
            }
        }

        return max;
    }
}
