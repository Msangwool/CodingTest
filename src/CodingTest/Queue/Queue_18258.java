package CodingTest.Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Deque;

public class Queue_18258 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        String str;

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            str = st.nextToken();

            if(str.equals("push")){
                queue.add(Integer.parseInt(st.nextToken()));
            }
            else if(str.equals("pop")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            }
            else if(str.equals("size")){
                sb.append(queue.size()).append("\n");
            }
            else if(str.equals("empty")){
                if(queue.isEmpty()){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            else if(str.equals("front")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peekFirst()).append("\n");
                }
            }
            else if(str.equals("back")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peekLast()).append("\n");
                }
            } else {
                System.exit(0);
            }
        }
        System.out.println(sb);
    }
}
