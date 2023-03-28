package codingtest.backjoon.deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Deque_1021{
    public static int count = 0;    // 반복 횟수 count
    public static void firstMethod(LinkedList deque) {
        deque.addLast(deque.removeFirst());                 // 맨 앞 원소를 맨 뒤로.
        count++;
    }
    public static void lastMethod(LinkedList deque) {
        deque.addFirst(deque.removeLast());                 // 맨 뒤 원소를 맨 앞으로.
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
            deque.add(i);                                   // 덱 초기화.
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            number = Integer.parseInt(st.nextToken());
            while(true) {
                if (!deque.contains(number)) {
                    System.exit(0);
                }                                           // 비교하는 값이 없을 시 종료.
                if(deque.peekFirst() == number) {
                    deque.removeFirst();                    // 비교하는 값이 큐의 처음이면 제거.
                    break;
                }
                else if (deque.indexOf(number) <= deque.size() / 2) {
                    firstMethod(deque);                     // 비교하는 원소가 앞에서부터 가까우면 firstMethod 연산 실행.
                }
                else {
                    lastMethod(deque);                      // 비교하는 원소가 뒈에서부터 가까우면 LastMethod 연산 실행.
                }
            }
        }
        System.out.println(count);
    }
}