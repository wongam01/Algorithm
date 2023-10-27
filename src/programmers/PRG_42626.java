package programmers;

import java.util.*;

public class PRG_42626 {
    public int solution(int[] scovile, int k) {
        // 오름차순 정리
        Queue<Integer> queue = new PriorityQueue<>();

        for (Integer s : scovile) {
            // 빈 배열에 스코빌 지수 담기
            queue.add(s);
        }
        int answer = 0;
        while (queue.peek() < k) {
            if (queue.size() == 1) {
                return -1;
            }
        }
        int firstFood = queue.poll();
        int secondFood = queue.poll();

        int result = (firstFood + secondFood * 2);
        queue.add(result);
        answer++;
        return answer;
    }
}
