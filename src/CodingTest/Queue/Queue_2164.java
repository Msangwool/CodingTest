package CodingTest.Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int copy;

        int n = Integer.parseInt(br.readLine());

        if(n>500000 | n<1){
            System.exit(0);
        }

        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        for(int i=0; i<n; i++) {
            for (int j = 0; j < queue.size(); j++) {
                if(queue.size() == 1){
                    System.out.println(queue.poll());
                    System.exit(0);
                }
                queue.poll();
                copy = queue.poll();
                queue.add(copy);
            }
        }
    }
}
