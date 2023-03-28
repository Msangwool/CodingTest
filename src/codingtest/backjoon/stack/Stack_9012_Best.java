package codingtest.backjoon.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Stack_9012_Best {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            boolean test = false;
            String[] str = br.readLine().split("");
            Stack<String> stack = new Stack<>();
            for (int j=0; j<str.length; j++) {
                if (str[j].equals("(")) {
                    stack.add(str[j]);
                }
                else if (str[j].equals(")")) {
                    if(stack.isEmpty()) {
                        test = true;
                        break;
                    }
                    else if (stack.peek().equals("(")){
                        stack.pop();
                    } else {
                        test = true;
                        break;
                    }
                }
            }
            if(stack.isEmpty() & test == false){
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.println(sb);
    }
}
