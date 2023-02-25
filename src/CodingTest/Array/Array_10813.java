package CodingTest.Array;

import java.io.*;
import java.util.StringTokenizer;

public class Array_10813 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        if (1 > N | N > 100) {
            return;
        }

        int M = Integer.parseInt(st.nextToken());
        if (1 > M | M > 100) {
            return;
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
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

            changeBall(arr, I-1, J-1);
        }

        for (int i = 0; i < N; i++) {
            sb.append(arr[i] + " ");
        }

        bw.write(sb + "");
        bw.close();
    }

    private static void changeBall(int[] arr, int I, int J) {
        int trans;
        trans = arr[I];
        arr[I] = arr[J];
        arr[J] = trans;
    }
}
