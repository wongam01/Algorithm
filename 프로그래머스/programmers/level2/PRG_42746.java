package programmers.level2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class PRG_42746 {
    public String solution(int[] numbers) { // [6,10,2]
        String [] subArray = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            subArray[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(subArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        // 정렬 후 첫번째 배열값 = 0 -> 전체 원소 0
        if (subArray[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : subArray) {
            sb.append(s);
        }
        return sb.toString();
    }
}
