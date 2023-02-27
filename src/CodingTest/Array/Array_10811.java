package CodingTest.Array;

import java.io.*;
import java.util.StringTokenizer;

public class Array_10811 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arrCopy;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        if (1 > N | N > 100) {
            return;
        }

        int M = Integer.parseInt(st.nextToken());
        if (1 > M | M > 100) {
            return;
        }

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            if (1 > I | I > N) {
                return;
            }

            int J = Integer.parseInt(st.nextToken());
            if (I > J | J > N) {
                return;
            }

            if (I == J) {
                continue;
            }

            arrCopy = new int[J - I + 1];
            inversionMethod(arrCopy, arr, I, J);
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }

        bw.write(sb + "");
        bw.close();
    }

    private static void inversionMethod(int[] arrCopy, int[] arr, int I, int J) {
        for (int j = I - 1, t = 0; j < J; j++, t++) {
            arrCopy[t] = arr[j];
        }

        for (int j = I - 1, t = arrCopy.length - 1; j < J; j++, t--) {
            arr[j] = arrCopy[t];
        }
    }
}
