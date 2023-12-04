package baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] array = new int[N];

        // 박스에 번호 적기
        for (int s = 0; s < N; s++) {
            array[s] = s + 1;
        }

        // i+1 = j
        // i+2 =j -> i랑 j만 교환
        // i+1 != j

        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine(), " ");

            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            while (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            // 출력
            for (int k = 0; k < N; k++) {
                bw.write(array[k] + " ");
            }
            bw.flush();
            bw.close();
        }
    }

}
