package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken()); // 3
        int end = Integer.parseInt(st.nextToken()); // 16
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
// 7일때
    public static boolean isPrime(int number) {
        if (number < 2) { // 1
            return false;
        }
        for (int i = 2; i * i <= number; i++) { // 2
            if (number % i == 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
