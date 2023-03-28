package codingtest.backjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int a, b;
        a = number/10;
        b = number%10;
        int sum = a+b, count = 1;
        while(true){
            int newNumber = b*10 + sum%10;
            if(newNumber == number){
                break;
            }
            a = b;
            b = sum%10;
            sum = a+b;
            count++;
        }
        System.out.println(count);
    }
}
