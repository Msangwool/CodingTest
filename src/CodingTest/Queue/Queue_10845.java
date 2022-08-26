package CodingTest.Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Queue_10845 {

    public static int start=0;
    public static int end=0;
    public static int[] arr;

    public static void push(int number){
        arr[end] = number;
        end++;
    }
    public static int pop(){
        if(arr[start] == 0){
            return -1;
        }
        int number = arr[start];
        arr[start] = 0;
        start++;
        return number;
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
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int number;

        int n =  Integer.parseInt(br.readLine());

        if(n>10000 | n<1){
            System.exit(0);
        }

        arr = new int[n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")){
                number = Integer.parseInt(st.nextToken());
                if(number>100000 | number<1){
                    System.exit(0);
                }
                push(number);
            }
            else if(str.equals("pop")){
                sb.append(pop()).append("\n");
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
