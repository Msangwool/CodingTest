package codingtest.backjoon.stack;

import java.io.*;
import java.util.Stack;

public class Stack_10799_Best {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        int sum=0;
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == '(') {
                stack.push('(');
            }
            else if (str.charAt(i) == ')') {
                stack.pop();
                if (str.charAt(i-1) == '(') {
                    sum += stack.size();
                } else {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
