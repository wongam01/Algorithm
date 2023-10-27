package programmers;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PRG_42577 {
    public boolean solution(String[] phoneBook) {
        boolean answer = true;
        Map<String, Integer> map = new HashMap<>();
        // 전화번호 맵에 저장
        for (String nubmers : phoneBook) {
            map.put(nubmers, 0);
        }
        // 접두사 검사
        for (String numbers : phoneBook) {
            for (int i = 0; i < numbers.length(); i++) {
                if (map.containsKey(numbers.substring(0, i))) {
                    return false;
                }
            }
        }
        return answer;
    }
}
