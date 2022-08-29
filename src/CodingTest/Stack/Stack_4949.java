package CodingTest.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Stack_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str;
        String[] strArr;
        boolean test;

        while(!(str=br.readLine()).equals(".")){
            test = false;
            stack = new Stack<>();
            strArr = str.split("");
            for(int i=0; !strArr[i].equals("."); i++){
                if(strArr[i].equals("(")){
                    stack.add(strArr[i]);
                }
                else if(strArr[i].equals("[")){
                    stack.add(strArr[i]);
                }
                else if(strArr[i].equals(")")){
                    if(stack.isEmpty()){
                        sb.append("no\n");
                        test = true;
                        break;
                    }
                    else if(stack.peek().equals("(")){
                        stack.pop();
                    }
                    else if(!stack.peek().equals("(")){
                        stack.add(strArr[i]);
                    }
                }
                else if(strArr[i].equals("]")){
                    if(stack.isEmpty()){
                        sb.append("no\n");
                        test = true;
                        break;
                    }
                    else if(stack.peek().equals("[")){
                        stack.pop();
                    }
                    else if(!stack.peek().equals("[")){
                        stack.add(strArr[i]);
                    }
                }
            }
            if(stack.isEmpty()){
                if(test!=true) {
                    sb.append("yes\n");
                }
            } else {
                sb.append("no\n");
            }
        }
        System.out.println(sb);
    }
}
