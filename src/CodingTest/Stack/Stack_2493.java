package CodingTest.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Stack_2493 {
    public static void copy(int size, Stack stack, Stack stackCopy, int number){
        for(int t=0; t<size; t++){
            stack.add(stackCopy.pop());
        }
        stack.add(number);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stackCopy = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int number, size;
        boolean test;
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        if(n>500000 | n<1){
            System.exit(0);
        }

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            test = false;
            number = Integer.parseInt(st.nextToken());
            if(stack.isEmpty()){
                stack.add(number);
                sb.append(0).append(" ");
            } else {
                size = stack.size();
                for(int j=0; j<size; j++) {
                    stackCopy.add(stack.pop());
                    if (stackCopy.peek() >= number) {
                        sb.append(size - j).append(" ");
                        size = stackCopy.size();
                        copy(size, stack, stackCopy, number);
                        test = true;
                        break;
                    }
                }
                if(test == false){
                    size = stackCopy.size();
                    copy(size, stack, stackCopy, number);
                    sb.append(0).append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}
