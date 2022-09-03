package CodingTest.Loop;

import java.io.*;

public class Loop_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
