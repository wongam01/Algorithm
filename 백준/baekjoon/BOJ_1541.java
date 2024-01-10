package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine(), "-"); // 뺄셈 기호로 분리
        while (st.hasMoreTokens()) {
            int addAll = 0;
            StringTokenizer addiction = new StringTokenizer(st.nextToken(), "+"); // 덧셈 기호로 다시 분리

            while (addiction.hasMoreTokens()) { // 각 덧셈 부분 계산
                addAll += Integer.parseInt(addiction.nextToken());
            }

            if (sum == Integer.MAX_VALUE) {
                sum = addAll;  // 첫 번째 토큰의 경우, sum에 addAll 할당
            } else {
                sum -= addAll;  // 그 이후 토큰들은 sum에서 빼줌
            }
        }
        System.out.println(sum);

    }
}
