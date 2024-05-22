package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_11724 {
    static ArrayList<Integer>[] A;
    static boolean visted[];

    static void DFS(int v) {
        if (visted[v]) { // 방문 한 경우
            return;
        }
        visted[v] = true;
        for (int i : A[v]) { // A[v] : 인접 노드들의 리스트
            if (visted[i] == false) {
                DFS(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        A = new ArrayList[N + 1];
        visted = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;

        for (int i = 0; i < N + 1; i++) {
            if (!visted[i]) {
                count++;
                DFS(i);
            }
        }
    }
}
