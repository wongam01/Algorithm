package programmers.level1;

import java.util.*;

public class PRG_77884 {
    public int solution(int left, int right) {
        int answer = 0;
        // 약수 = 1 ~ 자기 자신까지

        for (int i = left; i <= right ; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    set.add(j); // set에 약수 넣기
                }
            }
            if (set.size() % 2 == 0) { // 약수의 개수가 짝수
                answer = answer + i;
            } else {
                answer = answer - i;
            }
        }
        return answer;
    }
}
