package codingtest.programmers.basic.day_2;

import java.util.Scanner;

public class IsEvenOrOdd {
    public static void main(String[] args) {
        // input
        // 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(n%2 == 0 ? n + " is even" : " is odd");
        // output
        // 2 is even
    }
}
