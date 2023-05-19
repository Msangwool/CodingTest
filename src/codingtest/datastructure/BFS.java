package codingtest.datastructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFS {
    static int[][] arr;
    static boolean[] visited;

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 정점의 개수
        int M = Integer.parseInt(st.nextToken());   // 간선의 개수
        int V = Integer.parseInt(st.nextToken());   // 탐색을 시작할 정점 번호

        //인접행렬 생성
        arr = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        visited = new boolean[N + 1];
        bfs(V);

        System.out.println(sb);
    }

    public static void bfs(int V) {
        Queue<Integer> que = new LinkedList<>();

        que.add(V);
        visited[V] = true;
        sb.append(V).append(" ");

        while(!que.isEmpty()) {
            int temp = que.poll();
            for(int i = 1; i < arr.length; i++) {
                if(arr[temp][i] == 1 && !visited[i]) {
                    que.add(i);
                    visited[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }
    }
}

