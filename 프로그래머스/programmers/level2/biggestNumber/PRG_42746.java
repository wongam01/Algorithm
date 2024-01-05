package programmers.level2.biggestNumber;
import java.util.Comparator;

public class PRG_42746 {
    // [6, 10, 2]
    // [2, 6, 10]
    public String solution(int[] numbers) {
        String str = "";
        // 문자열 변환
        String[] strArray = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strArray[i] = Integer.toString(numbers[i]);
        }
        // ["2","6","10"] -> "6210"
        // [3, 30, 34, 5, 9] -> [3,5,9,30,34]


    }
}
