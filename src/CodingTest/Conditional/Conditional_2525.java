package CodingTest.Conditional;

import java.io.*;
import java.util.StringTokenizer;

public class Conditional_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int needTime = Integer.parseInt(br.readLine());
        int sum = minute+needTime;
        if(sum<60){
            System.out.print(hour + " " + sum);
        } else {
            if((hour+(sum/60)) >= 24) {
                System.out.println(((hour+(sum/60))-24) + " " + sum%60);
            } else {
                System.out.println((hour+(sum/60)) + " " + sum%60);
            }
        }
    }
}
