package CodingTest.Array;

import java.util.Scanner;

public class Array_10807 {
    public static void main(String[] args){
        int N;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        if(N>100 | N<0){
            System.exit(0);
        }

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int test = sc.nextInt();

        for(int i=0; i<N; i++){
            if(arr[i] > 100 | test > 100 | arr[i] < -100 | test < -100){
                System.exit(0);
            }
            else if(arr[i] == test){
                count++;
            }
        }
        System.out.println(count);
    }
}
