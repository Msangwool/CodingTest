package CodingTest.Stack;

import java.util.Scanner;

public class Stack_10828_Best {

    public static int size = 0;
    public static int[] arr;

    public static void push(int number){
        arr[size] = number;
        size++;
    }

    public static int pop(){
        if(size == 0){
            return -1;
        } else {
            int number = arr[size-1];
            arr[size-1] = 0;
            size--;
            return number;
        }
    }

    public static int size(){
        return size;
    }

    public static int empty(){
        if(size==0){
            return 1;
        } else {
            return 0;
        }
    }

    public static int top(){
        if(size == 0){
            return -1;
        } else {
            return arr[size-1];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        arr = new int[n];

        if(n>10000 | n<1){
            System.exit(0);
        }

        for(int i=0; i<n; i++){
            String str = sc.next();

            if(str.equals("push")){
                int number = sc.nextInt();
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
            else if(str.equals("top")){
                sb.append(top()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
