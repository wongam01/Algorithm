package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N= Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] number = new Integer[N];
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(number, Collections.reverseOrder());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int coins = K / number[i];
            if (K / number[i] >= 1) {
                count += coins; // 몫 만큼 더해주기
                K -= coins * number[i];
                if (K == 0) {
                    break;
                }
            }
        }
        System.out.println(count);

    }
}
