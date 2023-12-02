package baekjoon;

import java.io.*;
import java.util.*;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine());
            remainders.add(number % 42);
        }
        System.out.println(remainders.size());
    }
}

