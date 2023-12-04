package baekjoon.average;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 큐에 삽입
        for (int i = 0; i < N; i++) {
            queue.add(Double.valueOf(st.nextToken()));
        }
        double maxScore = queue.peek(); // 최댓값
        double sum = 0;

        // 값을 뽑아서 계산
        while (!queue.isEmpty()) {
            double score = queue.poll();
            sum += (score / maxScore) * 100;
        }

        double average = sum / N;
        bw.write(average + " ");
        bw.flush();
        bw.close();
    }
}
