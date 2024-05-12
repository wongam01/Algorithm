package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = i;
        }

        int start = 1 , end = 1;
        int sum = 0, count = 0;

        while (start <= N) {
            if (sum < N) {
                sum = sum + end;
                end++;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else if (sum == N) {
                count++;
                sum -= start;
                start++;
            }
        }
        System.out.println(count);

    }
}
