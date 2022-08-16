package CodingTest.Array;

import java.io.*;
import java.util.StringTokenizer;

public class Array_3273 {
    public static void main(String[] args) throws IOException {
        int N, result, count = 0;
        int[] arr;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        if(N>100000 | N<1){
            System.exit(0);
        }

        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        result = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]>2000000 | arr[i]<0){
                System.exit(0);
            }
        }

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i]+arr[j] == result){
                    count++;
                }
            }
        }
        bw.write(count);
        bw.close();
    }
}
