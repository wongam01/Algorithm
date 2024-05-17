package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class score {
    String name;
    int kor;
    int eng;
    int math;

    public score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
public class BOJ_10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<score> scoreList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            scoreList.add(new score(name, kor, eng, math));
        }
        Collections.sort(scoreList, new Comparator<score>() {
            @Override
            public int compare(score o1, score o2) {
                if (o1.kor != o2.kor) { // 국어 점수 다를 때
                    return Integer.compare(o2.kor, o1.kor); // 내림차순 
                } else if (o1.eng != o2.eng) { // 국어 같고 , 영어 다를 때
                    return Integer.compare(o1.eng, o2.eng);
                } else if (o1.math != o2.math) { // 국어 영어 같고 수학 다를 때
                    return Integer.compare(o2.math, o1.math);
                } else { // 모든게 같을 때
                    return o1.name.compareTo(o2.name);
                }
            }
        });
        for (score score : scoreList) {
            System.out.println(score.name);
        }
    }
}
