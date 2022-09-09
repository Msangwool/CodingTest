package CodingTest.Math;

import java.io.*;
import java.util.StringTokenizer;

public class Math_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0, count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        while(true){
            sum += A;
            count++;
            if(sum>=V){
                break;
            }
            sum -= B;
        }
        System.out.println(count);
    }
}
