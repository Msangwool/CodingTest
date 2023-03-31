package codingtest.backjoon.procession;

import java.io.*;
import java.util.StringTokenizer;

public class Procession_2738 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] arr = new int[row][col];

        makeArr(arr);

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += Integer.parseInt(st.nextToken());
            }
        }

        sb = printArr(arr);

        bw.write(sb + "");
        bw.close();
    }

    private static StringBuilder printArr(int[][] arr) {
        StringBuilder sb = new StringBuilder();

        for (int[] ints : arr) {
            for (int anInt : ints) {
                sb.append(anInt).append(" ");
            }
            sb.append("\n");
        }

        return sb;
    }

    private static void makeArr(int[][] arr) throws IOException {
        for (int i = 0; i < arr.length; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
