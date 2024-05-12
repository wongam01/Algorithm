package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        int[] answer = new int[2];

        int minSum = Integer.MAX_VALUE;

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                answer[0] = arr[start];
                answer[1] = arr[end];
            }
            if (sum < 0)
                start++;
            else
                end--;
        }
        System.out.println(answer[0] + " " + answer[1]);
    }
}
