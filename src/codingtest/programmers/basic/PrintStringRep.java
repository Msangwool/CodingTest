package codingtest.programmers.basic;

import java.util.Scanner;

public class PrintStringRep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        System.out.println(String.valueOf(str).repeat(Math.max(0, n)));
    }
}