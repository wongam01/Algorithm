package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] array = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end = 0, sum = 0;
        int min_length = Integer.MAX_VALUE;

        while (end < N) {
            sum += array[end];
            while (sum >= S) {
                min_length = Math.min(min_length, end - start + 1);
                sum -= array[start++];
            }
            end++;
        }
        // min_length가 갱신되지 않은 경우 0 출력
        if (min_length == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(min_length);
        }
    }
}
