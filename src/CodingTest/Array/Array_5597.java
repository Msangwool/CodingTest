package CodingTest.Array;

import java.io.*;

public class Array_5597 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[30];

        for (int i = 0; i < arr.length - 2; i++) {
            int studentNum = Integer.parseInt(br.readLine());
            arr[studentNum - 1] = studentNum;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sb.append(i+1).append("\n");
            }
        }

        bw.write(sb + "");
        bw.close();
    }
}
