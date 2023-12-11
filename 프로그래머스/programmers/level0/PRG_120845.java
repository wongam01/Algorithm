package programmers.level0;

public class PRG_120845 {
    public int solution(int[] box, int n) {
        int answer = 1;
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = box[i] / n;
            answer = answer * array[i];
        }
        return answer;
    }
}
