package programmers;
import java.util.*;

class PRG_42628 {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> queue = new PriorityQueue<>(); // 최솟값 우선 순위 큐
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder()); // 최댓값 우선 순위 큐

        for (String operation : operations) {
            char oper = operation.charAt(0);
            int num = Integer.parseInt(operation.substring(2, operation.length()));
            if (oper == 'I') {
                queue.add(num);
                maxQueue.add(num);
            } else if (oper == 'D' && !queue.isEmpty()) {
                if (num == 1) {
                    // 최댓값 삭제
                    removeMax(queue, maxQueue);
                } else {
                    // 최솟값 삭제
                    int minValue = queue.poll();
                    maxQueue.remove(minValue);
                }
            }
        }

        // 최댓값, 최소값 반환
        if (!queue.isEmpty()) {
            answer[1] = queue.poll();
            if (!queue.isEmpty()) {
                answer[0] = maxQueue.poll();
            } else {
                answer[0] = answer[1];
            }
        }
        return answer;
    }

    void removeMax(PriorityQueue<Integer> pq, PriorityQueue<Integer> maxPQ) {
        if (!maxPQ.isEmpty()) {
            int maxVal = maxPQ.poll();
            pq.remove(maxVal);
        }
    }
}
