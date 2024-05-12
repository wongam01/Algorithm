package baekjoon.silver;

import javax.lang.model.type.ArrayType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        int count = 0, start = 0, end = n-1;

        Arrays.sort(A);

        while (start < end) {
            if (A[start] + A[end] == x) {
                count++;
                start++;
            } else if (A[start] + A[end] > x) {
                end--;
            } else if (A[start] + A[end] < x) {
                start++;
            }
        }

        System.out.println(count);
    }
}
