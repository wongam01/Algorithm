package programmers.level1;

public class PRG_42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        // 여분과 reserve 가 같은 학생을 먼저 처리
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 잃어버린 학생들에게 여분을 빌려줄 수 있는 경우 처리
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                // 잃어버린 학생의 앞번호나 뒷번호가 여분을 가진 학생일 경우
                if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }

}
