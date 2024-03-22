package codingtest.programmers.basic;

import java.util.Scanner;

public class ChangeUpperAndLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                arr[i] += 32;
            } else if (arr[i] >= 97 && arr[i] <= 122) {
                arr[i] -= 32;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            sb.append(c);
        }

        System.out.println(sb);
    }
}
