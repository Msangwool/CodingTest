package CodingTest.Improvement_1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Improvement_10812 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrCopy = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            arr.add(i);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for (int j = 0; j < K - I; j++) {
                arrCopy.add(arr.get(I - 1));
                arr.remove(I - 1);
            }

            for (int j = J - (K - I), t = 0; t < arrCopy.size(); j++, t++) {
                arr.add(j, arrCopy.get(t));
            }
            arrCopy.clear();
        }

        for (int i = 0; i < N; i++) {

            sb.append(arr.get(i)).append(" ");
        }

        bw.write(sb + "");
        bw.close();
    }
}
