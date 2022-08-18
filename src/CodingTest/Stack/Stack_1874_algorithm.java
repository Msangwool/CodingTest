package CodingTest.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack_1874_algorithm {

    public static int n;
    public static int[] stact;
    public static int push(){
        return n;
    }
    public static int pop(){
        return n;
    }

    public static void main(String[] args) throws IOException {
        int end = 0, value, max = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        stact = new int[n];

        for(int i=0; i<n; i++){
            value = Integer.parseInt(br.readLine());
            max = value;
            for(int j=end; j<max; j++){
                end++;
                stact[j] = max;
            }
            if(value == stact[end-1]){
                end--;
                if(stact[end]==0){
                    System.out.println("No");
                    System.exit(0);
                }
                System.out.println(stact[end]);
                stact[end] = 0;
            }
        }
        for(int i=0; i<n; i++){
        }
    }
}
