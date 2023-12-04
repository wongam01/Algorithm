package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bucket = new int[N];

        // 배열 값 넣기
        for (int s = 0; s < N; s++) {
            bucket[s] = s + 1;
        }

        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            // 값 교환
            int temp = bucket[i]; // 1 저장
            bucket[i] = bucket[j];
            bucket[j] = temp;


        }
        for (int number : bucket) {
            bw.write(number + " ");
        }
        bw.flush();
        bw.close();

    }
}
