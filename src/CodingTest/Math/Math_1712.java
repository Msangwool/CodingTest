package CodingTest.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st.nextToken());
        if(B>=C){
            System.out.println(-1);
            System.exit(0);
        }
        long x = 1;
        long number = C-B;
        while (true) {
            if(A<x*number){
                break;
            }
            x++;
        }
        System.out.println(x);
    }
}