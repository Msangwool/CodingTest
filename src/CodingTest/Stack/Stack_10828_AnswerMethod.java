package CodingTest.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack_10828_AnswerMethod {
    public static int[] stack;
    public static int end = -1;

    public static int pop(){
        int integer;
        if(end == -1){
            return end;
        } else {
            integer = stack[end];
            stack[end] = 0;
            end--;
            return integer;
        }
    }

    public static int size(){
        if(end != -1){
            return end + 1 ;
        } else {
            return 0;
        }
    }
    public static int empty(){
        if(end == -1){
            return 1;
        } else{
            return 0;
        }
    }
    public static int top(){
        if(end == -1){
            return end;
        } else {
            return stack[end];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command;
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        if(n>10000 | n<1){
            System.exit(0);
        }


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
                System.out.println(pop());
            } else if(command.equals("size")){
                System.out.println(size());
            } else if(command.equals("empty")){
                System.out.println(empty());
            } else if(command.equals("top")){
                System.out.println(top());
            }
        }
    }
}
