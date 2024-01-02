package programmers.level1;

import java.util.Arrays;

public class PRG_42748 {
    public int[] solution(int[] array, int[][] commands) {
        // array = [1, 5, 2, 6, 3, 7, 4],

        // i = 2, j = 5, k = 3  [i, j, k]
        // commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
        // i = commands[0][0] ,j = commands[0][1]
        // 1. 배열을 우선 i~j 번째 까지 자른다.
        // 2. 자른 배열을 정렬
        // 3. 정렬한 배열에서 K 번째의 수를 반환.
        int[] answer = new int[commands.length];

        for (int t = 0; t < commands.length; t++) {
            int a = commands[t][0];
            int b = commands[t][1];
            int c = commands[t][2];

            int[] slice = Arrays.copyOfRange(array, a - 1, b);
            Arrays.sort(slice);
            answer[t] = slice[c - 1];
        }
        return answer;
    }
}
