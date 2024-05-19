package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class S {
  int day;
  int ww;

    public S(int d, int w) {
        this.day = d;
        this.ww= w;
    }
}
public class BOJ_13904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<S> sList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int ww = Integer.parseInt(st.nextToken());
            sList.add(new S(day, ww));
        }


        Collections.sort(sList, new Comparator<S>() {
            @Override
            public int compare(S o1, S o2) {
                return o2.ww - o1.ww; // 점수 내림차순 정렬
            }
        });

        boolean[] days = new boolean[1001];
        int totalScore = 0;

        for (S s : sList) {
            for (int i = s.day; i > 0; i++) {
                if (!days[i]) { // 해당 날짜에 배정 안된 경우
                    days[i] = true;
                    totalScore += s.ww;
                    break;
                }
            }
        }
        System.out.println(totalScore);
    }
}
