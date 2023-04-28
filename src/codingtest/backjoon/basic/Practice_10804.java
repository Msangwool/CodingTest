package codingtest.backjoon.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Practice_10804 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st;

        int a, b, c = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (20 < a | 20 < b | 1 > a | 1 > b) {
                return;
            }

            int[] arrCopy = new int[b - a + 1];

            for (int j = a - 1; j < b; j++) {
                arrCopy[c] = arr[j];
                c++;
            }

            c = 0;

            arrReverse(arrCopy);

            for (int j = a - 1; j < b; j++) {
                arr[j] = arrCopy[c];
                c++;
            }

            c = 0;
        }


        for (int i = 0; i < 20; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }

    static void arrReverse(int[] arr) {

        int j = arr.length;
        int[] arrCopy = new int[j];

        for (int k : arr) {
            arrCopy[j - 1] = k;
            j--;
        }

        System.arraycopy(arrCopy, 0, arr, 0, arr.length);
    }
}
