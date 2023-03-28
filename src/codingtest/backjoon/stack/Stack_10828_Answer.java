package codingtest.backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack_10828_Answer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = 0;
        int end = -1;
        String command;
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        if(n>10000 | n<1){
            System.exit(0);
        }

        int[] stack = new int[n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            command = st.nextToken();
            if(command.equals("push")){
                end++;
                stack[end] = Integer.parseInt(st.nextToken());
                if(stack[end] > 10000 | stack[end] < 1){
                    System.exit(0);
                }
            } else if(command.equals("pop")){
                if(end != -1){
                    System.out.println(stack[end]);
                    stack[end] = 0;
                    end--;
                } else {
                    System.out.println(-1);
                }
            } else if(command.equals("size")){
                if(end != -1){
                    System.out.println(end+1);
                } else {
                    System.out.println(0);
                }
            } else if(command.equals("empty")){
                if(end == -1){
                    System.out.println(1);
                } else{
                    System.out.println(0);
                }
            } else if(command.equals("top")){
                if(end == -1){
                    System.out.println(end);
                } else {
                    System.out.println(stack[end]);
                }
            }
        }
    }
}
