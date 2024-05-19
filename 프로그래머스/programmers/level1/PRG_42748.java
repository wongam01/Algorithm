package programmers.level1;

import java.util.Arrays;

public class PRG_42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 길이 =3
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            int[] subArray = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(subArray); // 정렬
            answer[i] = subArray[k - 1];
        }
        return answer;
    }
}
