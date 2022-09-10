package CodingTest.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_2775 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int[] arr = new int[a];
            if (a == 1) {
                int sum = 0 ;
                for (int j = 1 ; j <= b ; j++) {
                    sum += j;
                }
                sb.append(sum).append("\n");
            } else {
                int sum = 0 ;
                for (int j = 1 ; j <= b ; j++) {
                    sum += j ;
                    arr[0] += sum ;
                    for (int t = 1; t < a ; t++) {
                        arr[t] += arr[t-1] ;
                    }
                }
                sb.append(arr[a-2]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
