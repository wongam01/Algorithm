package baekjoon.gold;

import java.util.Scanner;

public class BOJ_2023 {
    static int N;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    static void DFS(int number, int jarisu) {
        if (jarisu == N) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            return;
        }
        // 자리 수 다르면 다음 칸에 홀수 넣은뒤 소수 라면 다시 DFS
        for (int i = 1; i < 10; i++) {
            if (isPrime(10 * number + i)) {
                DFS(number * 10 + i, jarisu + 1);
            }
        }
    }
    static boolean isPrime(int num) { // 소수 인지 판별
        boolean correct = true;
        for (int i = 2; i < 10; i++) {
            if (num % i == 0) {
               correct = false;
            } else {
                correct = true;
            }
        }
        return correct;
    }

}
