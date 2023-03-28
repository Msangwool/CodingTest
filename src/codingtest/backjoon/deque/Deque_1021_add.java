package codingtest.backjoon.deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Deque_1021_add{   //pop을 양뱡향으로 한다고 가정했을 때의 최소 이동 횟수.
    public static int count = 0;
    public static void firstMethod(LinkedList deque) {
        deque.addLast(deque.removeFirst());
        count++;
    }
    public static void lastMethod(LinkedList deque) {
        deque.addFirst(deque.removeLast());
        count++;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> deque = new LinkedList<>();
        int number;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i=1; i<=n; i++){
            deque.add(i);
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            number = Integer.parseInt(st.nextToken());
            while(true) {
                if (!deque.contains(number)) {
                    System.exit(0);                      // 비교 대상 없을 시 종료.
                }
                if(deque.peekLast() == number) {
                    deque.removeLast();                         // 비교 대상이 큐의 처음이면 제거.
                    break;
                }
                else if(deque.peekFirst() == number) {          // 비교 대상이 큐의 마지막이면 제거.
                    deque.removeFirst();
                    break;
                }
                else if (deque.indexOf(number) >= deque.size() / 2) {
                    lastMethod(deque);                          // 비교 원소가 뒤에서부터 가까우면 lastMethod 연산 실행
                }
                else {
                    firstMethod(deque);                         // 비교 원소가 앞에서부터 가까우면 firstMethod 연산 실행
                }
            }
        }
        System.out.println(count);
    }
}