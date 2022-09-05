package CodingTest.Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Method_1065 {
    public static int hansoo(int n) {
        if (n<100) {
            return n;
        } else {
            int result = 99;
            for(int i=100; i<=n; i++){
                if(i/100 - (i%100)/10 == (i%100)/10 - i%10){
                    result++;
                }
            }
            return result;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(hansoo(n));
    }
}
