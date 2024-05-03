package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2033 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }
        int start = 0, end = 0, count = 0, sum = 0;
        while (true) {
            if (sum >= M) {
                sum = sum - A[start++];
            } else if (end == N) {
                break;
            } else if (sum < M) {
                sum = sum + A[end++];
            }
            if (sum == M) {
                count++;
            }
        }
        System.out.println(count);
    }
}
