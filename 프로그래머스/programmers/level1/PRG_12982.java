package programmers.level1;

import java.util.Arrays;

public class PRG_12982 {
    public int solution(int[] d, int budget) {
        // return 최대 지원해 줄 수 있는 부서의 최대 개수
        // d = [1,3,2,5,4] -> [1,2,3,4,5]
        // budget = 9
        // 1 2 4 5 8 , 15
        // 정렬 후 반복문 통해 가장 작은 배열 부터 차례로 더해간 뒤 budget 이 넘게 되면 stop 후 다음 배열 차례로 넘어감
        // 더해준 개수를 센 뒤 가장 큰 수를 도출
        int result = 0;
        Arrays.sort(d); // 배열 정렬  [1,2,3,4,5] budget = 9
        int count = 0; // 작은것 부터 하나씩 빼며 카운트를 늘려줌
        for (int cost : d) {
            if (budget - cost >= 0) {
                budget = budget - cost;
                result++;
            } else {
                break;
            }
        }
        return result;
    }
}
