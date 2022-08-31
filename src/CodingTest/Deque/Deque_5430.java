package CodingTest.Deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayDeque;

public class Deque_5430{
    public static boolean rMethod(boolean pointer){
        if(pointer == true){
            pointer = false;
            return pointer;
        }
        else if(pointer == false){
            pointer = true;
            return pointer;
        }
        else {
            System.out.println("삐용삐용 뭔가 잘못됨");
            return false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean pointer;

        int n = Integer.parseInt(br.readLine());
        if (n>100 | n<1){
            System.exit(0);
        }
        
        for (int i = 0; i < n; i++) {
            pointer = true;
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            String[] str = br.readLine().split("");
            int m = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            for(int j=0; j<m; j++){
                deque.add(Integer.parseInt(st.nextToken()));
            }
            for(int j=0; j< str.length; j++){
                if (str[j].equals("R")) {
                    pointer = rMethod(pointer);
                }
                else if (str[j].equals("D")) {
                    if (pointer == true) {
                        if(!deque.isEmpty()){
                            deque.removeFirst();
                        }
                    }
                    else if (pointer == false) {
                        if(!deque.isEmpty()){
                            deque.removeLast();
                        }
                    }
                } else {
                    System.exit(0);
                }
            }
            if(deque.size() == 0) {
                sb.append("error").append("\n");
            }
            else if (pointer == true) {
                sb.append(deque).append("\n");
            }
            else if (pointer == false) {
                ArrayDeque<Integer> copy = new ArrayDeque<>();
                int size = deque.size();
                for(int j=0; j<size; j++) {
                     copy.add(deque.removeLast());
                }
                sb.append(copy).append("\n");
            }
        }
        System.out.println(sb);
    }
}