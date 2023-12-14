package programmers.level1;

public class PRG_82612 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum = sum + price * (i);
        }

        if (sum - money < 0) {
            return 0;
        } else if (sum - money > 0) {
            answer = sum - money;
        }
        return answer;
    }
}
