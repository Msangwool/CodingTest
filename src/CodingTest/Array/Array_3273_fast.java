package CodingTest.Array;

import java.util.Scanner;

public class Array_3273_fast {
    public static void main(String[] args){
        int N, result, count = 0;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        if(N>100000 | N<1){
            System.exit(0);
        }

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>2000000 | arr[i]<1){
                System.exit(0);
            }
        }

        result = sc.nextInt();

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(arr[i]+arr[j] == result){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
