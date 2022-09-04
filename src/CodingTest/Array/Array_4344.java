package CodingTest.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            arr = new int[m];
            float sum = 0, count = 0;
            for(int j=0; j<m; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            float result = sum/m;
            for(int j=0; j<m; j++){
                if(arr[j] > result){
                    count++;
                }
            }
            sb.append(String.format("%.3f", count/m*100)).append("%\n");
        }
        System.out.println(sb);
    }
}
