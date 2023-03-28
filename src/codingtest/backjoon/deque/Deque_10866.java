package codingtest.backjoon.deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Deque_10866 {
    public static int[] arr;
    public static int start;
    public static int end;

    public static void push_front(int number){
        arr[start-1] = number;
        start--;
    }
    public static void push_back(int number){
        arr[end] = number;
        end++;
    }
    public static int pop_front(){
        if(empty()==1){
            return -1;
        } else {
            int number = arr[start];
            arr[start] = 0;
            start++;
            return number;
        }
    }
    public static int pop_back(){
        if(empty()==1){
            return -1;
        } else {
            int number = arr[end-1];
            arr[end-1] = 0;
            end--;
            return number;
        }
    }
    public static int size(){
        return end-start;
    }
    public static int empty(){
        if(size()==0){
            return 1;
        } else {
            return 0;
        }
    }
    public static int front(){
        if(empty()==1){
            return -1;
        } else {
            return arr[start];
        }
    }
    public static int back(){
        if(empty()==1){
            return -1;
        } else {
            return arr[end-1];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String str;

        int n = Integer.parseInt(br.readLine());

        if(n>10000 | n<1){
            System.exit(0);
        }

        start = n;
        end = n;

        arr = new int[2*n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            str = st.nextToken();
            if(str.equals("push_front")){
                int number = Integer.parseInt(st.nextToken());
                if(number > 100000 | number<1){
                    System.exit(0);
                }
                push_front(number);
            }
            else if(str.equals("push_back")){
                int number = Integer.parseInt(st.nextToken());
                if(number > 100000 | number<1){
                    System.exit(0);
                }
                push_back(number);
            }
            else if(str.equals("pop_front")){
                sb.append(pop_front()).append("\n");
            }
            else if(str.equals("pop_back")){
                sb.append(pop_back()).append("\n");
            }
            else if(str.equals("size")){
                sb.append(size()).append("\n");
            }
            else if(str.equals("empty")){
                sb.append(empty()).append("\n");
            }
            else if(str.equals("front")){
                sb.append(front()).append("\n");
            }
            else if(str.equals("back")){
                sb.append(back()).append("\n");
            } else {
                System.exit(0);
            }
        }
        System.out.println(sb);
    }
}
