package CodingTest.Math;

import java.io.*;
import java.util.StringTokenizer;

public class Math_2869_fast {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double V = Double.parseDouble(st.nextToken());

        int result = (int)Math.ceil((V-B)/(A-B));
        System.out.println(result);
    }
}
