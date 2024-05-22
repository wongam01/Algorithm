package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> reverseList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0) {
                list.add(num);
            } else {
                list.add(num);
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        Collections.sort(reverseList);

        int sum = 0;
        int index = 0;

        while (list.size() > index) {
            if (index + 1 < list.size() && list.get(index) != 1 && list.get(index + 1) != 1) { // 1 포함 안할 때
                sum += list.get(index) * list.get(index + 1);
                index += 2;
            } else {
                sum += list.get(index) + list.get(index);
                index ++;
            }
        }
        index = 0;

        while (index < reverseList.size()) {
            if (index + 1 < reverseList.size()) {
                sum += reverseList.get(index) * reverseList.get(index + 1);
                index += 2;
            } else {
                sum += reverseList.get(index);
            }
        }
        System.out.println(sum);
    }
}
