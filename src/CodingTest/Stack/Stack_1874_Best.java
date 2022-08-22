package CodingTest.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Stack_1874_Best {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int end = 0;

        int n = Integer.parseInt(br.readLine());

        if(n>100000 | n<1){
            System.exit(0);
        }

        while(n-->0){
            int integer = Integer.parseInt(br.readLine());
            if (integer > end) {
                for(int j=end+1; j<=integer; j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                end = integer;
            }

            if (integer<end & stack.peek() != integer) {
                System.out.println("NO");
                System.exit(0);
            }
            if (integer<=end){
                stack.pop();
                sb.append("-\n");
            }

            if(n==0){
                break;
            }
        }
        System.out.println(sb);
    }
}
