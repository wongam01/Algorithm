package programmers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class PRG_42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);
        int n = completion.length;

        for (int i = 0; i < n; i++) {
            String a = participant[i];
            String b = completion[i];
            if (a.equals(b)) {
                continue;
            }
            return participant[i];
        }
        return participant[n];
    }
}
