package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRG_120853 {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" "); // str 배열 생성
        // "1 2 Z 3"
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Z")) {
                if (i > 0) {
                    answer = answer - Integer.parseInt(str[i - 1]);
                }
            } else {
                answer = answer + Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}