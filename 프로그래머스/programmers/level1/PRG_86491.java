package programmers.level1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PRG_86491 {

    class Solution {
        public int solution(int[][] sizes) {
            int max_w = 0;
            int max_h = 0;

            for (int i = 0; i < sizes.length; i++) {
                Arrays.sort(sizes[i]); // 각 명함의 작은 값이 먼저 오도록 정렬
            }

            for (int i = 0; i < sizes.length; i++) {
                if (max_h < sizes[i][0])
                    max_h = sizes[i][0]; // 세로 길이 중 최댓값 구하기

                if (max_w < sizes[i][1])
                    max_w = sizes[i][1]; // 가로 길이 중 최댓값 구하기
            }

            return max_w * max_h;
        }
    }
}
