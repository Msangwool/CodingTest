package codingtest.backjoon.array;

import java.io.*;
import java.util.StringTokenizer;

public class Array_10810 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();


        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        if (1 > N | N > 100) {
            return;
        }
        int[] arr = new int[N];

        int M = Integer.parseInt(st.nextToken());
        if (1 > M | M > 100) {
            return;
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

            int K = Integer.parseInt(st.nextToken());
            if (1 > K | K > N) {
                return;
            }

            for (int j = I-1; j < J; j++) {
                arr[j] = K;
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(arr[i] + " ");
        }

        bw.write(sb + "");
        bw.close();
    }
}
