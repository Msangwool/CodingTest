package codingtest.hackerrank.InterviewPreparationKits1;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagSequence {

    public static void main (String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for(int cs = 1; cs <= test_cases; cs++){
            int n = kb.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
    }

    // 총 3줄의 변경사항
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        // 변경 사항, median 값을 가져오기 위해서는 n + 1 / 2 가 아닌 n - 1 / 2 를 해야 한다
        int mid = (n - 1)/2;        // (n + 1) / 2  -> (n - 1) / 2
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        // 이미 median 값과 max 값을 변경했으므로, 제일 작은 값이 들어 있는 median 값은 변경하지 않아야 한다
        int ed = n - 2;             // n - 1 -> n - 2
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            // 서로 격차를 줄이기 위해 ed 는 끝부터 index 가 감소해야 한다
            ed = ed - 1;            // ed + 1 -> ed - 1
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}



