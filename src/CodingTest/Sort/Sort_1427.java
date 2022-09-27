package CodingTest.Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Sort_1427 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();

        String[] n_String = n.split("");

        int[] n_Sort = new int[n_String.length];

        for (int i = 0; i < n_String.length; i++) {
            n_Sort[i] = Integer.parseInt(n_String[i]);
        }
        Arrays.parallelSort(n_Sort);

        for (int i = n_String.length-1; i >= 0; i--) {
            sb.append(n_Sort[i]);
        }
        System.out.println(sb);
    }
}
