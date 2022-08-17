package CodingTest.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Array_11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a, b;
        char[] a_arr, b_arr;

        int n = Integer.parseInt(br.readLine());

        if(n>1001 | n<0){
            System.exit(0);
        }

        for(int i=0; i<n; i++){
            String[] st = br.readLine().split(" ");
            a_arr = st[0].toCharArray();
            b_arr = st[1].toCharArray();
            Arrays.sort(a_arr);
            Arrays.sort(b_arr);
            for(int j=0; j<a_arr.length; j++){
                if(a_arr[j] != b_arr[j]){
                    System.out.println("Impossible");
                    break;
                }
                else if(j == a_arr.length-1 & a_arr[j]==b_arr[j]){
                    System.out.println("Possible");
                }
            }
        }
    }
}
