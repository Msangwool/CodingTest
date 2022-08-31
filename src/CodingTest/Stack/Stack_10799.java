package CodingTest.Stack;

import java.io.*;
import java.util.Stack;

public class Stack_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        String[] str = br.readLine().split("");
        int sum=0;
        for(int i=0; i<str.length; i++){
            if (str[i].equals("(")) {
                stack.push("(");
            }
            else if (str[i].equals(")")) {
                stack.pop();
                if (str[i-1].equals("(")) {
                    sum += stack.size();
                } else {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
