package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] array = new String[N];

        for (int i = 0; i < N; i++) {
            array[i] = br.readLine();
        }

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) { // 길이 같으면 사전순
                    return o1.compareTo(o2);
                } else { // 길이 다를 때는 짧은 것 부터
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        });

        // 중복 제거
        StringBuilder sb = new StringBuilder();
        String prev = "";
        for (String str : array) {
            if (!str.equals(prev)) {
                sb.append(str).append("\n");
                prev = str;
            }
        }
        System.out.println(sb.toString());
    }
}
